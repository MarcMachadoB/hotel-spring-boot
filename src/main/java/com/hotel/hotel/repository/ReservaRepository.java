package com.hotel.hotel.repository;


import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hotel.hotel.model.Client;
import com.hotel.hotel.model.Habitacio;
import com.hotel.hotel.model.Reserva;

@Repository
public interface ReservaRepository extends JpaRepository<Reserva, Long> {
    Optional<Reserva> findByid(Long id);
    List<Reserva> findByClient(Client client);
    List<Reserva> findByHabitacio(Habitacio habitacio);
}