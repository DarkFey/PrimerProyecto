package boletin_2;

import java.util.Scanner;

public class Ejercicio_11 {
	/*
	 * 1.Introducir un numero.
	 * 2.Realizar la suma 
	 * 3.Localizar la cifra
	 * 4.mostrarla 
	 */

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		int x = 0, z, t = 0;
		boolean safe = false;

		while (!safe) {
			System.out.println("Introduzca un numero");
			x = key.nextInt();
			key.nextLine();
			if (x < 0) {
				System.out.println("Error");
				safe = false;
			} else
				safe = true;
		}
		for (z = 1; t < x; z++) {
			t = t + z;
		}
		System.out.printf("%d", z - 1);
		key.close();

	}

}
