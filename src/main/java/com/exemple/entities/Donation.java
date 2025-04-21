package com.exemple.entities;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
public class Donation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Campagne campagne;

    private String nomDonateur;
    private BigDecimal montant;
    private LocalDate date;

    // Getters
    public Long getId() {
        return id;
    }

    public Campagne getCampagne() {
        return campagne;
    }

    public String getNomDonateur() {
        return nomDonateur;
    }

    public BigDecimal getMontant() {
        return montant;
    }

    public LocalDate getDate() {
        return date;
    }

    // Setters
    public void setId(Long id) {
        this.id = id;
    }

    public void setCampagne(Campagne campagne) {
        this.campagne = campagne;
    }

    public void setNomDonateur(String nomDonateur) {
        this.nomDonateur = nomDonateur;
    }

    public void setMontant(BigDecimal montant) {
        this.montant = montant;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
