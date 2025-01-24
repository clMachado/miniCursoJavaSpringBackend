package com.clmDev.dslist_backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.clmDev.dslist_backend.classes.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

}
