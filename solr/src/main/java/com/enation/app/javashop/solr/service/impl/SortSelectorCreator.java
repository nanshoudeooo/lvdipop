/**
 * 
 */
package com.enation.app.javashop.solr.service.impl;

import java.util.List;
import java.util.Map;

import org.apache.solr.client.solrj.response.FacetField;
import org.springframework.stereotype.Component;

import com.enation.app.javashop.solr.service.ISearchSelectorCreator;
import com.enation.app.shop.core.goods.utils.SortUrlUtils;

/**
 * 排序选择器生成
 * @author zh
 * @version v1.0
 * @since v6.1
 * 2016年10月13日 下午12:10:52
 */
@Component
public class SortSelectorCreator implements ISearchSelectorCreator {
	
	/* (non-Javadoc)
	 * @see com.enation.app.shop.component.goodsindex.service.ISearchSelectorCreator#createAndPut(java.util.Map, java.util.List)
	 */
	public void createAndPut(Map<String, Object> map, List<FacetField> results) {
		SortUrlUtils.createAndPut(map);
	}
	
	
	
	 
	
	
	
}
