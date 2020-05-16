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
				prod = new MensShoes(
					(int)details.get(0), 
					(float)details.get(1), 
					(int)details.get(2), 
					details.get(3).toString(), 
					details.get(4).toString(), 
					(int)details.get(5), 
					details.get(6).toString(), 
					details.get(7).toString()
					);
		} 
		else if(type.equalsIgnoreCase("wshoes") && details.size() == 8) {
				prod = new WomensShoes(
					(int)details.get(0), 
					(float)details.get(1), 
					(int)details.get(2), 
					details.get(3).toString(), 
					details.get(4).toString(), 
					(int)details.get(5), 
					details.get(6).toString(), 
					details.get(7).toString()
					);
		}
		else if(type.equalsIgnoreCase("macc")) {
			
		}
		else if(type.equalsIgnoreCase("wacc")) {
			
		}
		
		else {
			return false;
		}
		
		return true;
	}
	
//	public boolean delProduct(int id) {
//		// connect to DB and delete product id
//	}
//	public boolean singleReport(){
//		
//	}
//	public boolean fullReport() {
//		
//	}
//	public fetchProductList(DB connection) {
//		
//	}
}
