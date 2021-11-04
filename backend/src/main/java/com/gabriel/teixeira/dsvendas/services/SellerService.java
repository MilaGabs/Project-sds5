package com.gabriel.teixeira.dsvendas.services;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gabriel.teixeira.dsvendas.dto.SellerDTO;
import com.gabriel.teixeira.dsvendas.entities.Seller;
import com.gabriel.teixeira.dsvendas.repositoroes.SellerRepository;

@Service
public class SellerService {
	@Autowired
	private SellerRepository repository;
	
	public List<SellerDTO> findAll() {
		List<Seller> result = repository.findAll();
		return result.stream().map(x -> new SellerDTO(x)).collect(Collectors.toList());
	}
}
