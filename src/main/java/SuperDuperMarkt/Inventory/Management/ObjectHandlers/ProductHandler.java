package SuperDuperMarkt.Inventory.Management.ObjectHandlers;

import java.io.File;
import java.util.ArrayList;

import SuperDuperMarkt.Inventory.Management.Objects.Product;

public class ProductHandler {
	ArrayList<Product> productlist;
	
	public void addProduct(Product product) {
		productlist.add(product);
	}
	
	public ArrayList<Product> remProduct(ArrayList<Product> productlist,Product product) {
		return null;
	}
	
	public ArrayList<Product> importProduct (File csvtxt) {
		/*
		try{
		    JAXBContext jc = JAXBContext.newInstance(TestBean.class);
		    Unmarshaller u = jc.createUnmarshaller();

		    File f = new File("C:\\file.txt");
		    TestBean test = (TestBean) u.unmarshal(f);

		}catch(Exception e){
		    e.printStackTrace();
		}
		*/
		return null;
	}
	
	/**
	 * 
	:addProduct (Product)
    :remProduct (Product)
    T:disposeProduckt
    ArrayList<Product>:importProduct =CSV, =Json, SQL
    ArrayList<Product>:displayAllProducts
	 */
}
