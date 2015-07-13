package com.csc.search.ehcache;

public interface CacheService {
	
	public Object getObject(String name);
	public void   addObject(String name,Object o);
}
