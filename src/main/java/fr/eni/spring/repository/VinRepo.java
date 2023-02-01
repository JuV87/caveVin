package fr.eni.spring.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import fr.eni.spring.model.Vin;


public interface VinRepo extends JpaRepository<Vin, Integer> {
}




