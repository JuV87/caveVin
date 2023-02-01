package fr.eni.spring.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "Regions")
public class Region {

    private String nom;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Region(String nom) {
        this.nom = nom;
    }

    public Region() {
    }
}
