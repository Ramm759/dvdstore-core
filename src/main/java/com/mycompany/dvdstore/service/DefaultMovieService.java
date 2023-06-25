package com.mycompany.dvdstore.service;

import com.mycompany.dvdstore.entity.Movie;
import com.mycompany.dvdstore.repository.MovieRepositoryInterface;
import org.springframework.stereotype.Service;

@Service
public class DefaultMovieService implements MovieServiceInterface{

    // @Autowired
    private final MovieRepositoryInterface movieRepository;

    public DefaultMovieService(MovieRepositoryInterface movieRepository) {
        this.movieRepository = movieRepository;
    }

    public void registerMovie(Movie movie){

        movieRepository.add(movie);
    }
}
