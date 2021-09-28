package fr.epsi.workshop2021.repository;

import fr.epsi.workshop2021.model.InfoRecup;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface InfoRecupRepository extends JpaRepository<InfoRecup, String> {


}
