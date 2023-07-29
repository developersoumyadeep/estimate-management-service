package com.wbsedcl.estimateservice.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.wbsedcl.estimateservice.entity.MaterialLineItem;
import com.wbsedcl.estimateservice.entity.ServiceLineItem;
import com.wbsedcl.estimateservice.repository.MaterialLineItemRepository;
import com.wbsedcl.estimateservice.repository.ServiceLineItemRepository;


@Service
public class ServiceLineItemServiceImpl implements ServiceLineItemService {

	private ServiceLineItemRepository repository;
	
	public ServiceLineItemServiceImpl(ServiceLineItemRepository repository) {
		super();
		this.repository = repository;
	}

	@Override
	public List<ServiceLineItem> findServiceLineItemsByEstimateId(String estimateId) {
		return repository.findALlByEstimateId(estimateId);
	}

	@Override
	public ServiceLineItem findServiceLineItemById(Integer ServiceLineItemId) {
		return repository.findById(ServiceLineItemId).get();
	}

	@Override
	public ServiceLineItem saveServiceLineItem(ServiceLineItem ServiceLineItem) {
		return repository.save(ServiceLineItem);
	}

	@Override
	public ServiceLineItem updateServiceLineItem(ServiceLineItem ServiceLineItem) {
		return repository.save(ServiceLineItem);
	}

	@Override
	public void deleteServiceLineItem(ServiceLineItem ServiceLineItem) {
		 repository.delete(ServiceLineItem);;
	}

}
