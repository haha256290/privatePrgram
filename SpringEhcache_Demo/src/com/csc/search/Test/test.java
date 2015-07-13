package com.csc.search.Test;

import java.util.ArrayList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.csc.search.dto.PathBean;
import com.csc.search.dto.PayMember;
import com.csc.search.ehcache.imp.CacheServiceImp;
import com.csc.search.useService.UserService;



public class test{

	
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		UserService useEhcache = (UserService) context.getBean("useEhcache");		
		
//		ArrayList<PayMember> list = useEhcache.getPayMemberList("导电漆");"

		final CacheServiceImp service = new CacheServiceImp();
		
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				while (true) {
					service.getObject("1");
					
				}
				
			}
		});
		
		
		
		
		
		
		//		for (int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i).getCity());
//		}
		
//		CacheServiceImp service = new CacheServiceImp();
//		service.addObject("人", object);
		
//		ArrayList<PayMember> anotherList = useEhcache.getPayMemberList("漆");
//		for (int i = 0; i < anotherList.size(); i++) {
//			System.out.println(anotherList.get(i).getKeyWord());
//		}
		
//		PathBean pathBean = (PathBean) context.getBean("pathBean");
//		System.out.println(pathBean.getPath());
	}
}
