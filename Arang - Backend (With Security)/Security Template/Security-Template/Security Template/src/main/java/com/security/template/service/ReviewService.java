package com.security.template.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.security.template.model.Review;
import com.security.template.model.Users;
import com.security.template.repo.ReviewRepo;
import com.security.template.repo.UserRepo;

import java.util.List;

@Service
public class ReviewService {

    @Autowired
    private ReviewRepo reviewRepo;

    @Autowired
    private UserRepo userRepo;

    public Review addReview(Review review, Long userId) {
        Users user = userRepo.findById(userId).orElse(null);
        if(user == null)
            return null;
        review.setUser(user);
        return reviewRepo.save(review);
    }

    public List<Review> getAllReview() {
        return reviewRepo.findAll();
    }
}
