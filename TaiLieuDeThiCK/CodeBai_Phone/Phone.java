package Phoneeee;

public class Phone {
	private String name;
	private String brand;
	private double price;
	private int quality;
	public Phone(String name, String brand) {
		this.name=name;
		this.brand=brand;
		this.price=0;
		this.quality=0;
		
	}
	
	public Phone(String name, String brand, double price, int quality) {
		super();
		this.name = name;
		this.brand = brand;
		this.price = price;
		this.quality = quality;
	}

	public Phone() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuality() {
		return quality;
	}
	public void setQuality(int quality) {
		this.quality = quality;
	}
	
	public String toString() {
		return "Phone [name=" + name + ", brand=" + brand + ", price=" + price + ", quality=" + quality + "]";
	}
	
}
