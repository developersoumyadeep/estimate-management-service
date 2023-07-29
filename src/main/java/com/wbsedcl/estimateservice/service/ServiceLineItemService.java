package com.wbsedcl.estimateservice.service;

import java.util.List;


import com.wbsedcl.estimateservice.entity.ServiceLineItem;

public interface ServiceLineItemService {
	List<ServiceLineItem> findServiceLineItemsByEstimateId(String estimateId);
	ServiceLineItem findServiceLineItemById(Integer ServiceLineItemId);
	ServiceLineItem saveServiceLineItem(ServiceLineItem ServiceLineItem);
	ServiceLineItem updateServiceLineItem(ServiceLineItem ServiceLineItem);
	void deleteServiceLineItem(ServiceLineItem ServiceLineItem);
}
