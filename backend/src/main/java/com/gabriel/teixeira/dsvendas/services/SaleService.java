package com.gabriel.teixeira.dsvendas.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gabriel.teixeira.dsvendas.dto.SaleDTO;
import com.gabriel.teixeira.dsvendas.entities.Sale;
import com.gabriel.teixeira.dsvendas.repositoroes.SaleRepository;
import com.gabriel.teixeira.dsvendas.repositoroes.SellerRepository;

@Service
public class SaleService {
	
	@Autowired
	private SellerRepository sellerRepository;
	
	@Autowired
	private SaleRepository repository;
	
	@Transactional(readOnly = true)
	public Page<SaleDTO> findAll(Pageable pageable) {
		sellerRepository.findAll();
		Page<Sale> result = repository.findAll(pageable);
		return result.map(x -> new SaleDTO(x));
	}
}
