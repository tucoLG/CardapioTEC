package com.br.cardapio.cardapiotec.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;



@Entity
@Table(name = "cardapio")
@Data
public class Cardapio {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id_cardapio;

    @Column(name = "numero_semana", nullable = false)
    @NotBlank(message = "O número da semana é obrigatório")
    private int numeroSemana;

    @Column(name = "dia_semana", nullable = false)
    @NotBlank(message = "O dia da semana é obrigatório")
    private String diaSemana;
    
    @ManyToOne // Relacionamento com a entidade Semana
    @JoinColumn(name = "id_semana", nullable = false)
    @NotBlank(message = "A semana é obrigatória")
    private Semana idSemana;

    @Column(name = "cafe_manha", nullable = false)
    @NotBlank(message = "O café da manhã é obrigatório")
    private String cafeManha;

    @Column(name = "almoco", nullable = false)
    @NotBlank(message = "O almoço é obrigatório")
    private String almoco;

    @Column(name = "lanche_tarde", nullable = false)
    @NotBlank(message = "O lanche da tarde é obrigatório")
    private String lancheTarde;

    @Column(name = "jantar", nullable = false)
    @NotBlank(message = "O jantar é obrigatório")
    private String jantar;
}
