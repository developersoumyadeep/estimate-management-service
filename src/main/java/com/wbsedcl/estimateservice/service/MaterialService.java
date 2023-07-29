package com.wbsedcl.estimateservice.service;

import java.util.Optional;

import com.wbsedcl.estimateservice.entity.Material;

public interface MaterialService {
	
	Optional<Material> findMaterialByMaterialCode(String materialCodeString);
}
