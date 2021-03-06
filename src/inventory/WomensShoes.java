package inventory;


public class WomensShoes extends Shoes{
	private enum style_types{
		stilettos,
		sandals,
		espradrilles,
		others;
	}
	private style_types style;
	
	public style_types getStyle() {
		return style;
	}

	public void setStyle(style_types style) {
		this.style = style;
	}
	
	public WomensShoes( int id, float price, int quantity, String name, String brand, int size, String color, String style) {
		super(id, price, quantity, name, brand, size, color);
		this.setStyle(style_types.valueOf(style));
		this.setSearchString(name + " " + brand + " "+ style);
	}
}
