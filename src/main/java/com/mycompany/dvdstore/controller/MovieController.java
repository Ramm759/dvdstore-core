package com.mycompany.dvdstore.controller;

import com.mycompany.dvdstore.entity.Movie;
import com.mycompany.dvdstore.service.MovieServiceInterface;
import org.springframework.stereotype.Controller;

import java.util.Scanner;

@Controller
public class MovieController {

    // @Autowired
    private final MovieServiceInterface movieService;

    public MovieController(MovieServiceInterface movieService) {
        this.movieService = movieService;
    }

    public void addUsingConsole() {
        System.out.println("What is the movie title?");
        Scanner scanner = new Scanner(System.in);
        String title = scanner.nextLine();
        System.out.println("What is the movie genre?");
        String genre = scanner.nextLine();
        Movie movie = new Movie();
        movie.setTitle(title);
        movie.setGenre(genre);
        movieService.registerMovie(movie);
    }

}
