package com.cdv.hession;

import java.util.List;

import com.caucho.hessian.client.HessianProxyFactory;
import com.cdv.area.po.Area;
import com.cdv.area.service.AreaInterface;

public class Client {

		public static void main(String[] args) throws Exception {

			// ���������������ڻ��ڷ���ӿڴ����������
			HessianProxyFactory hessianProxyFactory = new HessianProxyFactory();

			// �������÷���ӿڴ�����󣬻��ڷ���ӿڵĴ������

			// ��һ������������˽ӿ�
			// �ڶ���������hessian�����ַ
			AreaInterface areaInterface = (AreaInterface) hessianProxyFactory
					.create(AreaInterface.class,
							"http://localhost:8080/webservice017_hessian_server/hessian/areaQuery");

			// �����˷���http����(����hessian�Ķ�����Э��)
			//���� ��ѯ����
			Area area = new Area();
			area.setParentid("1.1.");
			area.setStart(1);
			area.setEnd(2);
			List<Area> list = areaInterface.queryArea(area);
			
			System.out.println(list);

		}
}
