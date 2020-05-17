package inventory;

public class Accessories extends Product{
	private String color;
	private String size; 
	private types type;
	
	private enum types{
		socks, 
		belts,
		handbags;
	}
	
	public types getType() {
		return type;
	}

	public void setType(types type) {
		this.type = type;
	}
	
	public String getColor() {
		return color;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public Accessories( int id, float price, int quantity, String name, String brand, String color, String size, String type) {
		super(id, price, quantity, name, brand);
		this.setColor(color);
		this.setSize(size);
		this.setType(types.valueOf(type));
	}
}
