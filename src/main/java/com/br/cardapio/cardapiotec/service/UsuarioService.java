package com.br.cardapio.cardapiotec.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.cardapio.cardapiotec.model.Usuario;
import com.br.cardapio.cardapiotec.repository.UsuarioRepository;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public boolean cadastrarUsuario (String email, String senha) {
        Usuario usuario = new Usuario();
        usuario.setEmail(email);
        usuario.setSenha(senha);
        return usuarioRepository.save(usuario) != null ;
    }

    public boolean loginUsuario(String email, String senha) {
        Usuario usuario = usuarioRepository.findByEmail(email);

        if (usuario != null) {
            return true;
        } else {
            return false;
        }
    }
    
}
