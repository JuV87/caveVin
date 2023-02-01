package fr.eni.spring.rest;

import fr.eni.spring.model.Vin;
import fr.eni.spring.services.VinService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rest")
public class VinRestController {

    private final VinService vinService;

    public VinRestController (VinService vinService) {
        this.vinService = vinService;
    }

    @GetMapping("/vins")
    public List<Vin> getVins() {
        return vinService.getVins();
    }

    @GetMapping("/vins/{id}")
    public Vin getVin(@PathVariable("id") int id)
    {
        Vin vin = vinService.getVinById(id);
        System.out.println("getVin : " + vin);
        return vin;
    }

    @PostMapping("/vins")
    public ResponseEntity<Vin> ajouterVin(@RequestBody Vin vin)
    {

        vinService.ajouterVin(vin);

        return new ResponseEntity<Vin>(vin, HttpStatus.CREATED);
    }

    @DeleteMapping("/vins/{id}")
    public void supprimerVin(@PathVariable("id") int id)
    {
        vinService.supprimerVin(id);

    }
    @PutMapping("/vins")
    public void modifierVin(@RequestBody Vin vin)
    {
        vinService.modifierVin(vin);

    }

    @PatchMapping("/vins/{id}")
    public void modifierUnParametreVin(@PathVariable("id") int id, @RequestBody Vin vin)
    {
       vinService.modifierVin(vin);

    }

}
