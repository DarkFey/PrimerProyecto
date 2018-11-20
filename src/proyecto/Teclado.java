package proyecto;

import java.util.Scanner;

public class Teclado {
	static Scanner keyboard;

	public static void main(String[] args) {

	}

	static void CerrarTeclado() {
		keyboard.close();
	}

	static Character LeerCaracter() {
		boolean safe = false;
		String a;
		char b;
		System.out.println("Introduzca un caracter");
		do {
			a = keyboard.next();
			if (a.length() >= 2) {
				System.out.println("Eso no es un caracter,introduzca un caracter");
			} else {
				safe = true;
			}
		} while (safe = false);
		b = a.charAt(0);
		return b;
	}

	static String LeerCadena() {
		String a;
		System.out.println("Introduzca una cadena");
		a = keyboard.next();
		return a;
	}

	static Boolean LeerBoolean(String a, String b, String c) {
		boolean result = false, safe = false;
		byte decision;
		System.out.printf("%s %n %t1.%s %n %t2.%s", a, b, c);
		do {
			decision = keyboard.nextByte();
			if (decision != 1 && decision != 2) {
				System.out.println("Introduce un valor valido");
			} else if (decision == 1) {
				result = true;
				safe = true;
			} else {
				safe = true;
			}
		} while (safe = false);
		return result;
	}

	static Boolean LeerBoolean(String a) {
		boolean result = false, safe = false;
		String decision;
		System.out.printf("%s", a);
		do {
			decision = keyboard.next();
			decision = decision.toLowerCase();
			if (decision != "s" && decision != "n") {
				System.out.println("Introduce un valor valido");
			} else if (decision == "s") {
				result = true;
				safe = true;
			} else {
				safe = true;
			}
		} while (safe = false);
		return result;
	}

	static Byte LeerByte() {
		byte a;
		System.out.println("Introduzca un numero");
		a = keyboard.nextByte();
		return a;
	}

	static Short LeerShort() {
		short a;
		System.out.println("Introduzca un numero");
		a = keyboard.nextShort();
		return a;
	}

	static Integer LeerInt() {
		int a;
		System.out.println("Introduzca un numero");
		a = keyboard.nextInt();
		return a;
	}

	static Long LeerLong() {
		long a;
		System.out.println("Introduzca un numero");
		a = keyboard.nextLong();
		return a;
	}

	static Float LeerFloat() {
		float a;
		System.out.println("Introduzca un numero");
		a = keyboard.nextFloat();
		return a;
	}

	static Double LeerDouble() {
		double a;
		System.out.println("Introduzca un numero");
		a = keyboard.nextDouble();
		return a;
	}
}
