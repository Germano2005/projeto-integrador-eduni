package br.edu.ifsc.fln.projetointegradoreduni.models;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter @Setter
public class Community {
    private Long id;
    private String name;
    private String description;
    private String rules;
    private User creator;
    private List<User> members = new ArrayList<>();
}
