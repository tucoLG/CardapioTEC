package com.br.cardapio.cardapiotec.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;



@Entity
@Table(name = "semana")
@Data
public class Semana {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_semana;

    @Column(name = "numero_semana", nullable = false)
    @NotBlank(message = "O número da semana é obrigatório")
    private int numero;

    @Column(name = "mes_semana", nullable = false)
    @NotBlank(message = "O mês da semana é obrigatório")
    private int mes;

    @Column(name = "ano_semana", nullable = false)
    @NotBlank(message = "O ano da semana é obrigatório")
    private int ano;
    
}
