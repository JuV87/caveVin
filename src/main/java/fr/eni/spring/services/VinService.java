package fr.eni.spring.services;

import fr.eni.spring.model.Vin;

import java.util.List;


public interface VinService {

    List<Vin> getVins();

    Vin getVinById(int id);

    void ajouterVin(Vin vin);

    void modifierVin(Vin vin);

    void supprimerVin(int id);

}
