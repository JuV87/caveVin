package fr.eni.spring.repository;

import fr.eni.spring.model.Couleur;
import fr.eni.spring.model.Vin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CouleurRepo extends JpaRepository<Couleur, Integer> {
}
