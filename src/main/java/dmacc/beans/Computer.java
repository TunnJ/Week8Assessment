package dmacc.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Computer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String brand;
	private double price;
	private boolean isLaptop;
	
	public Computer() {
		this.price = 0;
	}
	
	public Computer(String brand, double price, boolean isLaptop) {
		this.brand = brand;
		this.price = price;
		this.isLaptop = isLaptop;
	}
	public Computer(String brand, int id, double price, boolean isLaptop) {
		this.brand = brand;
		this.id = id;
		this.price = price;
		this.isLaptop = isLaptop;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public boolean isLaptop() {
		return isLaptop;
	}

	public void setLaptop(boolean isLaptop) {
		this.isLaptop = isLaptop;
	}
	
	@Override
	public String toString() {
		return "Computer [id=" + id + ", brand=" + brand + ", price=" + price + ", isLaptop=" + isLaptop + "]";
	}
}
