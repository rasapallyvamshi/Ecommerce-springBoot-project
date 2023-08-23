package com.vamc.ecommerce.service;

import com.vamc.ecommerce.exception.ProductException;
import com.vamc.ecommerce.model.Cart;
import com.vamc.ecommerce.model.User;
import com.vamc.ecommerce.request.AddItemRequest;

public interface CartService {
	
	public Cart createCart(User user);
	
	public String addCartItem(Long userId,AddItemRequest req) throws ProductException;
	
	public Cart findUserCart(Long userId);

}
