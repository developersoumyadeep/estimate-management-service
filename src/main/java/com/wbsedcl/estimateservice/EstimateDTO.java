package com.wbsedcl.estimateservice;

import java.time.LocalDate;
import java.util.List;

import org.apache.catalina.User;

import com.wbsedcl.estimateservice.entity.MaterialLineItem;
import com.wbsedcl.estimateservice.entity.ServiceLineItem;

public class EstimateDTO {
	private String description;
	private LocalDate estimateDate;
	private Double supervisionCostPercentage;
	private Double cessPercentage;
	private Double supervisionGSTPercentage;
	private Double serviceGSTPercentage;
	private String workType;
	private User preparedBy;
	private List<MaterialLineItem> materialLineItems;
	private List<ServiceLineItem> serviceLineItems;
}
