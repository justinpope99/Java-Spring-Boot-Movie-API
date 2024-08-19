package dev.justin.movie;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
// Any request to "/api/v1/movies" endpoint will be handled by this particular controller.
@RequestMapping("/api/v1/movies")
public class MovieController {

    // We need a reference to our service class, and we will initialize it with @Autowired.
    @Autowired
    private MovieService movieService;
    // We will create a new GET method.
    @GetMapping
    public ResponseEntity<List<Movie>> getAllMovies() {
        // This will get a request from the user and return a response.
        // It gets the list of movies from the service, and returns them with an HttpStatus.
        return new ResponseEntity<List<Movie>>(movieService.allMovies(), HttpStatus.OK);
    }

    // This GetMapping will search a single movie by its id.
    @GetMapping("/{imdbId}")
    // PathVariable lets the Framework know that we are passing the information we got in the mapping as a path variable and want to convert it to an ObjectId.
    public ResponseEntity<Optional<Movie>> getSingleMovie(@PathVariable String imdbId) {
        return new ResponseEntity<Optional<Movie>>(movieService.singleMovie(imdbId), HttpStatus.OK);
    }
}
