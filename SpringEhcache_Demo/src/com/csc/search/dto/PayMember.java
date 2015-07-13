package com.csc.search.dto;

public class PayMember {

	public String productId; //商品ID
	public String productTitle;//商品标题
	public String keyWord;//关键�?
	public String publishTime;//商品发布时间
	public String productPrice;//商品价格
	public String categroryId;//商品�?属的�?级类目ID
	public String MemberId;//会员ID
	public String twoCategoryId;//商品�?属的二级类目ID
	public String companyName;//公司名称
	public String mainProduct;//主营产品
	public String companyType;//商家类型
	public String isAuthenticate;//是否已认�?
	public String province;//商家�?在地�?-省份
	public String city;//商家�?在地�?-城市
	public String delineTime;//到期时间
	
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getProductTitle() {
		return productTitle;
	}
	public void setProductTitle(String productTitle) {
		this.productTitle = productTitle;
	}
	public String getKeyWord() {
		return keyWord;
	}
	public void setKeyWord(String keyWord) {
		this.keyWord = keyWord;
	}
	public String getPublishTime() {
		return publishTime;
	}
	public void setPublishTime(String publishTime) {
		this.publishTime = publishTime;
	}
	public String getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(String productPrice) {
		this.productPrice = productPrice;
	}
	public String getCategroryId() {
		return categroryId;
	}
	public void setCategroryId(String categroryId) {
		this.categroryId = categroryId;
	}
	public String getMemberId() {
		return MemberId;
	}
	public void setMemberId(String memberId) {
		MemberId = memberId;
	}
	public String getTwoCategoryId() {
		return twoCategoryId;
	}
	public void setTwoCategoryId(String twoCategoryId) {
		this.twoCategoryId = twoCategoryId;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getMainProduct() {
		return mainProduct;
	}
	public void setMainProduct(String mainProduct) {
		this.mainProduct = mainProduct;
	}
	public String getCompanyType() {
		return companyType;
	}
	public void setCompanyType(String companyType) {
		this.companyType = companyType;
	}
	public String getIsAuthenticate() {
		return isAuthenticate;
	}
	public void setIsAuthenticate(String isAuthenticate) {
		this.isAuthenticate = isAuthenticate;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getDelineTime() {
		return delineTime;
	}
	public void setDelineTime(String delineTime) {
		this.delineTime = delineTime;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((MemberId == null) ? 0 : MemberId.hashCode());
		result = prime * result
				+ ((categroryId == null) ? 0 : categroryId.hashCode());
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result
				+ ((companyName == null) ? 0 : companyName.hashCode());
		result = prime * result
				+ ((companyType == null) ? 0 : companyType.hashCode());
		result = prime * result
				+ ((delineTime == null) ? 0 : delineTime.hashCode());
		result = prime * result
				+ ((isAuthenticate == null) ? 0 : isAuthenticate.hashCode());
		result = prime * result + ((keyWord == null) ? 0 : keyWord.hashCode());
		result = prime * result
				+ ((mainProduct == null) ? 0 : mainProduct.hashCode());
		result = prime * result
				+ ((productId == null) ? 0 : productId.hashCode());
		result = prime * result
				+ ((productPrice == null) ? 0 : productPrice.hashCode());
		result = prime * result
				+ ((productTitle == null) ? 0 : productTitle.hashCode());
		result = prime * result
				+ ((province == null) ? 0 : province.hashCode());
		result = prime * result
				+ ((publishTime == null) ? 0 : publishTime.hashCode());
		result = prime * result
				+ ((twoCategoryId == null) ? 0 : twoCategoryId.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		final PayMember other = (PayMember) obj;
		if (MemberId == null) {
			if (other.MemberId != null)
				return false;
		} else if (!MemberId.equals(other.MemberId))
			return false;
		if (categroryId == null) {
			if (other.categroryId != null)
				return false;
		} else if (!categroryId.equals(other.categroryId))
			return false;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (companyName == null) {
			if (other.companyName != null)
				return false;
		} else if (!companyName.equals(other.companyName))
			return false;
		if (companyType == null) {
			if (other.companyType != null)
				return false;
		} else if (!companyType.equals(other.companyType))
			return false;
		if (delineTime == null) {
			if (other.delineTime != null)
				return false;
		} else if (!delineTime.equals(other.delineTime))
			return false;
		if (isAuthenticate == null) {
			if (other.isAuthenticate != null)
				return false;
		} else if (!isAuthenticate.equals(other.isAuthenticate))
			return false;
		if (keyWord == null) {
			if (other.keyWord != null)
				return false;
		} else if (!keyWord.equals(other.keyWord))
			return false;
		if (mainProduct == null) {
			if (other.mainProduct != null)
				return false;
		} else if (!mainProduct.equals(other.mainProduct))
			return false;
		if (productId == null) {
			if (other.productId != null)
				return false;
		} else if (!productId.equals(other.productId))
			return false;
		if (productPrice == null) {
			if (other.productPrice != null)
				return false;
		} else if (!productPrice.equals(other.productPrice))
			return false;
		if (productTitle == null) {
			if (other.productTitle != null)
				return false;
		} else if (!productTitle.equals(other.productTitle))
			return false;
		if (province == null) {
			if (other.province != null)
				return false;
		} else if (!province.equals(other.province))
			return false;
		if (publishTime == null) {
			if (other.publishTime != null)
				return false;
		} else if (!publishTime.equals(other.publishTime))
			return false;
		if (twoCategoryId == null) {
			if (other.twoCategoryId != null)
				return false;
		} else if (!twoCategoryId.equals(other.twoCategoryId))
			return false;
		return true;
	}
	
}
