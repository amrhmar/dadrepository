package Exercise2;

import java.io.Serializable;

public class Parcel implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private double weight;
	private double price;
	private String name1;
	private String name2;
	
	public double getWeight() {
		return weight;
	}
	
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	public String getName1() {
		return name1;
	}
	
	public void setName1(String name1) {
		this.name1 = name1;
	}
	
	public String getName2() {
		return name2;
	}
	
	public void setName2(String name2) {
		this.name2 = name2;
	}

}