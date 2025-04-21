package com.exemple.repositories;

import com.exemple.entities.Campagne;
import com.exemple.projection.CampagneResume;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface CampagneJPA extends JpaRepository<Campagne, Long> {
    List<CampagneResume> findByDateDebutBeforeAndDateFinAfter(LocalDate now1, LocalDate now2);
}
