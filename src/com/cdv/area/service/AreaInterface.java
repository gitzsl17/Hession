package com.cdv.area.service;

import java.util.List;

import com.cdv.area.po.Area;

public interface AreaInterface {

	//查询区域，接收area对象（存储了查询区域条件信息），返回List<area>
	public List<Area> queryArea(Area area) throws Exception;
}
