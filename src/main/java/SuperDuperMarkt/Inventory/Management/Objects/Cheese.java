package SuperDuperMarkt.Inventory.Management.Objects;

import java.math.BigDecimal;
import java.time.LocalDate;

import SuperDuperMarkt.Inventory.Management.Utilities.QualityState;

public class Cheese extends Product{
	
	// Base QuallityRate for Cheese Test
	
	public Cheese() {
		super();
		super.setCurrentPrise(calculatePrise());
	}
	
	
	@Override
	public String toString() {
		return super.toString() +
		
		// TODO Auto-generated 
		 new StringBuffer()
			.append("Catagory:").append(category).append("\n")
			.append("Brand:").append(brand).append("\n")
	        .append("Expiredate:").append(expireDate).append("\n")
	        .append("QualityName:").append(qualityName).append("\n")
	        .append("QualityRate:").append(qualityRate).append("\n")
		       
		       .toString();
	}
	public BigDecimal calculatePrise () {
		//setCurrentPrise();
		// p.BasePrise + 0.1(€) + p.QualityRate
		
		
		
		return getBasePrise().add(new BigDecimal(0.1)).add(new BigDecimal(getQualityRate()));
	}
	
	
}

/**
// To set two dates to two variables
    var date1 = new Date("06/30/2019");
var date2 = new Date("07/30/2019");
  
// To calculate the time difference of two dates
var Difference_In_Time = date2.getTime() - date1.getTime();
  
// To calculate the no. of days between two dates
var Difference_In_Days = Difference_In_Time / (1000 * 3600 * 24);
*/