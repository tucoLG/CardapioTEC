package com.br.cardapio.cardapiotec.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.br.cardapio.cardapiotec.model.Cardapio;

@Repository
public interface CardapioRepository extends JpaRepository<Cardapio, Long> {


    boolean existsByNumeroSemanaAndDiaSemana(int numeroSemana, String diaSemana);
    Cardapio findByNumeroSemanaAndDiaSemana(int numeroSemana, String diaSemana);
    Cardapio findByIdSemana(Long idSemana);
    Cardapio findByCafeManha(String cafeManha);
    Cardapio findByAlmoco(String almoco);
    Cardapio findByLancheTarde(String lancheTarde);
    Cardapio findByJantar(String jantar);


}
