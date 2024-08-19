package dev.justin.movie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

@Service
public class ReviewService {
    // We have to insert this review object into the database, so we need a reference to our ReviewRepository.
    @Autowired
    private ReviewRepository reviewRepository;

    // You can talk to a database using a Repository or a Template.
    @Autowired
    private MongoTemplate mongoTemplate;

    // First, we will look for the movie with the given imdbId.
    // Then, we will create a new review and associate that review with the found movie.
    public Review createReview(String reviewBody, String imdbId) {
        // Here, we are inserting the review into the database, and we will save the review on insert().
        // When you call insert(), it returns the data that you just pushed inside your database.
        Review review = reviewRepository.insert(new Review(reviewBody));

        // Now, we have to associate this review to one of the movies. To do this, we need a template.
        // Here, we are using the template to perform an update call on the movie class.
        mongoTemplate.update(Movie.class)
                // We have to perform the matching. We are updating a movie where the imdbId of the movie in the database
                // matches the imdbId that we have received from the user.
                .matching(Criteria.where("imdbId").is(imdbId))
                // We want to apply this update. To do so, we call apply().
                // Then, we create a new update definition which does the job of making the change inside the database.
                .apply(new Update().push("reviewIds").value(review))
                // Finally, we will say .first() to make sure we are getting a single movie, and we are updating that.
                .first();

        // Now, we can return the review we just created.
        return review;
    }
}
