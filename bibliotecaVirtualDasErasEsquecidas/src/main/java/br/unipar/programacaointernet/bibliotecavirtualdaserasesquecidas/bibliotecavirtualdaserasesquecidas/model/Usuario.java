package br.unipar.programacaointernet.bibliotecavirtualdaserasesquecidas.bibliotecavirtualdaserasesquecidas.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer integer;

    @Column(length = 60)
    private String nome;


    @Column(length = 10)
    private Integer idade;


}
