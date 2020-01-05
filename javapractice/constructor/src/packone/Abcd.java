package packone;

public class Abcd {
	Abcd()
	{
		System.out.println("this is constructor");
	}
	
public void m1()
{
	System.out.println("this is method");        
}
public static void main(String[] args) {
	Abcd n=new Abcd();//default constructor
	n.m1();
}
}

