package fr.eni.spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VinController {

    @GetMapping({"", "/", "/index"})
    public String affichePageVin() {
        return "index";
    }

}

