package boletin_2;

import java.util.Scanner;

public class Ejercicio_16 {
	/*
	 * Declarar numero
	 * Ver el numero de cifras
	 * Dividir entre 10 para sacar el resto de la operación
	 * Suma los restos multiplicado por su posición 
	 */
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		Integer a, x, y, resto, longitud;
		Double z = 0.0, unidad, result = 0.0;
		String cifras;

		System.out.println("Introduce un numero para invertir");
		a = key.nextInt();
		key.nextLine();
		x = a;
		cifras = x.toString(x);
		longitud = cifras.length();
		for (y = longitud; y >= 1; y--) {
			z = (double) y - 1;
			unidad = Math.pow(10.0, z);
			resto = x % 10;
			x = x / 10;
			result = result + (resto * unidad);
		}
		if (a < 0) {
			result = result / 10;
		}

		System.out.printf("%.0f", result);
		key.close();
	}
}
