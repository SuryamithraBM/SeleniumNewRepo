package designabilityModule;

import java.util.Scanner;

class Designability1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the brand of the jam : ");
		String bname = scan.next();
		System.out.println("Enter the color of the jam : ");
		String bcolor = scan.next();
		System.out.println("Enter the flavour of the jam : ");
		String flavour = scan.next();
		System.out.println("Enter the price of the jam : ");
		float jprice = scan.nextFloat();
		
		Jam j = new Jam(bname, bcolor, flavour, jprice);
		j.jamDetails();
		
		System.out.println("\n Enter the material of the bread : ");
		String bmaterial = scan.next();
		System.out.println("Enter the price of the bread : ");
		float breadprice = scan.nextFloat();
		System.out.println("Enter the quantity of the bread : ");
		int bquantity = scan.nextInt();
		System.out.println("Enter the type of the bread : ");
		String btype = scan.next();
		
		Bread b = new Bread(bmaterial, breadprice, bquantity, btype);
		b.breadDetails();
	}

}

class Jam
{
	String brand;
	String color;
	String flavour;
	float price;
	
	Jam()
	{
		
	}
	
	Jam(String brand, String color, String flavour, float price)
	{
		this.brand = brand;
		this.color = color;
		this.flavour = flavour;
		this.price = price;
	}
	
	public void jamDetails()
	{
		System.out.println("########## JAM DETAILS ###########");
		System.out.println("the brand of the jam : "+ brand);
		System.out.println("the color of the jam : "+ color);
		System.out.println("the flavour of the jam : "+ flavour);
		System.out.println("the price of the jam : "+ price);
	}
}
class Bread
{
	String material;
	float bprice;
	int quantity;
	String type;
	
	Bread(String material, float bprice, int quantity, String type)
	{
		this.material = material;
		this.bprice = bprice;
		this.quantity = quantity;
		this.type = type;
	}
	public void breadDetails()
	{
		System.out.println("########## Bread DETAILS ###########");
		System.out.println("the material of the bread : "+ material);
		System.out.println("the price of the bread : "+ bprice);
		System.out.println("the quantity of the bread : "+ quantity);
		System.out.println("the type of the bread : "+ type);
	}
}