package com.vamc.ecommerce.service;

import com.vamc.ecommerce.exception.ProductException;
import com.vamc.ecommerce.model.Review;
import com.vamc.ecommerce.model.User;
import com.vamc.ecommerce.request.ReviewRequest;

import java.util.List;

public interface ReviewService {

	public Review createReview(ReviewRequest req,User user) throws ProductException;
	
	public List<Review> getAllReview(Long productId);
	
	
}
