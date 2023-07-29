package com.wbsedcl.estimateservice.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wbsedcl.estimateservice.entity.Material;
import com.wbsedcl.estimateservice.service.MaterialService;

import lombok.extern.slf4j.Slf4j;


@Slf4j
@RestController
@RequestMapping("/estimate-service")
public class EstimateController {
	
	private MaterialService materialService;
	

	public EstimateController(MaterialService materialService) {
		super();
		log.info("RestController constructed");
		this.materialService = materialService;
	}

	@GetMapping("/materials/{materialCode}")
	public ResponseEntity<Material> getMaterialByMaterialCode(@PathVariable String materialCode) {
	    log.info("Hello there ...........{}",materialCode);
		Material entity = materialService.findMaterialByMaterialCode(materialCode).get();
		log.info(entity.getMaterialDescription());
		return ResponseEntity.ok(entity);
	}
}
