package boletin_2;

import java.util.Random;

public class Ejercicio_4 {
	/*
	 * Lanzar 20 veces un dado
	 */
	public static void main(String[] args) {
		Random ran = new Random();
		int dice, x;
		for (x = 1; x <= 20; x++) {
			dice = ran.nextInt(6) + 1;
			System.out.printf("Tirada nº %d: %d %n", x, dice);
		}

	}

}
