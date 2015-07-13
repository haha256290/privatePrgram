package com.csc.search.util;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import com.csc.search.dto.PayMember;

import au.com.bytecode.opencsv.CSVReader;

/**
 * 
 * @author 严彬华
 *
 */
public class CompareWord {

	public static HashMap<String, PayMember> getFromFile(String csvFilePath) {

		HashMap<String, PayMember> payMemberList = new HashMap<String, PayMember>();
		//ArrayList<PayMember> payMemberList = new ArrayList<PayMember>();
		CSVReader reader = null;
		BufferedReader bufferedReader = null;
		String[] nextLine;
		try {
			bufferedReader = new BufferedReader(new InputStreamReader(
					new FileInputStream(csvFilePath), "UTF-8"));
			reader = new CSVReader(bufferedReader);
	
			while ((nextLine = reader.readNext()) != null) {
				try {
					PayMember pm = new PayMember();
					pm.setProductId(nextLine[0]);
					pm.setProductTitle(nextLine[1]);
					pm.setKeyWord(nextLine[2]);
					pm.setPublishTime(nextLine[3]);
					pm.setProductPrice(nextLine[4]);
					pm.setCategroryId(nextLine[5]);
					pm.setMemberId(nextLine[6]);
					pm.setTwoCategoryId(nextLine[7]);
					pm.setCompanyName(nextLine[8]);
					pm.setCompanyType(nextLine[9]);
					pm.setIsAuthenticate(nextLine[10]);
					pm.setMainProduct(nextLine[11]);
					pm.setProvince(nextLine[12]);
					pm.setCity(nextLine[13]);
					pm.setDelineTime(nextLine[14]);
					//payMemberList.add(pm);
					payMemberList.put(UUID.randomUUID().toString(), pm);
					payMemberList.put(new Date().toString(), pm);

				} catch (Exception e) {
					e.printStackTrace();
				}
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (bufferedReader != null) {
					bufferedReader.close();
				}
				if (reader != null) {
					reader.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return payMemberList;
	}

	public static ArrayList<PayMember> compare(String keyWord,
			HashMap<String, PayMember> map) {
		ArrayList<PayMember> List = new ArrayList<PayMember>();
		String copareWord = null;

		Iterator iter = map.entrySet().iterator();
		while (iter.hasNext()) {
			Map.Entry entry = (Map.Entry) iter.next();
			PayMember payMember = (PayMember) entry.getValue();
			copareWord = payMember.getKeyWord();
			//是否包含某个字符串的方法String str;str.contains(String s);
			if (copareWord.equals(keyWord) && ("") != copareWord
					&& copareWord != null) {
				List.add(payMember);
			}

		}
		return List;
	}

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		CompareWord cw = new CompareWord();
		String csvFilePath = "D:/product.csv";
		HashMap<String, PayMember> map = cw.getFromFile(csvFilePath);
		List<PayMember> List = cw.compare("导电漆", map);
        for (int i = 0; i < List.size(); i++) {
			System.out.println(List.get(i).getKeyWord());
		}
		System.out.println("数量:" + List.size());
	}

}
