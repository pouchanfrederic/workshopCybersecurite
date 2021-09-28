package fr.epsi.workshop2021.repository;

import fr.epsi.workshop2021.model.GlobalInfo;
import fr.epsi.workshop2021.model.InfoEnvoie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InfoEnvoieRepository extends JpaRepository<InfoEnvoie, String> {



}
