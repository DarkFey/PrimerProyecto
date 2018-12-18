package boletin_2;

import java.util.Scanner;

public class Ejercicio_9 {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		int x = 0, y = 0, z, t = 1;
		boolean safe = false;

		while (!safe) {
			System.out.println("Introduzca un numero");
			x = key.nextInt();
			key.nextLine();
			System.out.println("Elevado a");
			y = key.nextInt();
			key.nextLine();
			if (x < 0 || y < 0) {
				System.out.println("Error");
				safe = false;
			} else
				safe = true;
		}
		for (z = 1; z <= y; z++) {
			t = t * x;
		}
		System.out.printf("%d", t);
		key.close();
	}

}
