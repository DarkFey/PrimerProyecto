package proyecto;

import java.util.Scanner;

public class Teclado {
	static Scanner keyboard;

	public enum Option {
		Mayor, Menor, MayorIgual, MenorIgual
	}

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

	static Byte LeerNumParametro(byte x, Option y) {
		byte a = 0;
		boolean safe = false;
		//Se comprueba el enum para designar una pregunta
		if (y == Option.Mayor) {
			//Petición de digito
			System.out.printf("Introduzca un numero mayor a %d", x);
			//Bucle de seguridad
			do {
				a = keyboard.nextByte();
				if (a <= x) {
					System.out.println("Valor no deseado,intente de nuevo");
				} else {
					safe = true;
				}
			} while (safe = false);
		} else if (y == Option.Menor) {
			//Petición de digito
			System.out.printf("Introduzca un numero menor a %d", x);
			//Bucle de seguridad
			do {
				a = keyboard.nextByte();
				if (a >= x) {
					System.out.println("Valor no deseado,intente de nuevo");
				} else {
					safe = true;
				}
			} while (safe = false);
		} else if (y == Option.MayorIgual) {
			//Petición de digito
			System.out.printf("Introduzca un numero mayor o igual a %d", x);
			//Bucle de seguridad
			do {
				a = keyboard.nextByte();
				if (a < x) {
					System.out.println("Valor no deseado,intente de nuevo");
				} else {
					safe = true;
				}
			} while (safe = false);
		} else if (y == Option.MenorIgual) {
			//Petición de digito
			System.out.printf("Introduzca un numero menor o igual a %d", x);
			//Bucle de seguridad
			do {
				a = keyboard.nextByte();
				if (a > x) {
					System.out.println("Valor no deseado,intente de nuevo");
				} else {
					safe = true;
				}
			} while (safe = false);
		} else {
			System.out.println("Error en el enum");
		}
		return a;
	}

	static Short LeerNumParametro(short x, Option y) {
		short a = 0;
		boolean safe = false;
		//Se comprueba el enum para designar una pregunta
		if (y == Option.Mayor) {
			//Petición de digito
			System.out.printf("Introduzca un numero mayor a %d", x);
			//Bucle de seguridad
			do {
				a = keyboard.nextShort();
				if (a <= x) {
					System.out.println("Valor no deseado,intente de nuevo");
				} else {
					safe = true;
				}
			} while (safe = false);
		} else if (y == Option.Menor) {
			//Petición de digito
			System.out.printf("Introduzca un numero menor a %d", x);
			//Bucle de seguridad
			do {
				a = keyboard.nextShort();
				if (a >= x) {
					System.out.println("Valor no deseado,intente de nuevo");
				} else {
					safe = true;
				}
			} while (safe = false);
		} else if (y == Option.MayorIgual) {
			//Petición de digito
			System.out.printf("Introduzca un numero mayor o igual a %d", x);
			//Bucle de seguridad
			do {
				a = keyboard.nextShort();
				if (a < x) {
					System.out.println("Valor no deseado,intente de nuevo");
				} else {
					safe = true;
				}
			} while (safe = false);
		} else if (y == Option.MenorIgual) {
			//Petición de digito
			System.out.printf("Introduzca un numero menor o igual a %d", x);
			//Bucle de seguridad
			do {
				a = keyboard.nextShort();
				if (a > x) {
					System.out.println("Valor no deseado,intente de nuevo");
				} else {
					safe = true;
				}
			} while (safe = false);
		} else {
			System.out.println("Error en el enum");
		}
		return a;
	}

	static Integer LeerNumParametro(int x, Option y) {
		int a = 0;
		boolean safe = false;
		//Se comprueba el enum para designar una pregunta
		if (y == Option.Mayor) {
			//Petición de digito
			System.out.printf("Introduzca un numero mayor a %d", x);
			//Bucle de seguridad
			do {
				a = keyboard.nextInt();
				if (a <= x) {
					System.out.println("Valor no deseado,intente de nuevo");
				} else {
					safe = true;
				}
			} while (safe = false);
		} else if (y == Option.Menor) {
			//Petición de digito
			System.out.printf("Introduzca un numero menor a %d", x);
			//Bucle de seguridad
			do {
				a = keyboard.nextInt();
				if (a >= x) {
					System.out.println("Valor no deseado,intente de nuevo");
				} else {
					safe = true;
				}
			} while (safe = false);
		} else if (y == Option.MayorIgual) {
			//Petición de digito
			System.out.printf("Introduzca un numero mayor o igual a %d", x);
			//Bucle de seguridad
			do {
				a = keyboard.nextInt();
				if (a < x) {
					System.out.println("Valor no deseado,intente de nuevo");
				} else {
					safe = true;
				}
			} while (safe = false);
		} else if (y == Option.MenorIgual) {
			//Petición de digito
			System.out.printf("Introduzca un numero menor o igual a %d", x);
			//Bucle de seguridad
			do {
				a = keyboard.nextInt();
				if (a > x) {
					System.out.println("Valor no deseado,intente de nuevo");
				} else {
					safe = true;
				}
			} while (safe = false);
		} else {
			System.out.println("Error en el enum");
		}
		return a;
	}

	static Long LeerNumParametro(long x, Option y) {
		long a = 0;
		boolean safe = false;
		//Se comprueba el enum para designar una pregunta
		if (y == Option.Mayor) {
			//Petición de digito
			System.out.printf("Introduzca un numero mayor a %d", x);
			//Bucle de seguridad
			do {
				a = keyboard.nextLong();
				if (a <= x) {
					System.out.println("Valor no deseado,intente de nuevo");
				} else {
					safe = true;
				}
			} while (safe = false);
		} else if (y == Option.Menor) {
			//Petición de digito
			System.out.printf("Introduzca un numero menor a %d", x);
			//Bucle de seguridad
			do {
				a = keyboard.nextLong();
				if (a >= x) {
					System.out.println("Valor no deseado,intente de nuevo");
				} else {
					safe = true;
				}
			} while (safe = false);
		} else if (y == Option.MayorIgual) {
			//Petición de digito
			System.out.printf("Introduzca un numero mayor o igual a %d", x);
			//Bucle de seguridad
			do {
				a = keyboard.nextLong();
				if (a < x) {
					System.out.println("Valor no deseado,intente de nuevo");
				} else {
					safe = true;
				}
			} while (safe = false);
		} else if (y == Option.MenorIgual) {
			//Petición de digito
			System.out.printf("Introduzca un numero menor o igual a %d", x);
			//Bucle de seguridad
			do {
				a = keyboard.nextLong();
				if (a > x) {
					System.out.println("Valor no deseado,intente de nuevo");
				} else {
					safe = true;
				}
			} while (safe = false);
		} else {
			System.out.println("Error en el enum");
		}
		return a;
	}

	static Float LeerNumParametro(float x, Option y) {
		float a = 0;
		boolean safe = false;
		//Se comprueba el enum para designar una pregunta
		if (y == Option.Mayor) {
			//Petición de digito
			System.out.printf("Introduzca un numero mayor a %d", x);
			//Bucle de seguridad
			do {
				a = keyboard.nextFloat();
				if (a <= x) {
					System.out.println("Valor no deseado,intente de nuevo");
				} else {
					safe = true;
				}
			} while (safe = false);
		} else if (y == Option.Menor) {
			//Petición de digito
			System.out.printf("Introduzca un numero menor a %d", x);
			//Bucle de seguridad
			do {
				a = keyboard.nextFloat();
				if (a >= x) {
					System.out.println("Valor no deseado,intente de nuevo");
				} else {
					safe = true;
				}
			} while (safe = false);
		} else if (y == Option.MayorIgual) {
			//Petición de digito
			System.out.printf("Introduzca un numero mayor o igual a %d", x);
			//Bucle de seguridad
			do {
				a = keyboard.nextFloat();
				if (a < x) {
					System.out.println("Valor no deseado,intente de nuevo");
				} else {
					safe = true;
				}
			} while (safe = false);
		} else if (y == Option.MenorIgual) {
			//Petición de digito
			System.out.printf("Introduzca un numero menor o igual a %d", x);
			//Bucle de seguridad
			do {
				a = keyboard.nextFloat();
				if (a > x) {
					System.out.println("Valor no deseado,intente de nuevo");
				} else {
					safe = true;
				}
			} while (safe = false);
		} else {
			System.out.println("Error en el enum");
		}
		return a;
	}

	static Double LeerNumParametro(double x, Option y) {
		double a = 0;
		boolean safe = false;
		//Se comprueba el enum para designar una pregunta
		if (y == Option.Mayor) {
			//Petición de digito
			System.out.printf("Introduzca un numero mayor a %d", x);
			//Bucle de seguridad
			do {
				a = keyboard.nextDouble();
				if (a <= x) {
					System.out.println("Valor no deseado,intente de nuevo");
				} else {
					safe = true;
				}
			} while (safe = false);
		} else if (y == Option.Menor) {
			//Petición de digito
			System.out.printf("Introduzca un numero menor a %d", x);
			//Bucle de seguridad
			do {
				a = keyboard.nextDouble();
				if (a >= x) {
					System.out.println("Valor no deseado,intente de nuevo");
				} else {
					safe = true;
				}
			} while (safe = false);
		} else if (y == Option.MayorIgual) {
			//Petición de digito
			System.out.printf("Introduzca un numero mayor o igual a %d", x);
			//Bucle de seguridad
			do {
				a = keyboard.nextDouble();
				if (a < x) {
					System.out.println("Valor no deseado,intente de nuevo");
				} else {
					safe = true;
				}
			} while (safe = false);
		} else if (y == Option.MenorIgual) {
			//Petición de digito
			System.out.printf("Introduzca un numero menor o igual a %d", x);
			//Bucle de seguridad
			do {
				a = keyboard.nextDouble();
				if (a > x) {
					System.out.println("Valor no deseado,intente de nuevo");
				} else {
					safe = true;
				}
			} while (safe = false);
		} else {
			System.out.println("Error en el enum");
		}
		return a;
	}
}