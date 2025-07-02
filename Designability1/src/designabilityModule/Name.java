package designabilityModule;

class H
{
	public static void main(String[] args)
	{
		Child c = new Child();
		System.out.println(c.a);
		System.out.println(c.b);
		System.out.println(c.x);
		c.meth();
	}
	
}
interface Names 
{
	static int a = 10;
	static int b = 20;
	static final int x = 0;
	abstract public void meth();
}
class Child implements Names
{
	public void meth()
	{
		System.out.println("Hello");
	}
}