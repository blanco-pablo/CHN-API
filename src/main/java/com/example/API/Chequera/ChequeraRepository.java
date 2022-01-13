package com.example.API.Chequera;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChequeraRepository
        extends JpaRepository<Chequera, Integer> {

}
