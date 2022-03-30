package com.example.dynamodb.springbootdynamodbcrud.model;

public class MovieRole {
    private String movie;
    private String role;

    public MovieRole(String movie, String role) {
        this.movie = movie;
        this.role = role;
    }

    public String getMovie() {
        return movie;
    }

    public void setMovie(String movie) {
        this.movie = movie;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

}
