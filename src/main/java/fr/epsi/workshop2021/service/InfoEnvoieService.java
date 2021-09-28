package fr.epsi.workshop2021.service;

import fr.epsi.workshop2021.repository.GlobalInfoRepository;
import fr.epsi.workshop2021.repository.InfoEnvoieRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InfoEnvoieService {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    InfoEnvoieRepository infoEnvoieRepository;
}


