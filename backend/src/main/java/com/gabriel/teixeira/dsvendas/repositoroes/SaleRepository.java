package com.gabriel.teixeira.dsvendas.repositoroes;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.gabriel.teixeira.dsvendas.dto.SaleSuccessDTO;
import com.gabriel.teixeira.dsvendas.dto.SaleSumDTO;
import com.gabriel.teixeira.dsvendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long>{
	
	@Query("SELECT com.gabriel.teixeira.dsvendas.dto.SaleSumDTO(obj.seller, SUM(obj.amount)) "
			+ "FROM Sale AS obj GROUP BY obj.seller")
	List<SaleSumDTO> amountGroupedBySaller();	
	
	@Query("SELECT com.gabriel.teixeira.dsvendas.dto.SaleSuccessDTO(obj.seller, SUM(obj.visited), SUM(obj.deals)) "
			+ "FROM Sale AS obj GROUP BY obj.seller")
	List<SaleSuccessDTO> successGroupedBySaller();	
}
