package com.wbsedcl.estimateservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wbsedcl.estimateservice.entity.ServiceLineItem;

public interface ServiceLineItemRepository extends JpaRepository<ServiceLineItem, Integer>{
	List<ServiceLineItem> findALlByEstimateId(String estimateId);
}
