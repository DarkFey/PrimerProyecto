package e;

public class Ejercicio_5 {

	public static void main(String[] args) {
		//int lado1,lado2,hipotenusa;
		double precio;
		char ch;
		boolean comprar,s;
		 //lado1 = 3;
		 precio = 325.6;
		 //lado2 = 4; 
		 comprar = false; 
		// hipotenusa = 5;
		 ch ='7';
		 
		 System.out.println("a) no da un booleano porque no hay variables booleanas ni operadores logicos en la sentencia");
		 s= (precio < 300 + 0.1 * precio) || comprar;
		 System.out.println("b) da "+s);
		 System.out.println("c) no da un booleano porque esta mal escrito");
		 //s=(! comprar)&&(precio + 125.3);
		 System.out.println("d) no da un booleano porque el operador && no puede ser usando con variables doubles");
		 s= (ch <= 'A') && comprar;
		 System.out.println("e) da "+s);
		 System.out.println("f) esta mal escrito ");

	}

}
