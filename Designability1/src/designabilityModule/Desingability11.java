package designabilityModule;

import java.util.Scanner;

class Desingability11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the type of the Sambar :");
		String stype = scan.next();
		System.out.println("Enter the vegisused for the Sambar :");
		String svegisused = scan.next();
		System.out.println("Enter the taste of the Sambar :");
		String staste = scan.next();
		
		Sambar s = new Sambar(stype, svegisused, staste);
		s.sambarDetails();
		
		System.out.println("\n Enter the number of the idlies :");
		int noidly = scan.nextInt();
		System.out.println("Enter the price of the idlies :");
		float idlyprice = scan.nextFloat();
		System.out.println("Enter the color of the idlies :");
		String idlycolor = scan.next();
		
		Idli i = new Idli(noidly, idlyprice, idlycolor);
		i.idlyDetails();
		i.idlywithSambar(stype, svegisused, staste);
		i.idlywithoutSambar();
	}

}
class Sambar 
{
	String type;
	String vegisused;
	String taste;
	
	Sambar()
	{
		
	}
	
	Sambar(String type, String vegisused, String taste)
	{
		this(); // constructor chaining 
		this.type = type;
		this.vegisused = vegisused;
		this.taste = taste;
	}
	
	public void sambarDetails()
	{
		System.out.println("######## SAMBAR DETAILS ########");
		System.out.println("the type of the Sambar :"+ type);
		System.out.println("the vegisused for the Sambar :"+ vegisused);
		System.out.println("the taste of the Sambar :"+ taste);
	}
}
class Idli
{
	int noofIdlies;
	float price;
	String color;
	Sambar sambar;
	
	Idli( int noofIdlies, float price, String color)
	{
		this.noofIdlies = noofIdlies;
		this.price = price;
		this.color = color;
	}
	public void idlyDetails()
	{
		System.out.println("######## IDLY DETAILS ########");
		System.out.println("the number of the idlies :"+ noofIdlies);
		System.out.println("the price of the idlies :"+ price);
		System.out.println("the color of the idlies :"+ color);
	}
	public void idlywithSambar(String type, String vegisused, String taste)
	{
		sambar = new Sambar(type, vegisused, taste);
		System.out.println("Idly with Sambar!");
	}
	public void idlywithoutSambar()
	{
		if (sambar == null)
		{
			sambar = null;
			System.out.println("Idly without Sambar!");
		}
		else
		{
			System.out.println("Served!");
		}
	}
}