package boletin_2;

import java.util.Scanner;

public class Ejercicio_1 {

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		byte x, y;

		System.out.println("Tabla de ? (Elija un numero de 1 a 10)");
		x = key.nextByte();
		key.nextLine();
		System.out.printf("Tabla del %d %n", x);
		for (y = 1; y <= 10; y++) {
			System.out.printf("%d %n", x * y);
		}

		key.close();

	}

}
