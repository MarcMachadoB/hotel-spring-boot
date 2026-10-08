package com.hotel.hotel.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hotel.hotel.model.Valoracio;

@Repository
public interface ValoracioRepository extends JpaRepository<Valoracio, Long> {
    Optional<Valoracio> findByid(Long id);

    
}
