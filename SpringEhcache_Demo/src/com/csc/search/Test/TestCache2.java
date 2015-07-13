package com.csc.search.Test;

import java.awt.List;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;

import javax.xml.crypto.Data;

import com.csc.search.dto.PhoneBean;

import net.sf.ehcache.Cache;
import net.sf.ehcache.CacheManager;
import net.sf.ehcache.Element;
import net.sf.ehcache.search.Query;

public class TestCache2 implements Serializable{

	/** 
	
	* @Fields serialVersionUID : TODO(用一句话描述这个变量表示什么) 
	
	*/ 
	private static final long serialVersionUID = -8405452966348350908L;

	public static void main(String[] args) {  
        String fileName="src/ehcache.xml";  
        CacheManager manager = new CacheManager(fileName);  
        
         Cache cache1=manager.getCache("cache1");  
         
         cache1.put(new Element("key1", "value1"));
         cache1.put(new Element("key2", "value2"));
         
         cache1.remove("key1");
         
         System.out.println(cache1.isKeyInCache("key1"));
         
         java.util.List keys = cache1.getKeys();
       System.out.println(keys);
       
       cache1.remove("key1");
       Element element=cache1.getQuiet("key1");
       cache1.isExpired(element);
      System.out.println(cache1.isExpired(element));
	}

	

}
