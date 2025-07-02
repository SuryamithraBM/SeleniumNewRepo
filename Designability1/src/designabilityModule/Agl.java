package designabilityModule;
import java.util.Scanner;

public class Agl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the user name : ");
		String un = scan.next();
		System.out.println("Enter the password : ");
		String pass = scan.next();
		System.out.println("Enter the noofconnections : ");
		int nc = scan.nextInt();
		System.out.println("Enter the brand : ");
		String b = scan.next();
		System.out.println("Enter the color : ");
		String clr = scan.next();
		
		LinkedIn link = new LinkedIn(un, nc);
		link.linkedinDetails();
		Laptop lap = new Laptop(b, clr);
		lap.installApp(clr, nc);
		lap.laptopDetails();
		lap.uninstallApp();
	}

}
class LinkedIn
{
	String username;
	private String password;
	int noofconnections;
	LinkedIn(String username, int noofconnections)
	{
		this.username = username;
		this.noofconnections = noofconnections;
	}
	public void linkedinDetails()
	{
		System.out.println("######## LINKEDIN DETAILS ########");
		System.out.println("username : " + username);
		System.out.println("noofconnections : " + noofconnections);
		System.out.println("####################################");
	}
}
class Laptop
{
	String brand;
	String color;
	LinkedIn l;
	
	Laptop(String brand, String color)
	{
		this.brand = brand;
		this.color = color;
	}
	public void installApp(String username, int noofconnections)
	{
		if (l == null)
		{
			l = new LinkedIn(username, noofconnections);
			System.out.println("Install ?");
		}
		else 
		{
			System.out.println("The app is already installed !");
		}
	}
	public void uninstallApp()
	{
		if (l != null)
		{
			System.out.println("Uninstall App ?");
		}
		else
		{
			System.out.println("App Not Found!");
		}
	}
	public void laptopDetails()
	{
		System.out.println("######### Laptop Details #########");
		System.out.println("brand : " + brand);
		System.out.println("color : " + color);
		System.out.println("color : " + color);
	}
}
