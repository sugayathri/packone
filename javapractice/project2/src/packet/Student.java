package packet;



public class Student {

	public int a;
	public int b;

	public Student(int m1,int m2)//constructor
	{
		a=m1;
		b=m2;          /*if we want to access constructor to
		                other package keep public before student*/
	}
	//methods
	public void total()
	{
		System.out.println(a+b);
	}
	public void percentage()
	{
		System.out.println(a+b/2);
	}
	public static void main(String[] args) {
		Student s1=new Student(60,80);
		s1.total();
		s1.percentage();
		Student s2=new Student(80,80);
		s2.total();s2.percentage();
	}
	}
	
	
	


