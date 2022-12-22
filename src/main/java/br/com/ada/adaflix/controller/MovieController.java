package br.com.ada.adaflix.controller;

import br.com.ada.adaflix.model.Movie;
import br.com.ada.adaflix.service.MovieService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MovieController {

    private final MovieService movieService;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @PostMapping("/movies")
    public Movie salvar(@RequestBody Movie movie) {
        return movieService.salvar(movie);
    }

    @GetMapping("/movies")
    public List<Movie> listar() {
        return movieService.listar();
    }

    @GetMapping("/{id}")
    public Movie buscarPorId(@PathVariable Long id) {
        return movieService.buscarPorId(id);
    }
}
