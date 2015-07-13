package com.csc.search.useService.imp;

import java.util.ArrayList;
import java.util.HashMap;

import com.csc.search.dto.PathBean;
import com.csc.search.dto.PayMember;
import com.csc.search.ehcache.CacheService;
import com.csc.search.useService.UserService;
import com.csc.search.util.CompareWord;

public class UseEhcache implements UserService{
	
	
	CacheService cacheService;
	
	PathBean pathBean;//接受配置文件路径
	
	@SuppressWarnings("unchecked")
	public ArrayList<PayMember> getPayMemberList(String keyword){
		HashMap<String, PayMember> map = (HashMap<String, PayMember>)cacheService.getObject("payMap");
		ArrayList<PayMember> payMemberlist = null;
		
		if(map==null){ //如果缓存中没有，则读取文件
		System.out.println("添加缓存");
		String csvFilePath = pathBean.getPath(); //定义目标文件获取路径
		HashMap<String, PayMember>  hashmap = CompareWord.getFromFile(csvFilePath);
		payMemberlist = CompareWord.compare(keyword, hashmap);
		cacheService.addObject("payMap", hashmap);
		}else{
			System.out.println("缓存存在");
			payMemberlist = CompareWord.compare(keyword, map);
		}
		return payMemberlist;
	}

	public CacheService getCacheService() {
		return cacheService;
	}


	public void setCacheService(CacheService cacheService) {
		this.cacheService = cacheService;
	}
	
	public static void main(String[] args) {
		
	}

	public PathBean getPathBean() {
		return pathBean;
	}

	public void setPathBean(PathBean pathBean) {
		this.pathBean = pathBean;
	}
}
