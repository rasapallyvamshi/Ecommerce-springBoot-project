package com.vamc.ecommerce.service;

import com.vamc.ecommerce.exception.CartItemException;
import com.vamc.ecommerce.exception.UserException;
import com.vamc.ecommerce.model.Cart;
import com.vamc.ecommerce.model.CartItem;
import com.vamc.ecommerce.model.Product;

public interface CartItemService {
	
	public CartItem createCartItem(CartItem cartItem);
	
	public CartItem updateCartItem(Long userId, Long id,CartItem cartItem) throws CartItemException, UserException;
	
	public CartItem isCartItemExist(Cart cart,Product product,String size, Long userId);
	
	public void removeCartItem(Long userId,Long cartItemId) throws CartItemException, UserException;
	
	public CartItem findCartItemById(Long cartItemId) throws CartItemException;
	
}
