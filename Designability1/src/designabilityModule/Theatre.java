package designabilityModule;

public class Theatre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Theatre t = new Theatre();
		Theatre t = new Movie();
		t.movie();
		t.movie();
		
	}
	public void movie()
	{
		System.out.println("Hello!");
	}

}
class Movie extends Theatre
{
	public void movie()
	{
		System.out.println("Bye!");
	}
}