package com.vamc.ecommerce.service;

import com.vamc.ecommerce.exception.ProductException;
import com.vamc.ecommerce.model.Rating;
import com.vamc.ecommerce.model.User;
import com.vamc.ecommerce.request.RatingRequest;

import java.util.List;

public interface RatingServices {
	
	public Rating createRating(RatingRequest req,User user) throws ProductException;
	
	public List<Rating> getProductsRating(Long productId);

}
