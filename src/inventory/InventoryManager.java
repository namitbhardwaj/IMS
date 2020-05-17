package inventory;
import java.util.ArrayList;
import java.util.Iterator;

public class InventoryManager {
	ArrayList<Product> prodList = new ArrayList<Product>();
	
	public ArrayList<Product> getProdList() {
		return prodList;
	}
	public void setProdList(ArrayList<Product> prodList) {
		this.prodList = prodList;
	}
	
	public ArrayList<Product> search(String s){
		ArrayList<Product> pList = new ArrayList<Product>();
		Iterator<Product> it = pList.iterator();
		while(it.hasNext()) {
			Product obj = it.next();
			if(obj.getSearchString().matches(s)) {
				pList.add(obj);
			}
		}
		return pList;
	}
	public boolean addProduct(String type, ArrayList<Object> details) {
		Product prod;
		// add to DB directly
		if(type.equalsIgnoreCase("mshoes") && details.size()==8) {
				//add to DB
			return true;
		} 
		else if(type.equalsIgnoreCase("wshoes") && details.size() == 8) {
				//add to DB
			return true;
		}
		else if(type.equalsIgnoreCase("acc")) {
			// add to DB
			return true;
		}
		else {
			return false;
		}
		
	}
	
	public boolean delProduct(int id) {
		// get the ID of the object which has been clicked on 
		// and delete it from the database and reload the UI page
		return true;
	}
//	public boolean singleReport(){
//		
//	}
//	public boolean fullReport() {
//		
//	}
	public ArrayList<Product> fetchProductList() {
		// while fetching from DB you need to know if it is mens shoes or womens shoes or an accessory 
		// make an object for that as shown below
//		MensShoes = new MensShoes(int a, intb, check the mens shoes file for the constructor);
		ArrayList<Product> pList = new ArrayList<Product>();
		return pList;
	}
}
