package fr.eni.spring.repository;

import fr.eni.spring.model.Region;
import fr.eni.spring.model.Vin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegionRepo extends JpaRepository<Region, Integer> {
}
