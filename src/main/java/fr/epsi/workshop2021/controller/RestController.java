package fr.epsi.workshop2021.controller;

import fr.epsi.workshop2021.model.InfoRecup;
import fr.epsi.workshop2021.service.GlobalInfoService;
import fr.epsi.workshop2021.service.InfoEnvoieService;
import fr.epsi.workshop2021.service.InfoRecupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.persistence.EntityNotFoundException;

@org.springframework.web.bind.annotation.RestController
@RequestMapping(value = "/")
public class RestController {

    @Autowired
    InfoEnvoieService infoEnvoieService;

    @Autowired
    InfoRecupService infoRecupService;

    @Autowired
    GlobalInfoService globalInfoService;

    @GetMapping("/HelloWorld")
    public String HelloWorld(){
        return "Hello World";
    }

    @GetMapping("/getGlobalInfo")
    public String getGlobalInfo(){
        return "Hello World";
    }

}
