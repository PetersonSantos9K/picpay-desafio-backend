package com.petersonsantos9k.picpay_desafio.repository;

import com.petersonsantos9k.picpay_desafio.domain.Transfer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface TransferRepository extends JpaRepository<Transfer, UUID> {
}
