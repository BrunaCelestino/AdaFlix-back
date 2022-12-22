package br.com.ada.adaflix.repository;
import br.com.ada.adaflix.model.Movie;
import org.springframework.data.repository.CrudRepository;

public interface MovieRepository extends CrudRepository<Movie, Long> {
}