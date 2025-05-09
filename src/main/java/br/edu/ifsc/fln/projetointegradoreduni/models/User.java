package br.edu.ifsc.fln.projetointegradoreduni.models;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter @Setter
public class User {
    private Long id;
    private String username;
    private String email;
    private String password;
    private String biografia;
    private List<String> competencias = new ArrayList<>();

    private List<String> cursos = new ArrayList<>();
}
