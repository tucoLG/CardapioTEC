package com.br.cardapio.cardapiotec.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.cardapio.cardapiotec.model.Cardapio;
import com.br.cardapio.cardapiotec.service.CardapioService;

@RestController
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

        @PostMapping("/buscarCardapioPorIdSemana")
        public Cardapio buscarCardapioPorIdSemana(Long idSemana) {
            return cardapioService.buscarCardapioPorIdSemana(idSemana);
        } 

        @PostMapping("/buscarCardapioPorCafeManha")
        public Cardapio buscarCardapioPorCafeManha(String cafeManha) {
            return cardapioService.buscarCardapioPorCafeManha(cafeManha);
        }

        @PostMapping("/buscarCardapioPorAlmoco")
        public Cardapio buscarCardapioPorAlmoco(String almoco) {
            return cardapioService.buscarCardapioPorAlmoco(almoco);
        }

        @PostMapping("/buscarCardapioPorLancheTarde")
        public Cardapio buscarCardapioPorLancheTarde(String lancheTarde) {
            return cardapioService.buscarCardapioPorLancheTarde(lancheTarde);
        }

        @PostMapping("/buscarCardapioPorJantar")
        public Cardapio buscarCardapioPorJantar(String jantar) {
            return cardapioService.buscarCardapioPorJantar(jantar);
        }

        @PostMapping("/listarCardapios")
        public List<Cardapio> listarCardapios() {
            return cardapioService.listarCardarpios();
        }
}
