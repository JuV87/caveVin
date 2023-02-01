package fr.eni.spring.model;

import jakarta.persistence.*;
import lombok.Data;
import org.jetbrains.annotations.NotNull;

@Data
@Entity
@Table(name = "Vins")
public class Vin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    @NotNull
    private String nom;
    @Column
    private Integer millesime;
    @Column
    private Boolean petillant;
    @Column
    private Integer quantite;

    @ManyToOne
    private Couleur couleur;

    @ManyToOne
    private Region region;

    public Vin() {
    }

    public Vin(String nom, Integer millesime, Boolean petillant, Integer quantite, Couleur couleur, Region region) {
        this.nom = nom;
        this.millesime = millesime;
        this.petillant = petillant;
        this.quantite = quantite;
        this.couleur = couleur;
        this.region = region;
    }


    @Override
    public String toString() {
        return "Vin{" +
                "nom='" + nom + '\'' +
                ", millesime=" + millesime +
                ", petillant='" + petillant + '\'' +
                ", quantite=" + quantite +
                ", couleur='" + couleur + '\'' +
                ", region='" + region + '\'' +
                '}';
    }
}
