package com.wbsedcl.estimateservice.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "service_line_item_master", schema = "estimate_service")
public class ServiceLineItem {
	private Integer id;
	private Integer lineItemNumber;
	private String serviceDescription;
	private Double quantity;
	private String unit;
	private Double rate;
	private Double itemAmount;
	@ManyToOne
	@JoinColumn(name = "estimate_id")
	private Estimate estimate;
	
}
