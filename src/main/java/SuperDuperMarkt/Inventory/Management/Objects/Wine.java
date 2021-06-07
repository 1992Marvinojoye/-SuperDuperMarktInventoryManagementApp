package SuperDuperMarkt.Inventory.Management.Objects;

import java.math.BigDecimal;

public class Wine extends Product{
	public Wine() {
		super();
		super.setBasePrise(calculatePrise());
	}

	public BigDecimal calculatePrise () {
		//setCurrentPrise();
		
		return getCurrentPrise();
	}
}
