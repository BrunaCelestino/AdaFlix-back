package br.com.ada.adaflix.model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name="Movies")
public class Movie {
    @Id
    @GeneratedValue
    private Long id;

    @Column(unique = true)
    private String name;

    @Column(length = 500)
    private String description;
    private String duration;

    private String genre;
    private String director;
    private LocalDateTime releaseDate;
    private Double price;
    private Long capacity;
    private LocalDateTime beginSalesDate;
    private LocalDateTime endSalesDate;
    private String tag;


    public Movie(){

    }

    public Movie(Long id, String name, String description, String duration, String genre, String director, LocalDateTime releaseDate, Double price, Long capacity, LocalDateTime beginSalesDate, LocalDateTime endSalesDate, String tag) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.duration = duration;
        this.genre = genre;
        this.director = director;
        this.releaseDate = releaseDate;
        this.price = price;
        this.capacity = capacity;
        this.beginSalesDate = beginSalesDate;
        this.endSalesDate = endSalesDate;
        this.tag = tag;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public LocalDateTime getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDateTime releaseDate) {
        this.releaseDate = releaseDate;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Long getCapacity() {
        return capacity;
    }

    public void setCapacity(Long capacity) {
        this.capacity = capacity;
    }

    public LocalDateTime getBeginSalesDate() {
        return beginSalesDate;
    }

    public void setBeginSalesDate(LocalDateTime beginSalesDate) {
        this.beginSalesDate = beginSalesDate;
    }

    public LocalDateTime getEndSalesDate() {
        return endSalesDate;
    }

    public void setEndSalesDate(LocalDateTime endSalesDate) {
        this.endSalesDate = endSalesDate;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }
}
