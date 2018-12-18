package boletin_2;

import java.util.Scanner;

public class Ejercicio_10 {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		int x = 0, z, t = 1;
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
		for (z = 1; z <= x; z++) {
			t = t * z;
		}
		System.out.printf("%d", t);
		key.close();

	}

}
