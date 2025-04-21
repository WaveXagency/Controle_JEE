package com.exemple.repositories;

import com.exemple.entities.Donation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DonationJPA extends JpaRepository<Donation, Long> {
}