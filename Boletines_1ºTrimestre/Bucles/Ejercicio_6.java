package boletin_2;

import java.util.Scanner;

public class Ejercicio_6 {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		double x, y, z, t;
		boolean safe = false;
		while (!safe) {
			System.out.println("Introduzca el primer numero");
			x = key.nextDouble();
			key.nextLine();
			System.out.println("Introduzca el segundo numero");
			y = key.nextDouble();
			key.nextLine();
			System.out.println("Operación deseada:1.Suma,2.Resta,3.Multiplicar,4.Dividir");
			z = key.nextDouble();
			key.nextLine();
			if (z == 1) {
				t = x + y;
				System.out.printf("%.2f", t);
				safe = true;
			} else if (z == 2) {
				t = x - y;
				System.out.printf("%.2f", t);
				safe = true;
			} else if (z == 3) {
				t = x * y;
				System.out.printf("%.2f", t);
				safe = true;
			} else if (z == 4) {
				t = x / y;
				System.out.printf("%.2f", t);
				safe = true;
			} else {
				System.out.println("Error");
				safe = false;
			}
		}
		key.close();
	}
}
