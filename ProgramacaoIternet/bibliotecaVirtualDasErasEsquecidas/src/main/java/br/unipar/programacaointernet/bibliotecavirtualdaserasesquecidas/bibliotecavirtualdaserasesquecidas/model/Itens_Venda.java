package br.unipar.programacaointernet.bibliotecavirtualdaserasesquecidas.bibliotecavirtualdaserasesquecidas.model;

import jakarta.persistence.*;

public class Itens_Venda {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer integer;

    @Column(length = 60)
    private String descricao;


    @Column(length = 120)
    private boolean estouLendo;

    @Column(length = 20)
    private String arquivo;

    @ManyToOne
    private Cliente cliente;

    @ManyToOne
    private Produto produto;

}
