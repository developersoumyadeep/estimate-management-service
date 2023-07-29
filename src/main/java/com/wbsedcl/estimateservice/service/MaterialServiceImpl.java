package com.wbsedcl.estimateservice.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.wbsedcl.estimateservice.entity.Material;
import com.wbsedcl.estimateservice.repository.MaterialRepository;

@Service
public class MaterialServiceImpl implements MaterialService {
	
	private MaterialRepository materialJPARepository;
	
	public MaterialServiceImpl(MaterialRepository materialJPARepository) {
		super();
		this.materialJPARepository = materialJPARepository;
	}

	@Override
	public Optional<Material> findMaterialByMaterialCode(String materialCodeString) {
		return materialJPARepository.findByMaterialCode(materialCodeString);
	}

}
