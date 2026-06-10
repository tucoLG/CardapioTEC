package com.br.cardapio.cardapiotec.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.br.cardapio.cardapiotec.model.Cardapio;
import com.br.cardapio.cardapiotec.service.CardapioService;

@Controller
@RequestMapping("/cardapios")
public class CardapioController {

        @Autowired
        private CardapioService cardapioService;
        
        @PostMapping("/cadastrarCardapio")
        public Cardapio cadastrarCardapio(Cardapio cardapio) {
            return cardapioService.cadastrarCardapio(cardapio);
        }

        @PostMapping("/buscarCardapio")
        public Cardapio buscarCardapioPorNumeroSemanaEDiaSemana(int numeroSemana, String diaSemana) {
            return cardapioService.buscarCardapioPorNumeroSemanaEDiaSemana(numeroSemana, diaSemana);
        }

        @PostMapping("/buscarPorIdSemana")
        public Cardapio buscarCardapioPorIdSemana(Long idSemana) {
            return cardapioService.buscarCardapioPorIdSemana(idSemana);
        } 

        @PostMapping("/buscarCafeManha")
        public Cardapio buscarCardapioPorCafeManha(String cafeManha) {
            return cardapioService.buscarCardapioPorCafeManha(cafeManha);
        }

        @PostMapping("/buscarPorAlmoco")
        public Cardapio buscarCardapioPorAlmoco(String almoco) {
            return cardapioService.buscarCardapioPorAlmoco(almoco);
        }

        @PostMapping("/buscarPorLancheTarde")
        public Cardapio buscarCardapioPorLancheTarde(String lancheTarde) {
            return cardapioService.buscarCardapioPorLancheTarde(lancheTarde);
        }

        @PostMapping("/buscarPorJantar")
        public Cardapio buscarCardapioPorJantar(String jantar) {
            return cardapioService.buscarCardapioPorJantar(jantar);
        }

        @GetMapping("/listar")
        public String exibirCardapios(Model model){

            List<Cardapio> cardapios = cardapioService.listarCardapios();

            model.addAttribute("listarCardapios", cardapios);
            
            return "inicial";
        }
        
}
