package com.wbsedcl.estimateservice.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wbsedcl.estimateservice.entity.Material;

@Repository
public interface MaterialRepository extends JpaRepository<Material, Integer> {
  
	Optional<Material> findByMaterialCode(String materialCode); 
}
