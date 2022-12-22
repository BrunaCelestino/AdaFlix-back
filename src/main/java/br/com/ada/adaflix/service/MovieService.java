package br.com.ada.adaflix.service;

import br.com.ada.adaflix.model.Movie;
import br.com.ada.adaflix.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;

//    public MovieService(MovieRepository movieRepository) {
//        this.movieRepository = movieRepository;
//    }

    public Movie salvar(Movie movie) {
        return movieRepository.save(movie);
    }

    public List<Movie> listar() {
        return (List<Movie>) movieRepository.findAll();
    }

    public Movie buscarPorId(Long id) {
        return movieRepository.findById(id).orElse(null);
    }
}
