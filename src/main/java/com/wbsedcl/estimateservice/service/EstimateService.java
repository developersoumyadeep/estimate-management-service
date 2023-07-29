package com.wbsedcl.estimateservice.service;

import com.wbsedcl.estimateservice.entity.Estimate;

public interface EstimateService {
	Integer saveEstimate(Estimate esimate);
	Estimate findEstimateById(Integer estimateId);
	
}
