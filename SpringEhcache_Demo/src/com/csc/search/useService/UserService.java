package com.csc.search.useService;

import java.util.ArrayList;

import com.csc.search.dto.PayMember;

public interface UserService {

	public ArrayList<PayMember> getPayMemberList(String keyWord);
}
