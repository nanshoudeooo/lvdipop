package com.enation.app.b2b2c.core.goods.service;

/**
 * 店铺购物车Map Key枚举<br>
 * 此类表明了，在获取店铺购物车列表中的Map的结构
 * @see IStoreCartManager#storeListGoods(String)
 */
public enum StoreCartKeyEnum {
	
	//店铺id
	store_id("store_id"),
	
	//店铺名称
	store_name("store_name"),
	
	//购物列表
	goodslist("goodslist"),
	
	//促销活动ID
	activity_id("activity_id"),
	
	//店铺当前所创建的促销活动名称
	activity_name("activity_name"),
	
	//店铺价格
	storeprice("storeprice"),
	
	//配送方式id
	shiptypeid("shiptypeid"),
	
	//配送方式列表
	shiptype_list("shiplist");
	
	
	private String key;
	StoreCartKeyEnum(String _key){
		this.key=_key;
	}
	
	public String toString(){
		return this.key;
	}
	
}
