package boletin_2;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio_5 {
	/*
	 * Solicitar rango
	 */
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		Random ran = new Random();
		int x, y, z, t, max = 0, min = 0;
		boolean safe = false;
		while (!safe) {
			System.out.println("Introduzca un numero");
			x = key.nextInt();
			key.nextLine();
			System.out.println("Introduzca otro numero");
			y = key.nextInt();
			key.nextLine();
			if (y > x) {
				max = y;
				min = x;
				safe = true;
			} else if (y == x) {
				System.out.println("Error");
				safe = false;
			} else {
				max = x;
				min = y;
				safe = true;
			}
		}

		for (z = 1; z <= 15; z++) {
			t = ran.nextInt(max - (min + 1)) + min;
			System.out.printf("Numero nº %d: %d %n", z, t);
		}
		key.close();
	}

}
