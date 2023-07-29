package com.wbsedcl.estimateservice.service;

import java.util.List;
import com.wbsedcl.estimateservice.entity.MaterialLineItem;

public interface MaterialLIneItemService {
	List<MaterialLineItem> findMaterialLineItemsByEstimateId(String estimateId);
	MaterialLineItem findMaterialLineItemById(Integer materialLineItemId);
	MaterialLineItem saveMaterialLineItem(MaterialLineItem materialLineItem);
	MaterialLineItem updateMaterialLineItem(MaterialLineItem materialLineItem);
	void deleteMaterialLineItem(MaterialLineItem materialLineItem);
}
