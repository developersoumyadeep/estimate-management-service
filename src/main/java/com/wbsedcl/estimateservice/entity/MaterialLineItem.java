package com.wbsedcl.estimateservice.entity;

import org.apache.logging.log4j.util.StringBuilderFormattable;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="material_line_item_master", schema = "estimate-service")
public class MaterialLineItem {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@NotNull
	private Integer lineItemNumber;
	@NotNull
	private String materialCode;
	@NotNull
	private String materialDescription;
	@NotNull
	private Double quantity;
	@NotNull
	private String unit;
	private Double materialCost;
	@NotNull
	private Double itemAmount;
	@NotNull
	private String storageLocation;
	@ManyToOne
	@JoinColumn(name = "estimate_id")
	private Estimate estimate;
}
