package com.cdv.area.service;

import java.util.List;

import com.cdv.area.po.Area;

public interface AreaInterface {

	//��ѯ���򣬽���area���󣨴洢�˲�ѯ����������Ϣ��������List<area>
	public List<Area> queryArea(Area area) throws Exception;
}
