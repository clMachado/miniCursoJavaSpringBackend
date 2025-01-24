package com.clmDev.dslist_backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.clmDev.dslist_backend.classes.Documento;

public interface DocumentoRepository extends JpaRepository<Documento, Long> {

}
