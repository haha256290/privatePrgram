package com.csc.search.useService.imp;

import java.util.ArrayList;
import java.util.HashMap;

import com.csc.search.dto.PathBean;
import com.csc.search.dto.PayMember;
import com.csc.search.useService.UserService;
import com.csc.search.util.CompareWord;

public class NotUseCache implements UserService {
	PathBean pathBean;

	public ArrayList<PayMember> getPayMemberList(String keyWord) {
		ArrayList<PayMember> payMemberlist = null;
		String csvFilePath = pathBean.getPath(); //定义目标文件获取路径
		HashMap<String, PayMember>  hashmap = CompareWord.getFromFile(csvFilePath);
		payMemberlist = CompareWord.compare(keyWord, hashmap);
		
		return payMemberlist;
	}

	public PathBean getPathBean() {
		return pathBean;
	}
	
	public void setPathBean(PathBean pathBean) {
		this.pathBean = pathBean;
	}
}
