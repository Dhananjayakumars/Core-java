package methodoverriding;

public class Camera {
	
	int price;
	String brand;
	double weight;
	String Displaytype;
	
	public  Camera() {
		
	}
	public Camera(int inprice,String inbrand,double inweight,String inDisplaytype) {
		price=inprice;
		brand=inbrand;
		weight=inweight;
		Displaytype=inDisplaytype;
	}
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public String getDisplaytype() {
		return Displaytype;
	}
	public void setDisplaytype(String displaytype) {
		Displaytype = displaytype;
	}
	
	void capture() {
		System.out.println("capturing photos....");
	}
	void recording() {
		System.out.println("recording videos....");
	}
	
	void Displaydetails() {
		System.out.println("price : "+price+" brand : "+brand +" weight : "+weight+" Displaytype : "+Displaytype);
	}
	
	

}
