package com.br.cardapio.cardapiotec.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.cardapio.cardapiotec.model.Cardapio;
import com.br.cardapio.cardapiotec.repository.CardapioRepository;

@Service
public class CardapioService {

        @Autowired
        CardapioRepository cardapioRepository;

        public Cardapio cadastrarCardapio (Cardapio cardapio) {

            if(cardapioRepository.existsByNumeroSemanaAndDiaSemana(cardapio.getNumeroSemana(), cardapio.getDiaSemana())) {
                throw new IllegalArgumentException(
                    "Já existe um cardápio cadastrado para esta semana e dia."
                );
            }
            return cardapioRepository.save(cardapio);
        }

        public Cardapio buscarCardapioPorNumeroSemanaEDiaSemana(int numeroSemana, String diaSemana) {
            return cardapioRepository.findByNumeroSemanaAndDiaSemana(numeroSemana, diaSemana);
        }

        public Cardapio buscarCardapioPorIdSemana(Long idSemana) {
            return cardapioRepository.findByIdSemana(idSemana);
        }

        public Cardapio buscarCardapioPorCafeManha(String cafeManha) {
            return cardapioRepository.findByCafeManha(cafeManha);
        }

        public Cardapio buscarCardapioPorAlmoco(String almoco) {
            return cardapioRepository.findByAlmoco(almoco);
        }

        public Cardapio buscarCardapioPorLancheTarde(String lancheTarde) {
            return cardapioRepository.findByLancheTarde(lancheTarde);
        }

        public Cardapio buscarCardapioPorJantar(String jantar) {
            return cardapioRepository.findByJantar(jantar);
        }

        public List<Cardapio> listarCardarpios() {
            return cardapioRepository.findAll();
        }
}
