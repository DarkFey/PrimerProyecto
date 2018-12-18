package boletin_2;

import java.util.Scanner;

public class Ejercicio_12 {
	/*
	 * 1.Pedir un numero
	 * 2.Crear secuencia de Fibonacci
	 * 3.Mostrar el numero que exceda o iguale el solicitado
	 */

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		int x = 10, fibo1 = 0, fibo2 = 1, fibo3;
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

		do {
			fibo3 = fibo1;
			fibo1 = fibo2;
			fibo2 = fibo3 + fibo1;

		} while (fibo2 < x);
		System.out.printf("El numero buscado es %d", fibo2);
		key.close();

	}

}
