package fr.eni.spring.services;

import fr.eni.spring.model.Couleur;
import fr.eni.spring.model.Region;
import fr.eni.spring.model.Vin;
import fr.eni.spring.repository.CouleurRepo;
import fr.eni.spring.repository.RegionRepo;
import fr.eni.spring.repository.VinRepo;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class VinServiceImpl implements VinService {

    private List<Vin> listeDesVins;
    private VinRepo vinRepo;
    private CouleurRepo couleurRepo;
    private RegionRepo regionRepo;

    public VinServiceImpl(VinRepo vinRepo, CouleurRepo couleurRepo, RegionRepo regionRepo){


        this.vinRepo = vinRepo;
        this.couleurRepo = couleurRepo;
        this.regionRepo = regionRepo;

        couleurRepo.save(new Couleur("rouge"));
        couleurRepo.save(new Couleur("rose"));
        couleurRepo.save(new Couleur("blanc"));

        regionRepo.save(new Region("Bourgogne"));
        regionRepo.save(new Region("Normandie"));
        regionRepo.save(new Region("Bordeaux"));

        vinRepo.save(new Vin("Pic Saint Loup", 5, false, 25, couleurRepo.findById(1).get(), regionRepo.findById(1).get()));
        vinRepo.save(new Vin("Chardonnay", 3, true, 10, couleurRepo.findById(2).get(), regionRepo.findById(2).get()));
        vinRepo.save(new Vin("Gueule de bois", 1, true, 100, couleurRepo.findById(3).get(), regionRepo.findById(1).get()));
        vinRepo.save(new Vin("Elixir", 5, false, 1000, couleurRepo.findById(2).get(), regionRepo.findById(2).get()));
        vinRepo.save(new Vin("La potion", 4, true, 1, couleurRepo.findById(3).get(), regionRepo.findById(3).get()));
    }
    @Override
    public List<Vin> getVins() {

        return vinRepo.findAll();
    }

    @Override
    public Vin getVinById(int id) {
        return vinRepo.findById(id).get();
    }


    @Override
    public void ajouterVin(Vin vin) {
        vinRepo.save(vin);
    }

    @Override
    public void modifierVin(Vin vin) {
        vinRepo.save(vin);
    }

    @Override
    public void supprimerVin(int id) {
        vinRepo.deleteById(id);
    }

}
