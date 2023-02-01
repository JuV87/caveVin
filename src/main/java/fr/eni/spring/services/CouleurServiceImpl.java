package fr.eni.spring.services;

import fr.eni.spring.model.Couleur;
import fr.eni.spring.repository.CouleurRepo;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CouleurServiceImpl implements CouleurService {

    private CouleurRepo couleurRepo;
    public CouleurServiceImpl(CouleurRepo couleurRepo){
        this.couleurRepo = couleurRepo;
    }

    @Override
    public List<Couleur> getCouleurs() {
        return couleurRepo.findAll();
    }
}
