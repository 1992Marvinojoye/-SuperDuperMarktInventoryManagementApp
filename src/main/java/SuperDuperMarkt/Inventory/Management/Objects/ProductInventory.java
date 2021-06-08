package SuperDuperMarkt.Inventory.Management.Objects;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProductInventory {

	private List<Product> productlist = new ArrayList<>();
	
	public void addProduct (Product p) {
		productlist.add(p);
	}
	
	public void removeProduct (Product p) {
		productlist = productlist.stream().filter(b-> b.getId() != p.getId()).collect(Collectors.toList());
	}
	
}
