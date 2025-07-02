package designabilityModule;

public class Jeep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Jeep1 j1 = new Jeep1("Jeep","Jeep", 2000000);
		j1.driving();
	}

}
class Jeep1
{
	/*private String brand;
	private String name;
	private float price;*/
	 String brand;
	 String name;
	 float price;
	 
	
	Jeep1(String brand, String name, float price)
	{
		this.brand = brand;
		this.name = name;
		this.price = price;
	}
	
	public String getBrand()
	{
		return brand;
	}
	public void setBrand(String brand)
	{
		this.brand = brand;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public float getPrice()
	{
		return price;
	}
	public void setPrice(float price)
	{
		this.price = price;
	}
	public void driving()
	{
		System.out.println("Driving!");
		
	}
}