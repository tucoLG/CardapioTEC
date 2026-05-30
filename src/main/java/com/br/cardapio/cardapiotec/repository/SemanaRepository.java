package com.br.cardapio.cardapiotec.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.br.cardapio.cardapiotec.model.Semana;

@Repository
public interface SemanaRepository extends JpaRepository<Semana, Long> {

}
