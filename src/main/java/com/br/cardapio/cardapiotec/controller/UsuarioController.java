package com.br.cardapio.cardapiotec.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.br.cardapio.cardapiotec.service.UsuarioService;

@Controller
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("/login")
    public String login(){
        return "index";
    }

     @PostMapping("/login")
    public String loginUsuario(@RequestParam ("email") String email, @RequestParam ("senha") String senha, Model model) {
      boolean loginSucesso = usuarioService.loginUsuario(email, senha);

      if (loginSucesso) {
          return "redirect:/cardapios/listar"; // Redireciona para a página do cardápio
      } else {
          model.addAttribute("error", "Email ou senha inválidos");
          return "index"; // Retorna null ou redireciona para uma página de erro
      }
    }

    @GetMapping("/cadastrarUsuario")
    public String cadastrarUsuario(){
        return "cadastro";
    }

    @PostMapping("/cadastrarUsuario")
    public String cadastrarUsuario(@RequestParam ("email") String email, @RequestParam ("senha") String senha) {
        boolean cadastro = usuarioService.cadastrarUsuario(email, senha);    
        
        if (cadastro) {
            return "redirect:/login";
        }
        return "redirect:/cadastrarUsuario"; 
    }

}
