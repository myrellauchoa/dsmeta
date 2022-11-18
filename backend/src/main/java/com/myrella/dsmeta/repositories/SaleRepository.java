package com.myrella.dsmeta.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myrella.dsmeta.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long>{
	
}
