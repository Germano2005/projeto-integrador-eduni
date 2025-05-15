package br.edu.ifsc.fln.projetointegradoreduni.models;


import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Conection {
    private Long id;
    private User seguidor;
    private User seguindo;
}
