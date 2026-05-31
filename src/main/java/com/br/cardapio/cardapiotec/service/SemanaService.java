package com.br.cardapio.cardapiotec.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.br.cardapio.cardapiotec.model.Semana;
import com.br.cardapio.cardapiotec.repository.SemanaRepository;

@Service
public class SemanaService {

    @Autowired
    SemanaRepository semanaRepository;

   public Semana cadastrarSemana(Semana semana) {

    if (semanaRepository.existsByNumeroAndMesAndAno
        (semana.getNumero(),
         semana.getMes(), 
         semana.getAno())) {

        throw new IllegalArgumentException(
            "Esta semana já está cadastrada."
        );
    }

    return semanaRepository.save(semana);
}

    public Semana buscarSemanaPorNumero(int numero) {
        return semanaRepository.findByNumero(numero);
    }

    public Semana buscarSemanaPorMes(String mes) {
        return semanaRepository.findByMes(mes);
    }

    public Semana buscarSemanaPorAno(int ano) {
        return semanaRepository.findByAno(ano);
    }

    public List<Semana> listarSemanas() {
        return semanaRepository.findAll();
    }
}
