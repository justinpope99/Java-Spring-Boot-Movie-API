package dev.justin.movie;

import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

// Annotate as a Repository
@Repository
// We need to fill in the data type, and the Id type for MongoRepository<>
public interface MovieRepository extends MongoRepository<Movie, ObjectId> {
    // This method will allow us to find a movie using an imbdId
    // The IDE is very intelligent, and it knows what we want to do without writing any additional code
    Optional<Movie> findMovieByImdbId(String imdbId);
}
