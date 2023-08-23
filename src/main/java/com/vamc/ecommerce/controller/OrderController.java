package com.vamc.ecommerce.controller;

import com.vamc.ecommerce.exception.OrderException;
import com.vamc.ecommerce.exception.UserException;
import com.vamc.ecommerce.model.Address;
import com.vamc.ecommerce.model.Order;
import com.vamc.ecommerce.model.User;
import com.vamc.ecommerce.service.OrderService;
import com.vamc.ecommerce.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/orders")
public class OrderController {
	
	private OrderService orderService;
	private UserService userService;
	
	public OrderController(OrderService orderService,UserService userService) {
		this.orderService=orderService;
		this.userService=userService;
	}
	
	@PostMapping("/")
	public ResponseEntity<Order> createOrderHandler(@RequestBody Address spippingAddress,
			@RequestHeader("Authorization")String jwt) throws UserException{
		
		User user=userService.findUserProfileByJwt(jwt);
		Order order =orderService.createOrder(user, spippingAddress);
		
		return new ResponseEntity<Order>(order,HttpStatus.OK);
		
	}
	
	@GetMapping("/user")
	public ResponseEntity< List<Order>> usersOrderHistoryHandler(@RequestHeader("Authorization") 
	String jwt) throws OrderException, UserException{
		
		User user=userService.findUserProfileByJwt(jwt);
		List<Order> orders=orderService.usersOrderHistory(user.getId());
		return new ResponseEntity<>(orders,HttpStatus.ACCEPTED);
	}
	
	@GetMapping("/{orderId}")
	public ResponseEntity< Order> findOrderHandler(@PathVariable Long orderId, @RequestHeader("Authorization") 
	String jwt) throws OrderException, UserException{
		
		User user=userService.findUserProfileByJwt(jwt);
		Order orders=orderService.findOrderById(orderId);
		return new ResponseEntity<>(orders,HttpStatus.ACCEPTED);
	}

}
