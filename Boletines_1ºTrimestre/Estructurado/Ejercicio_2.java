package e;

public class Ejercicio_2 {
	
	public static void main(String[] args) {
		boolean a=true,b=false,c=true,d;
		d=a&&b||a&&c;
		System.out.println(d);
		d=(a||!b)&&(!a||c);
		System.out.println(d);
		d=a||b&&c;
		System.out.println(d);
		d=!(a||b)&&c;
		System.out.println(d);
		
	}

}
