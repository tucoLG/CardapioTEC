package com.br.cardapio.cardapiotec.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.cardapio.cardapiotec.model.Semana;
import com.br.cardapio.cardapiotec.service.SemanaService;

@RestController
@RequestMapping("/semanas")
public class SemanaController {

        @Autowired
        private SemanaService semanaService;

    @PostMapping("/cadastrarSemana")
        public Semana cadastrarSemana (@RequestBody Semana semana) {
            return semanaService.cadastrarSemana(semana);
        }

    @PostMapping("/buscarSemanaPorNumero")
    public Semana buscarSemanaPorNumero(@RequestBody int numero) {
        return semanaService.buscarSemanaPorNumero(numero);
    }

    @PostMapping("/buscarSemanaPorMes")
    public Semana buscarSemanaPorMes(@RequestBody String mes) {
        return semanaService.buscarSemanaPorMes(mes);
    }

    @PostMapping("/buscarSemanaPorAno")
    public Semana buscarSemanaPorAno(@RequestBody int ano) {
        return semanaService.buscarSemanaPorAno(ano);
    }

    @PostMapping("/listarSemanas")
    public List<Semana> listarSemanas() {
        return semanaService.listarSemanas();
    }

}
