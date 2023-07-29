package com.wbsedcl.estimateservice.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.wbsedcl.estimateservice.entity.MaterialLineItem;
import com.wbsedcl.estimateservice.repository.MaterialLineItemRepository;


@Service
public class MaterialLineItemServiceImpl implements MaterialLIneItemService {
	
	private MaterialLineItemRepository repository;
	
	public MaterialLineItemServiceImpl(MaterialLineItemRepository repository) {
		super();
		this.repository = repository;
	}

	@Override
	public List<MaterialLineItem> findMaterialLineItemsByEstimateId(String estimateId) {
		return repository.findAllByEstimateId(estimateId);
	}

	@Override
	public MaterialLineItem findMaterialLineItemById(Integer materialLineItemId) {
		return repository.findById(materialLineItemId).get();
	}

	@Override
	public MaterialLineItem saveMaterialLineItem(MaterialLineItem materialLineItem) {
		return repository.save(materialLineItem);
	}

	@Override
	public MaterialLineItem updateMaterialLineItem(MaterialLineItem materialLineItem) {
		return repository.save(materialLineItem);
	}

	@Override
	public void deleteMaterialLineItem(MaterialLineItem materialLineItem) {
		 repository.delete(materialLineItem);;
	}

}
