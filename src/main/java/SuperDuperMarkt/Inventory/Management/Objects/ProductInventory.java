package SuperDuperMarkt.Inventory.Management.Objects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.commons.lang3.ArrayUtils;



public class ProductInventory {

	private ArrayList<? extends Product> productlist = new ArrayList<Product>();

	public void addProduct(Product p) {
		Product[] productarray = ArrayUtils.insert(-1,(Product[]) productlist.toArray(), p);
		productlist = (ArrayList<? extends Product>) Arrays.asList(productarray);
	}

	public void removeProduct(Product p) {
		productlist = (ArrayList<? extends Product>) productlist.stream().filter(b -> b.getId() != p.getId())
				.collect(Collectors.toList());
	}

}
