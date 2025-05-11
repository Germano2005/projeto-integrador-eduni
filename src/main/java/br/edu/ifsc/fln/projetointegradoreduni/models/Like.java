package br.edu.ifsc.fln.projetointegradoreduni.models;

import lombok.Getter;
import lombok.Setter;
import java.time.LocalDate;

@Getter @Setter
public class Like {
    private Long id;
    private User user;
    private LocalDate date;
}
