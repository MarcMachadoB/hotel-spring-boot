package com.hotel.hotel.repository;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hotel.hotel.model.Client;
import com.hotel.hotel.model.Usuari;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {
    Optional<Client> findByid(Long id);
    Optional<Client> findByNom(String nom);
    Client findByUsuari(Usuari usuari); 
    Optional<Client> findByEmail(String email);
}
