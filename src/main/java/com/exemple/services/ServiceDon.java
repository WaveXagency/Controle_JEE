package com.exemple.services;

import com.exemple.dto.DonDTO;
import com.exemple.entities.Campagne;
import com.exemple.entities.Donation;
import com.exemple.repositories.CampagneJPA;
import com.exemple.repositories.DonationJPA;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ServiceDon {
    private final DonationJPA donationJPA;
    private final CampagneJPA campagneJPA;

    public ServiceDon(DonationJPA donationJPA, CampagneJPA campagneJPA) {
        this.donationJPA = donationJPA;
        this.campagneJPA = campagneJPA;
    }

    public void enregistrerDon(Long campagneId, DonDTO donDTO) {
        Optional<Campagne> campagne = campagneJPA.findById(campagneId);
        if (campagne.isPresent()) {
            Donation d = new Donation();
            d.setCampagne(campagne.get());
            d.setDate(donDTO.getDate());
            d.setMontant(donDTO.getMontant());
            d.setNomDonateur(donDTO.getNomDonateur());
            donationJPA.save(d);
        } else {
            throw new RuntimeException("Campagne introuvable");
        }
    }

    public DonDTO convertToDTO(Donation d) {
        DonDTO dto = new DonDTO();
        dto.setId(d.getId());
        dto.setNomCampagne(d.getCampagne().getNom());
        dto.setNomDonateur(d.getNomDonateur());
        dto.setMontant(d.getMontant());
        dto.setDate(d.getDate());
        return dto;
    }
}