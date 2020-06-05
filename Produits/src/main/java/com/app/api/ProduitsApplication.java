package com.app.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.app.api.entity.Produit;
import com.app.api.repository.ProduitRepository;

@SpringBootApplication
public class ProduitsApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(ProduitsApplication.class, args);
	}
	
	@Autowired
	private ProduitRepository ProduitRepository;

	@Override
	public void run(String... args) throws Exception {
		
		ProduitRepository.save(new Produit(null, "PC PORTABLE", "3000 DH"));
		ProduitRepository.save(new Produit(null, "TV SANSUNG", "5000 DH"));
		ProduitRepository.save(new Produit(null, "TELEPHONE NOKIA", "4000 DH"));
		
	}

}
