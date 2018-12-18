package e;

public class Ejercicio_4 {

	public static void main(String[] args) {
		int x,y;
		boolean j,s;
		x=10; y=19;j=true;
		s=x==y||j;//a)
		System.out.println("a) s=x==y||j. "+s);
		s=x>=y||x<=y&&j;
		System.out.println("b) x>=y||x<=y&&j "+s);
		s=!j||j;
		System.out.println("c) !j||j "+s);
		//s=!(k&&k);
		System.out.println("d) !(k&&k) "+s);
	}

}
