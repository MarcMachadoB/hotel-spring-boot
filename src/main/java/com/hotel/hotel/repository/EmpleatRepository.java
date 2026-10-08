package com.hotel.hotel.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hotel.hotel.model.Empleat;
import com.hotel.hotel.model.Usuari;

@Repository
public interface EmpleatRepository extends JpaRepository<Empleat, Long> {
    Optional<Empleat> findByid(Long id);
    Optional<Empleat> findByUsuari(Usuari usuari);
    Optional<Empleat> findByEmail(String email);
}
