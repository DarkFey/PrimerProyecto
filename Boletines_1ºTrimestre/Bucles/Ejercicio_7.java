package boletin_2;

import java.util.Scanner;

public class Ejercicio_7 {
	/*
	 * 1.Petición de datos
	 * 2.Calculo de las suma de los numeros
	 * 3.Mostrar resultados
	 */

	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		int x = 0, y, z, par = 0, impar = 0;

		System.out.println("Introduzca un numero");
		x = key.nextInt();
		key.nextLine();
		System.out.println("Introduzca otro numero");
		y = key.nextInt();
		key.nextLine();
		for (z = x; z <= y; z++) {
			if (z % 2 == 0) {
				par = par + z;
			} else {
				impar = impar + z;
			}
		}
		System.out.printf("Par:%d %nImpar:%d", par, impar);
		key.close();
	}

}
