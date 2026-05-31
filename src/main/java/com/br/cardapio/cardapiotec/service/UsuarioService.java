package com.br.cardapio.cardapiotec.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.cardapio.cardapiotec.model.Usuario;
import com.br.cardapio.cardapiotec.repository.UsuarioRepository;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public Usuario cadastrarUsuario (Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    public Usuario loginUsuario (String email, String senha){
       Usuario usuario = usuarioRepository.findByEmail(email);

       if (usuario != null && usuario.getSenha().equals(senha)) {
           return usuario;
       } else {
           return null; // Retorna null se o login falhar
       }
    }

    
}
