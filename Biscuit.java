
public class Biscuit {
	String brand;
	int price;
	double weight;
	
	public Biscuit() {
		
	}
	public Biscuit(String inbrand,int inprice,double inweight) {
		brand=inbrand;
		price=inprice;
		weight=inweight;
	}
	
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	void sweet() {
		System.out.println("biscuit is sweet...");
	}
	void cream() {
		System.out.println(" Choco Fill");
	}
	
	void Displaydetails() {
		System.out.println("\"brand : \"+brand+\" price : \"+price+\"weight : \"+weight");
	}
	

}
