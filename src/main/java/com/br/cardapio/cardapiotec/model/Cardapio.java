package com.br.cardapio.cardapiotec.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
    private int numero_semana;

    @Column(name = "dia_semana", nullable = false)
    private String dia_semana;
    
    @ManyToOne // Relacionamento com a entidade Semana
    @Column(name = "semana_id", nullable = false)
    private Semana semana_id;

    @Column(name = "cafe_manha", nullable = false)
    private String cafe_manha;

    @Column(name = "almoco", nullable = false)
    private String almoco;

    @Column(name = "lanche_tarde", nullable = false)
    private String lanche_tarde;

    @Column(name = "jantar", nullable = false)
    private String jantar;
}
