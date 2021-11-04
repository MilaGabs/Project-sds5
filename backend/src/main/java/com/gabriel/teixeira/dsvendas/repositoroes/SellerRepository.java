package com.gabriel.teixeira.dsvendas.repositoroes;
import org.springframework.data.jpa.repository.JpaRepository;
import com.gabriel.teixeira.dsvendas.entities.Seller;

public interface SellerRepository extends JpaRepository<Seller, Long>{
	
}
