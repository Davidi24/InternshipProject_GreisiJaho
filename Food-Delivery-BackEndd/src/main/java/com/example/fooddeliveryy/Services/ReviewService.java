package com.example.fooddeliveryy.Services;

import com.example.fooddeliveryy.Entities.Rastaurant;
import com.example.fooddeliveryy.Entities.Review;
import com.example.fooddeliveryy.Repositories.ReviewRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ReviewService {
    private final ReviewRepository reviewRepository;

    public ReviewService(ReviewRepository reviewRepository) {
        this.reviewRepository = reviewRepository;
    }

    public Review createReview(Review review) {
        if (review != null) {
           return reviewRepository.save(review);
        }
        return null;
    }



    public List<Review> getReviewsGreaterThanFive() {
        List<Review> reviewsGreaterFive = reviewRepository.findReviewsGreaterThanFiveWithLimit();
        if (reviewsGreaterFive.size() <= 20) {
            return null;
        }
        return reviewsGreaterFive;
    }

    public List<Review> getAllReview() {

        return reviewRepository.findAll();
    }

}
