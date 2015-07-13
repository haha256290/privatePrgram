package com.csc.search.ehcache.imp;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.util.Assert;

import com.csc.search.ehcache.CacheService;

import net.sf.ehcache.Cache;
import net.sf.ehcache.CacheException;
import net.sf.ehcache.Element;

public class CacheServiceImp implements InitializingBean ,CacheService{
	
	private Cache cache;
    
    /**
     * @throws Exception
     */
    public void afterPropertiesSet() throws Exception {
         Assert.notNull(cache, "Code cache is null !");
    }
    
	public Cache getCache() {
		return cache;
	}

	public void setCache(Cache cache) {
		this.cache = cache;
	}
	
	  /**
     * 添加缓存
     * @param name  key
     * @param object value
     */

	public void addObject(String name, Object object) {
		 Element e = new Element(name,object);
	     cache.put(e);
	}

	  /**
     * 如果有重复key值 先删除,最后添加最新值
     * @param name  key
     * @param object value
     */
    public void addOnly(String name, Object object){
        //如果添加前不为空，先删除再添加
        if(getObject(name)!=null){
           remove(name);
        }
        addObject(name,object);
    }
    /**
     * 根据名字从缓存中读取
     * @param name  key
     */
	@SuppressWarnings("deprecation")
	public Object getObject(String name) {
		 Element element = null;
	        try {
	        
	            element = cache.get(name);
	        } catch (CacheException cacheException) {
	            cacheException.getMessage();
	        }

	        if (element == null) {
	            return null;
	        } else {
	            return  element.getValue();
	        }
	  }
	
	 /**
     * 根据名字清除缓存
     * @param name key
     */
    public void remove(String name){
         cache.remove(name);
    }

}
