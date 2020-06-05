package com.app.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.api.entity.Produit;

public interface ProduitRepository extends JpaRepository<Produit, Long>{

}
