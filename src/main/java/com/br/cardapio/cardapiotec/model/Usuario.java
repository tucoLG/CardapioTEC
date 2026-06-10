package com.br.cardapio.cardapiotec.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;



@Entity
@Table(name = "usuario")
@Data
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_usuario;

    @Column(name = "tipo_usuario", nullable = false)
    private String tipo;
    
    @Column(name = "nome_usuario", nullable = false)
    @NotBlank(message = "O nome do usuário é obrigatório")
    @Size(min=5,max = 100, message = "o nome do usuário deve conter no máximo 100 caracteres")
    private String nome;

    @Column(name = "email_usuario", nullable = false, unique = true)
    @NotBlank(message = "O email do usuário é obrigatório")
    @Email(message = "O email do usuário deve ser válido")
    private String email;

    @Column(name = "senha_usuario", nullable = false, unique = true)
    @NotBlank(message = "A senha do usuário é obrigatória")
    @Size(min=8,max=20, message = "A senha do usuário deve conter entre 8 e 20 caracteres")
    private String senha;

}
