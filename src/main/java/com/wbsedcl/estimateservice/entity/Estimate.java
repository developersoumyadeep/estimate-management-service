package com.wbsedcl.estimateservice.entity;

import java.time.LocalDate;
import java.util.List;

import org.apache.catalina.User;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "estimate_master", schema = "estimate_service")
public class Estimate {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String description;
	private LocalDate estimateDate;
	private Double supervisionCostPercentage;
	private Double cessPercentage;
	private Double supervisionGSTPercentage;
	private Double serviceGSTPercentage;
	private String workType;
	private User preparedBy;
	@OneToMany(mappedBy = "estimate")
	private List<MaterialLineItem> materialLineItems;
	@OneToMany(mappedBy = "estimate")
	private List<ServiceLineItem> serviceLineItems;
}
