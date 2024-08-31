package dev.justin.movie;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/reviews")
public class ReviewController {
    @Autowired
    private ReviewService reviewService;

    // We will only have one Post method
    @PostMapping
    // We are saying to the Framework, whatever we get as the RequestBody, we would like to convert it
    // to a map of the Key String and Value String, and we want to name this map "payload".
    public ResponseEntity<Review> createReview(@RequestBody Map<String, String> payload) {
        // We want to create a new review, so we will send 201 instead of the plain 200 for the HttpStatus.
        // The data received from the user will be placed into the Map.
        return new ResponseEntity<>(reviewService.createReview(payload.get("reviewBody"), payload.get("imdbId")), HttpStatus.CREATED);
    }
}
