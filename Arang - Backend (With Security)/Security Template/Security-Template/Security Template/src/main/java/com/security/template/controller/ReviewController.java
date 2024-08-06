package com.security.template.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.security.template.model.Review;
import com.security.template.service.ReviewService;

import java.util.List;

@RestController
@RequestMapping("/api/v3")
public class ReviewController {

    @Autowired
    private ReviewService reviewService;

//    @PostMapping("/add/review")
//    public Review addReview(@RequestBody Review review)
//    {
//        return reviewService.addReview(review);
//    }

    @PostMapping("/add/review/{userId}")
    public Review addReview(@RequestBody Review review, @PathVariable Long userId)
    {
        return reviewService.addReview(review, userId);
    }

    @GetMapping("/get/all/review")
    public List<Review> getAllReview() {return reviewService.getAllReview(); }
}
