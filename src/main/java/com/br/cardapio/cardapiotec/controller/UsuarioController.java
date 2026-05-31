package com.br.cardapio.cardapiotec.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.cardapio.cardapiotec.model.Usuario;
import com.br.cardapio.cardapiotec.service.UsuarioService;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @PostMapping("/cadastrarUsuario")
    public Usuario cadastrarUsuario(@RequestBody Usuario usuario) {
        return usuarioService.cadastrarUsuario(usuario);    
    }

    @PostMapping("/loginUsuario")
    public Usuario loginUsuario(@RequestBody Usuario usuario) {
        return usuarioService.loginUsuario(usuario.getEmail(), usuario.getSenha());
    }
}
