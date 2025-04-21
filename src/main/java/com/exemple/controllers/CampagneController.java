package com.exemple.controllers;

import com.exemple.dto.DonDTO;
import com.exemple.projection.CampagneResume;
import com.exemple.services.ServiceCampagne;
import com.exemple.services.ServiceDon;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/campagnes")
public class CampagneController {

    private final ServiceCampagne serviceCampagne;
    private final ServiceDon serviceDon;

    public CampagneController(ServiceCampagne serviceCampagne, ServiceDon serviceDon) {
        this.serviceCampagne = serviceCampagne;
        this.serviceDon = serviceDon;
    }

    @GetMapping("/actives")
    public List<CampagneResume> getCampagnesActives() {
        return serviceCampagne.getCampagnesActives();
    }

    @PostMapping("/{id}/dons")
    public void enregistrerDon(@PathVariable Long id, @RequestBody @Valid DonDTO donDTO) {
        serviceDon.enregistrerDon(id, donDTO);
    }
}