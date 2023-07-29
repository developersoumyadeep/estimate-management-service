package com.wbsedcl.estimateservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.wbsedcl.estimateservice.entity.MaterialLineItem;

public interface MaterialLineItemRepository extends JpaRepository<MaterialLineItem, Integer> {
	
	List<MaterialLineItem> findAllByEstimateId(String estimateId);
	
}
