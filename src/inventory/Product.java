package inventory;

public class Product {
	private int id;
	private float price;
	private int quantity;
	private String name;
	private String brand;
	private float value;
	private String searchString;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public float getValue() {
		return value;
	}
	public void setValue(float value) {
		this.value = value;
	}
	
	public String getSearchString() {
		return searchString;
	}
	public void setSearchString(String searchString) {
		this.searchString = searchString;
	}
	public Product( int id, float price, int quantity, String name, String brand) {
		this.setId(id);
		this.setPrice(price);
		this.setQuantity(quantity);
		this.setName(name);
		this.setBrand(brand);
		this.setValue(quantity*price);
		this.setSearchString(name + " " + brand);
	}
	
}
