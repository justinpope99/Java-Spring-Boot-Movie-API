package dev.justin.movie;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieService {
    // We are using Autowired to let the Framework know that we want the Framework to instantiate this class (MovieRepository) for us.
    @Autowired
    // Inside the service class, you will need a reference of the repository.
    private MovieRepository movieRepository;
    // Inside this class, we will write the database access methods.
    public List<Movie>  allMovies() {
        // This findAll() method is described inside the MongoRepository Class.
        return movieRepository.findAll();
    }

    // The findById method may have an id passed that doesn't exist. In this case, it will have to return null. To do this we will say Optional<Movie>.
    public Optional<Movie> singleMovie(String imdbId) {
        return movieRepository.findMovieByImdbId(imdbId);
    }
}
