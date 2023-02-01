package fr.eni.spring.rest;

import fr.eni.spring.model.Couleur;
import fr.eni.spring.model.Vin;
import fr.eni.spring.services.CouleurService;
import fr.eni.spring.services.VinService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("/rest")
public class CouleurRestController {
    private CouleurService couleurService;
    public CouleurRestController (CouleurService couleurService) {
        this.couleurService = couleurService;
    }


    @GetMapping("/couleurs")
    public List<Couleur> getCouleurs() {
        return couleurService.getCouleurs();
    }
}
