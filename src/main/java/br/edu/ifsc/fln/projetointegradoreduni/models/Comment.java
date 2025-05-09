package br.edu.ifsc.fln.projetointegradoreduni.models;

import jdk.jfr.StackTrace;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter @Setter
public class Comment {
    private Long id;
    private String content;
    private String author;
    private LocalDate DateCriation;
}
