package br.edu.ifsc.fln.projetointegradoreduni.models;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Getter @Setter
public class Post {
    private Long id;
    private String title;
    private String content;
    private LocalDate dateCreation;
    private User author;
    private Community community;
    private List<Comment> comments = new ArrayList<>();
    private List<Like> likes = new ArrayList<>();

}
