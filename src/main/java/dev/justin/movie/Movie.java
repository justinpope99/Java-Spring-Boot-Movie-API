package dev.justin.movie;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.util.List;

// We have to annotate this class as a document to let the Framework know that this class represents each document in the movies collection
// We will also declare the name of the collection as "movies"
@Document(collection = "movies")

// Instead of writing getters, setters, and .toString() for each property, we can just say @Data.
// This annotation comes from the Lombok project, and it takes care of all the getters, setters, and .toString() methods.
@Data
// This annotation for creating a constructor that takes all these private fields as arguments
@AllArgsConstructor
// Finally, we add the NoArgsConstructor which means another constructor that takes no parameters
@NoArgsConstructor
public class Movie {
    // We have to annotate ObjectId as Id to let the Framework know that this property should be treated as the unique identifier for each movie inside the database.
    @Id
    private ObjectId id;
    private String imdbId;
    private String title;
    private String releaseDate;
    private String trailerLink;
    private String poster;
    private List<String> genres;
    private List<String> backdrops;
    // This is an embedded relationship. All the review that are related, this movie will be added to this list of review.
    // This is a one-to-many relationship. Each movie can have many reviews.
    // @DocumentReference will cause the database to store only the Ids of the review, and the reviews will be in a separate collection. This is called a manual reference relationship
    @DocumentReference
    private List<Review> reviewIds;
}
