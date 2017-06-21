package com.cdv.hession;

import java.util.List;

import com.caucho.hessian.client.HessianProxyFactory;
import com.cdv.area.po.Area;
import com.cdv.area.service.AreaInterface;

public class Client {

		public static void main(String[] args) throws Exception {

			// 创建代理工厂，用于基于服务接口创建代理对象
			HessianProxyFactory hessianProxyFactory = new HessianProxyFactory();

			// 创建调用服务接口代理对象，基于服务接口的代理对象

			// 第一个参数：服务端接口
			// 第二个参数：hessian服务地址
			AreaInterface areaInterface = (AreaInterface) hessianProxyFactory
					.create(AreaInterface.class,
							"http://localhost:8080/webservice017_hessian_server/hessian/areaQuery");

			// 向服务端发起http请求(发送hessian的二进制协议)
			//构造 查询条件
			Area area = new Area();
			area.setParentid("1.1.");
			area.setStart(1);
			area.setEnd(2);
			List<Area> list = areaInterface.queryArea(area);
			
			System.out.println(list);

		}
}
