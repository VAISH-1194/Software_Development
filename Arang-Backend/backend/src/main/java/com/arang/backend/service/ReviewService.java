package com.arang.backend.service;

import com.arang.backend.model.Review;
import com.arang.backend.model.Users;
import com.arang.backend.repo.ReviewRepo;
import com.arang.backend.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
