package fr.epsi.workshop2021.service;

import fr.epsi.workshop2021.repository.GlobalInfoRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GlobalInfoService {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    GlobalInfoRepository globalInfoRepository;
}


