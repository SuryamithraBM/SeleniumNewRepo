package designabilityModule;

public class GeneralizationofIceCreamParlour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IceCreamParlour icp = new CornerHouse("Ban", "QICE", 43.2f, "Choco", "Brown", "ButterScotch");
		CornerHouse ch = (CornerHouse) icp;
		ch.orderDetails();
	}

}
class IceCreamParlour
{
	String location;
	String name;
	float price;
	
	IceCreamParlour(String location, String name, float price)
	{
		this.location = location;
		this.name = name;
		this.price = price;
	}
}
class CornerHouse extends IceCreamParlour
{
	String type;
	String color;
	String toppings;
	
	CornerHouse(String location, String name, float price, String type, String color, String toppings)
	{
		super(location, name, price);
		this.type = type;
		this.color = color;
		this.toppings = toppings;
	}
	public void orderDetails()
	{
		System.out.println("#### Order Details ####");
		System.out.println("The location of the IceCreamParlour : " + location);
		System.out.println("The name of the IceCreamParlour : " + name);
		System.out.println("The price of the Ice Cream : "+ price);
		System.out.println("The type of the Ice Cream : " + type);
		System.out.println("The color of the Ice Cream : " + color);
		System.out.println("The toppings on the Ice Cream : " + toppings);
	}
}
