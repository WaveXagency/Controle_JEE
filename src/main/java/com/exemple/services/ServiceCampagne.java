package com.exemple.services;

import com.exemple.projection.CampagneResume;
import com.exemple.repositories.CampagneJPA;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class ServiceCampagne {
    private final CampagneJPA campagneJPA;

    public ServiceCampagne(CampagneJPA campagneJPA) {
        this.campagneJPA = campagneJPA;
    }

    public List<CampagneResume> getCampagnesActives() {
        LocalDate now = LocalDate.now();
        return campagneJPA.findByDateDebutBeforeAndDateFinAfter(now, now);
    }
}
