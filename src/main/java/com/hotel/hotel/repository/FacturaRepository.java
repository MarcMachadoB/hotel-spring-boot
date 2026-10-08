package com.hotel.hotel.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hotel.hotel.model.Factura;

@Repository
public interface FacturaRepository extends JpaRepository<Factura, Long> {
    Optional<Factura> findByid(Long id);
    

}
