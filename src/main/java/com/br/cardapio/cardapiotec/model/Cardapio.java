package com.br.cardapio.cardapiotec.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;


@Entity
@Table(name = "cardapio")
@Data
public class Cardapio {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id_cardapio;

    @Column(name = "numero_semana", nullable = false)
    private int numeroSemana;

    @Column(name = "dia_semana", nullable = false)
    private String diaSemana;
    
    @ManyToOne // Relacionamento com a entidade Semana
    @JoinColumn(name = "id_semana", nullable = false)
    private Semana idSemana;

    @Column(name = "cafe_manha", nullable = false)
    private String cafeManha;

    @Column(name = "almoco", nullable = false)
    private String almoco;

    @Column(name = "lanche_tarde", nullable = false)
    private String lancheTarde;

    @Column(name = "jantar", nullable = false)
    private String jantar;
}
