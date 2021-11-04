package com.gabriel.teixeira.dsvendas.repositoroes;
import org.springframework.data.jpa.repository.JpaRepository;

import com.gabriel.teixeira.dsvendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long>{
	
}
