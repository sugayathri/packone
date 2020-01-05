package packet;

public class Equal {
	public static void main(String[] args) {
		String a="parachute";
		String b="PARACHUTE";
		System.out.println("a=" +a.equals(b));
System.out.println("a=" +a.equalsIgnoreCase(b));/*ignores case sensitive if it is upper case also it prints true 
                                                       because it ignores upper or lower it only checks equal or not 
                                                        word parachute*/
	}

}
