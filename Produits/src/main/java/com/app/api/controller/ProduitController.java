package com.app.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.api.entity.Produit;
import com.app.api.service.ProduitService;

@RestController
public class ProduitController {
	
	@Autowired
	private ProduitService produitService;
	
	
	@GetMapping("/produits")
	public List<Produit> getAllProduits(){
		return produitService.getAllProduits();
	}

}
