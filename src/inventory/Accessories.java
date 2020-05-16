package inventory;

public class Accessories extends Product{
	private String color;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public Accessories( int id, float price, int quantity, String name, String brand, String color) {
		super(id, price, quantity, name, brand);
		this.setColor(color);
	}
}
