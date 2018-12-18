package boletin_2;

import java.util.Scanner;

public class Ejercicio_3 {
	/*
	 * 1) Pedir 10 notas y contar cuantas son muy deficientes,insuficientes,bien,notable y sobresalientes
	 * 2)Mostrar resultados 
	 */
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		int x = 0, y, F = 0, E = 0, D = 0, C = 0, B = 0, A = 0;
		boolean safe = false;

		for (y = 1; y <= 10; y++) {
			safe = false;
			while (!safe) {
				System.out.printf("Introduce la nota nº %d %n", y);
				x = key.nextInt();
				key.nextLine();
				if (x < 0 || x > 10) {
					System.out.println("Error");
					safe = false;
				} else
					safe = true;
			}
			if (x >= 0 && x <= 2) {
				F++;
			} else if (x >= 3 && x <= 4) {
				E++;
			} else if (x == 5) {
				D++;
			} else if (x == 6) {
				C++;
			} else if (x >= 7 && x <= 8) {
				B++;
			} else {
				A++;
			}
		}
		System.out.printf(
				"Nº de muy deficiente: %d %n Nº de deficiente: %d %n Nº de suficientes: %d %n Nº de bien: %d %n Nº de notables: %d %n Nº de sobresalientes: %d %n ",
				F, E, D, C, B, A);

		key.close();
	}

}
