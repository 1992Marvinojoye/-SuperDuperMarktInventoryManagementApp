package SuperDuperMarkt.Inventory.Management.Objects;

import java.math.BigDecimal;
import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import SuperDuperMarkt.Inventory.Management.Utilities.QualityState;

@JsonPropertyOrder({
    "id",
    "brand",
    "category",
    "expireDate",
    "currentPrise",
})
public abstract class Product {
	
	@JsonProperty("id")
	private long id;

	@JsonProperty("brand")
	protected String brand;
	
	@JsonProperty("category")
	protected String category;
	
	@JsonProperty("expireDate")
	protected LocalDate expireDate;
	
	@JsonProperty("currentPrise")
	protected BigDecimal currentPrise;
	
	@JsonProperty("basePrise")
	protected BigDecimal basePrise;
	
	@JsonProperty("productstate")
	protected Boolean productstate;
	
	@JsonProperty("qualityName")
	protected String qualityName;
	
	@JsonProperty("qualityRate")
	protected Integer qualityRate;
	
	@JsonProperty("qualityState")
	protected QualityState qualityStateEnum;

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}
	
	/**
	 * @return the brand
	 */
	public String getBrand() {
		return brand;
	}

	/**
	 * @param brand the brand to set
	 */
	public void setBrand(String brand) {
		brand = brand;
	}

	/**
	 * @return the category
	 */
	public String getCategory() {
		return category;
	}

	/**
	 * @param category the category to set
	 */
	public void setCategory(String category) {
		category = category;
	}

	/**
	 * @return the expireDate
	 */
	public LocalDate getExpireDate() {
		return expireDate;
	}

	/**
	 * @param expireDate the expireDate to set
	 */
	public void setExpireDate(LocalDate expireDate) {
		expireDate = expireDate;
	}

	/**
	 * @return the currentPrise
	 */
	public BigDecimal getCurrentPrise() {
		return currentPrise;
	}

	/**
	 * @param currentPrise the currentPrise to set
	 */
	public void setCurrentPrise(BigDecimal currentPrise) {
		currentPrise = currentPrise;
	}

	/**
	 * @return the basePrise
	 */
	public BigDecimal getBasePrise() {
		return basePrise;
	}

	/**
	 * @param basePrise the basePrise to set
	 */
	public void setBasePrise(BigDecimal basePrise) {
		basePrise = basePrise;
	}

	/**
	 * @return the productstate
	 */
	public Boolean getProductstate() {
		return productstate;
	}

	/**
	 * @param productstate the productstate to set
	 */
	public void setProductstate(Boolean productstate) {
		productstate = productstate;
	}

	/**
	 * @return the qualityName
	 */
	public String getQualityName() {
		return qualityName;
	}

	/**
	 * @param qualityName the qualityName to set
	 */
	public void setQualityName(String qualityName) {
		qualityName = qualityName;
	}

	/**
	 * @return the qualityRate
	 */
	public Integer getQualityRate() {
		return qualityRate;
	}

	/**
	 * @param qualityRate the qualityRate to set
	 */
	public void setQualityRate(Integer qualityRate) {
		qualityRate = qualityRate;
	}

	/**
	 * @return the qualityStateEnum
	 */
	public QualityState getQualityStateEnum() {
		return qualityStateEnum;
	}

	/**
	 * @param qualityStateEnum the qualityStateEnum to set
	 */
	public void setQualityStateEnum(QualityState qualityStateEnum) {
		qualityStateEnum = qualityStateEnum;
		this.qualityRate = qualityStateEnum.getRate();
		this.qualityName = qualityStateEnum.getQuality();
	}

	public Product(String brand, String category, LocalDate expireDate, BigDecimal currentPrise, BigDecimal basePrise,
			Boolean productstate, String qualityName, Integer qualityRate, QualityState qualityStateEnum) {
		super();
		brand = brand;
		category = category;
		expireDate = expireDate;
		currentPrise = currentPrise;
		basePrise = basePrise;
		productstate = productstate;
		qualityName = qualityName;
		qualityRate = qualityRate;
		qualityStateEnum = qualityStateEnum;
	}
	
	public Product() {
		super();
		/*
		category = category;
		expireDate = expireDate;
		CurrentPrise = currentPrise;
		basePrise = basePrise;
		productstate = productstate;
		qualityName = qualityName;
		qualityRate = qualityRate;
		qualityStateEnum = qualityStateEnum;
		*/
		this.toString();
	}
	
	@Override
	public String toString() {
		
		
		// TODO Auto-generated method stub totString { Category, Brand, Expiredate, QualityName (QualityRate {Int}),  }
		return new StringBuffer()
			.append("Catagory:").append(category).append("\n")
			.append("Brand:").append(brand).append("\n")
	        .append("Expiredate:").append(expireDate).append("\n")
	        .append("QualityName:").append(qualityName).append("\n")
	        .append("QualityRate:").append(qualityRate).append("\n")
		 
		       .toString();
	}
}
