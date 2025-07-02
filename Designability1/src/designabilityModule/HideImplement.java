package designabilityModule;

public class HideImplement {
	public static void main(String [] args)
	{
		Parent p = new ChildClass(1,1,1,1);
		p.behaviour();
		
	}
	
}
abstract class Parent{
	int a1;
	int a2;
	int a3;
	int a4;
	Parent(int a1, int a2, int a3, int a4)
	{
		this.a1 = a1;
		this.a2 = a2;
		this.a3 = a3;
		this.a4 = a4;
	}
	
	abstract public void behaviour();
}
class ChildClass extends Parent
{

	ChildClass(int a1, int a2, int a3, int a4) {
		super(a1, a2, a3, a4);
	}

	public void behaviour()
	{
		System.out.println("Overriddent the hidden method");
	}
}
