package fr.eni.spring.model;

import jakarta.persistence.*;
import lombok.Data;
@Data
@Entity
@Table(name = "Couleurs")
public class Couleur {

    private String nom;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    public Couleur(String nom) {
        this.nom = nom;
    }

    public Couleur() {

    }
}
