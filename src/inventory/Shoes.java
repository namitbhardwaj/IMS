package inventory;

public class Shoes extends Product{
	private int size;
	private String color;
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Shoes( int id, float price, int quantity, String name, String brand, int size, String color) {
		super(id, price, quantity, name, brand);
		this.setSize(size);
		this.setColor(color);
	}
}
