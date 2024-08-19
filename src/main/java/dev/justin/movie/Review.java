package dev.justin.movie;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

// We haven't created this collection yet, but the application itself has the ability to create new collections.
@Document(collection = "reviews")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Review {
    @Id
    private ObjectId id;
    private String body;

    // We cannot pass ids as they are automatically generated, so we will create a custom constructor that takes only the body.
    public Review(String body) {
        this.body = body;
    }
}
