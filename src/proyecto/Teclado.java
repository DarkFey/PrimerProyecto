package proyecto;

import java.util.Scanner;

public class Teclado {
	static Scanner keyboard;

	public enum Option {
		Mayor, Menor, MayorIgual, MenorIgual
	}

	public enum Option_2 {
		Incluidos, Excluidos, MaxIncluido, MinIncluido
	}

	//CIERRE DE TECLADO
	//1.Cerrar teclado
	static void CerrarTeclado() {
		//1.Cerrar teclado
		keyboard.close();
	}

	//LECTURA DE CARACTER
	//1.Peticion del caracter
	//2.Comprobación del caracter;si no lo es, volver a pedirselo
	//3.Devolver caracter
	static Character LeerCaracter() {
		boolean safe = false;
		String a;
		char b;
		//1.Peticion del caracter
		System.out.println("Introduzca un caracter");
		//2.Comprobación del caracter;si no lo es, volver a pedirselo
		do {
			a = keyboard.next();
			keyboard.nextLine();
			if (a.length() >= 2) {
				System.out.println("Eso no es un caracter,introduzca un caracter");
			} else {
				safe = true;
			}
		} while (safe = false);
		b = a.charAt(0);
		//3.Devolver caracter
		return b;
	}

	//LECTURA DE CADENA
	//1.Petición de la cadena
	//2.Devolver cadena
	static String LeerCadena() {
		String a;
		//1.Petición de la cadena
		System.out.println("Introduzca una cadena");
		a = keyboard.next();
		keyboard.nextLine();
		//2.Devolver cadena
		return a;
	}

	//LECTURA DE UN BOOLEAN CON TRES PARAMETROS
	//1.Realizar la pregunta
	//2.Comprobación de la respuesta;si es un valor no valido,volver a pedirlo
	//3.Devolver respuesta
	static Boolean LeerBoolean(String a, String b, String c) {
		boolean result = false, safe = false;
		byte decision;
		//1.Realizar la pregunta
		System.out.printf("%s %n %t1.%s %n %t2.%s", a, b, c);
		//2.Comprobación de la respuesta;si es un valor no valido,volver a pedirlo
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
		//3.Devolver respuesta
		return result;
	}

	//LECTURA DE UN BOOLEAN CON UN PARAMETRO
	//1.Realizar la pregunta
	//2.Comprobación de la respuesta;si es un valor no valido,volver a pedirlo
	//3.Devolver respuesta
	static Boolean LeerBoolean(String a) {
		boolean result = false, safe = false;
		String decision;
		//1.Realizar la pregunta
		System.out.printf("%s", a);
		//2.Comprobación de la respuesta;si es un valor no valido,volver a pedirlo
		do {
			decision = keyboard.next();
			keyboard.nextLine();
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
		//3.Devolver respuesta
		return result;
	}

	//LECTURA DE UN DIGITO
	//1.Petición del digito
	//2.Devolver digito
	static Byte LeerByte() {
		byte a;
		//1.Petición del digito
		System.out.println("Introduzca un numero");
		a = keyboard.nextByte();
		//2.Devolver digito
		return a;
	}

	static Short LeerShort() {
		short a;
		//1.Petición del digito
		System.out.println("Introduzca un numero");
		a = keyboard.nextShort();
		//2.Devolver digito
		return a;
	}

	static Integer LeerInt() {
		int a;
		//1.Petición del digito
		System.out.println("Introduzca un numero");
		a = keyboard.nextInt();
		//2.Devolver digito
		return a;
	}

	static Long LeerLong() {
		long a;
		//1.Petición del digito
		System.out.println("Introduzca un numero");
		a = keyboard.nextLong();
		//2.Devolver digito
		return a;
	}

	static Float LeerFloat() {
		float a;
		//1.Petición del digito
		System.out.println("Introduzca un numero");
		a = keyboard.nextFloat();
		//2.Devolver digito
		return a;
	}

	static Double LeerDouble() {
		double a;
		//1.Petición del digito
		System.out.println("Introduzca un numero");
		a = keyboard.nextDouble();
		//2.Devolver digito
		return a;
	}

	//LECTURA DE UN DIGITO CON UN LIMITE
	//1.Designar pregunta
	//2.Petición del digito
	//3.Comprobación de digito,si no es valido se le vuelve pedir
	//4.Devolver digito
	static Byte LeerNumParametro(byte x, Option y) {
		byte a = 0;
		boolean safe = false;
		//1.Designar pregunta
		if (y == Option.Mayor) {
			//2.Petición del digito
			System.out.printf("Introduzca un numero mayor a %d", x);
			//3.Comprobación de digito,si no es valido se le vuelve pedir
			do {
				a = keyboard.nextByte();
				if (a <= x) {
					System.out.println("Valor no deseado,intente de nuevo");
				} else {
					safe = true;
				}
			} while (safe = false);
		} else if (y == Option.Menor) {
			//2.Petición del digito
			System.out.printf("Introduzca un numero menor a %d", x);
			//3.Comprobación de digito,si no es valido se le vuelve pedir
			do {
				a = keyboard.nextByte();
				if (a >= x) {
					System.out.println("Valor no deseado,intente de nuevo");
				} else {
					safe = true;
				}
			} while (safe = false);
		} else if (y == Option.MayorIgual) {
			//2.Petición del digito
			System.out.printf("Introduzca un numero mayor o igual a %d", x);
			//3.Comprobación de digito,si no es valido se le vuelve pedir
			do {
				a = keyboard.nextByte();
				if (a < x) {
					System.out.println("Valor no deseado,intente de nuevo");
				} else {
					safe = true;
				}
			} while (safe = false);
		} else if (y == Option.MenorIgual) {
			//2.Petición del digito
			System.out.printf("Introduzca un numero menor o igual a %d", x);
			//3.Comprobación de digito,si no es valido se le vuelve pedir
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
		//4.Devolver digito
		return a;
	}

	static Short LeerNumParametro(short x, Option y) {
		short a = 0;
		boolean safe = false;
		//1.Designar pregunta
		if (y == Option.Mayor) {
			//2.Petición del digito
			System.out.printf("Introduzca un numero mayor a %d", x);
			//3.Comprobación de digito,si no es valido se le vuelve pedir
			do {
				a = keyboard.nextShort();
				if (a <= x) {
					System.out.println("Valor no deseado,intente de nuevo");
				} else {
					safe = true;
				}
			} while (safe = false);
		} else if (y == Option.Menor) {
			//2.Petición del digito
			System.out.printf("Introduzca un numero menor a %d", x);
			//3.Comprobación de digito,si no es valido se le vuelve pedir
			do {
				a = keyboard.nextShort();
				if (a >= x) {
					System.out.println("Valor no deseado,intente de nuevo");
				} else {
					safe = true;
				}
			} while (safe = false);
		} else if (y == Option.MayorIgual) {
			//2.Petición del digito
			System.out.printf("Introduzca un numero mayor o igual a %d", x);
			//3.Comprobación de digito,si no es valido se le vuelve pedir
			do {
				a = keyboard.nextShort();
				if (a < x) {
					System.out.println("Valor no deseado,intente de nuevo");
				} else {
					safe = true;
				}
			} while (safe = false);
		} else if (y == Option.MenorIgual) {
			///2.Petición del digito
			System.out.printf("Introduzca un numero menor o igual a %d", x);
			//3.Comprobación de digito,si no es valido se le vuelve pedir
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
		//4.Devolver digito
		return a;
	}

	static Integer LeerNumParametro(int x, Option y) {
		int a = 0;
		boolean safe = false;
		//1.Designar pregunta
		if (y == Option.Mayor) {
			//2.Petición del digito
			System.out.printf("Introduzca un numero mayor a %d", x);
			//3.Comprobación de digito,si no es valido se le vuelve pedir
			do {
				a = keyboard.nextInt();
				if (a <= x) {
					System.out.println("Valor no deseado,intente de nuevo");
				} else {
					safe = true;
				}
			} while (safe = false);
		} else if (y == Option.Menor) {
			//2.Petición del digito
			System.out.printf("Introduzca un numero menor a %d", x);
			//3.Comprobación de digito,si no es valido se le vuelve pedir
			do {
				a = keyboard.nextInt();
				if (a >= x) {
					System.out.println("Valor no deseado,intente de nuevo");
				} else {
					safe = true;
				}
			} while (safe = false);
		} else if (y == Option.MayorIgual) {
			//2.Petición del digito
			System.out.printf("Introduzca un numero mayor o igual a %d", x);
			//3.Comprobación de digito,si no es valido se le vuelve pedir
			do {
				a = keyboard.nextInt();
				if (a < x) {
					System.out.println("Valor no deseado,intente de nuevo");
				} else {
					safe = true;
				}
			} while (safe = false);
		} else if (y == Option.MenorIgual) {
			//2.Petición del digito
			System.out.printf("Introduzca un numero menor o igual a %d", x);
			//3.Comprobación de digito,si no es valido se le vuelve pedir
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
		//4.Devolver digito
		return a;
	}

	static Long LeerNumParametro(long x, Option y) {
		long a = 0;
		boolean safe = false;
		//1.Designar pregunta
		if (y == Option.Mayor) {
			//2.Petición del digito
			System.out.printf("Introduzca un numero mayor a %d", x);
			//3.Comprobación de digito,si no es valido se le vuelve pedir
			do {
				a = keyboard.nextLong();
				if (a <= x) {
					System.out.println("Valor no deseado,intente de nuevo");
				} else {
					safe = true;
				}
			} while (safe = false);
		} else if (y == Option.Menor) {
			//2.Petición del digito
			System.out.printf("Introduzca un numero menor a %d", x);
			//3.Comprobación de digito,si no es valido se le vuelve pedir
			do {
				a = keyboard.nextLong();
				if (a >= x) {
					System.out.println("Valor no deseado,intente de nuevo");
				} else {
					safe = true;
				}
			} while (safe = false);
		} else if (y == Option.MayorIgual) {
			//2.Petición del digito
			System.out.printf("Introduzca un numero mayor o igual a %d", x);
			//3.Comprobación de digito,si no es valido se le vuelve pedir
			do {
				a = keyboard.nextLong();
				if (a < x) {
					System.out.println("Valor no deseado,intente de nuevo");
				} else {
					safe = true;
				}
			} while (safe = false);
		} else if (y == Option.MenorIgual) {
			//2.Petición del digito
			System.out.printf("Introduzca un numero menor o igual a %d", x);
			//3.Comprobación de digito,si no es valido se le vuelve pedir
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
		//4.Devolver digito
		return a;
	}

	static Float LeerNumParametro(float x, Option y) {
		float a = 0;
		boolean safe = false;
		//1.Designar pregunta
		if (y == Option.Mayor) {
			//2.Petición del digito
			System.out.printf("Introduzca un numero mayor a %.0f", x);
			//3.Comprobación de digito,si no es valido se le vuelve pedir
			do {
				a = keyboard.nextFloat();
				if (a <= x) {
					System.out.println("Valor no deseado,intente de nuevo");
				} else {
					safe = true;
				}
			} while (safe = false);
		} else if (y == Option.Menor) {
			//2.Petición del digito
			System.out.printf("Introduzca un numero menor a %.0f", x);
			//3.Comprobación de digito,si no es valido se le vuelve pedir
			do {
				a = keyboard.nextFloat();
				if (a >= x) {
					System.out.println("Valor no deseado,intente de nuevo");
				} else {
					safe = true;
				}
			} while (safe = false);
		} else if (y == Option.MayorIgual) {
			//2.Petición del digito
			System.out.printf("Introduzca un numero mayor o igual a %.0f", x);
			//3.Comprobación de digito,si no es valido se le vuelve pedir
			do {
				a = keyboard.nextFloat();
				if (a < x) {
					System.out.println("Valor no deseado,intente de nuevo");
				} else {
					safe = true;
				}
			} while (safe = false);
		} else if (y == Option.MenorIgual) {
			//2.Petición del digito
			System.out.printf("Introduzca un numero menor o igual a %.0f", x);
			//3.Comprobación de digito,si no es valido se le vuelve pedir
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
		//4.Devolver digito
		return a;
	}

	static Double LeerNumParametro(double x, Option y) {
		double a = 0;
		boolean safe = false;
		//1.Designar pregunta
		if (y == Option.Mayor) {
			//2.Petición del digito
			System.out.printf("Introduzca un numero mayor a %.0f", x);
			//3.Comprobación de digito,si no es valido se le vuelve pedir
			do {
				a = keyboard.nextDouble();
				if (a <= x) {
					System.out.println("Valor no deseado,intente de nuevo");
				} else {
					safe = true;
				}
			} while (safe = false);
		} else if (y == Option.Menor) {
			//2.Petición del digito
			System.out.printf("Introduzca un numero menor a %.0f", x);
			//3.Comprobación de digito,si no es valido se le vuelve pedir
			do {
				a = keyboard.nextDouble();
				if (a >= x) {
					System.out.println("Valor no deseado,intente de nuevo");
				} else {
					safe = true;
				}
			} while (safe = false);
		} else if (y == Option.MayorIgual) {
			//2.Petición del digito
			System.out.printf("Introduzca un numero mayor o igual a %.0f", x);
			//3.Comprobación de digito,si no es valido se le vuelve pedir
			do {
				a = keyboard.nextDouble();
				if (a < x) {
					System.out.println("Valor no deseado,intente de nuevo");
				} else {
					safe = true;
				}
			} while (safe = false);
		} else if (y == Option.MenorIgual) {
			//2.Petición del digito
			System.out.printf("Introduzca un numero menor o igual a %.0f", x);
			//3.Comprobación de digito,si no es valido se le vuelve pedir
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
		//4.Devolver digito
		return a;
	}

	//LECTURA DE UN DIGITO EN UN RANGO
	//1.Comprobación de rango,si no es valido,información del error
	//2.Designar tipo de rango
	//3.Petición del digito
	//4.Comprobación de digito,si no es valido se le vuelve pedir
	//5.Devolver digito
	static Byte LeerNumRango(byte nmin, byte nmax, Option_2 x) {
		byte num = 0;
		boolean safe = false;
		//1.Comprobación de parametros,si no es valido,salta error
		if (nmin > nmax) {
			throw new IllegalArgumentException("Error en los valores del rango,vuelve a intertarlo");
		} else {
		}
		//2.Designar tipo de rango
		if (x == Option_2.Incluidos) {
			//3.Petición del digito
			System.out.printf("Introduzca un valor comprendido entre %d y %d", nmin, nmax);
			do {
				num = keyboard.nextByte();
				//4.Comprobación de digito,si no es valido se le vuelve pedir
				if (num < nmin || num > nmax) {
					System.out.println("Valor no deseado,intente de nuevo");
				} else {
					safe = true;
				}
			} while (safe = false);
		} else if (x == Option_2.Excluidos) {
			//3.Petición del digito
			System.out.printf("Introduzca un valor comprendido entre %d y %d", nmin, nmax);
			do {
				num = keyboard.nextByte();
				//4.Comprobación de digito,si no es valido se le vuelve pedir
				if (num <= nmin || num >= nmax) {
					System.out.println("Valor no deseado,intente de nuevo");
				} else {
					safe = true;
				}
			} while (safe = false);
		} else if (x == Option_2.MaxIncluido) {
			//3.Petición del digito
			System.out.printf("Introduzca un valor comprendido entre %d y %d", nmin, nmax);
			do {
				num = keyboard.nextByte();
				//4.Comprobación de digito,si no es valido se le vuelve pedir
				if (num <= nmin || num > nmax) {
					System.out.println("Valor no deseado,intente de nuevo");
				} else {
					safe = true;
				}
			} while (safe = false);
		} else if (x == Option_2.MinIncluido) {
			//3.Petición del digito
			System.out.printf("Introduzca un valor comprendido entre %d y %d", nmin, nmax);
			do {
				num = keyboard.nextByte();
				//4.Comprobación de digito,si no es valido se le vuelve pedir
				if (num < nmin || num >= nmax) {
					System.out.println("Valor no deseado,intente de nuevo");
				} else {
					safe = true;
				}
			} while (safe = false);
		} else {
			System.out.println("Error en el enum");
		}
		//5.Devolver digito
		return num;
	}

	static Short LeerNumRango(short nmin, short nmax, Option_2 x) {
		short num = 0;
		boolean safe = false;
		//1.Comprobación de parametros,si no es valido,salta error
		if (nmin > nmax) {
			throw new IllegalArgumentException("Error en los valores del rango,vuelve a intertarlo");
		} else {
		}
		//2.Designar tipo de rango
		if (x == Option_2.Incluidos) {
			//3.Petición del digito
			System.out.printf("Introduzca un valor comprendido entre %d y %d", nmin, nmax);
			do {
				num = keyboard.nextShort();
				//4.Comprobación de digito,si no es valido se le vuelve pedir
				if (num < nmin || num > nmax) {
					System.out.println("Valor no deseado,intente de nuevo");
				} else {
					safe = true;
				}
			} while (safe = false);
		} else if (x == Option_2.Excluidos) {
			//3.Petición del digito
			System.out.printf("Introduzca un valor comprendido entre %d y %d", nmin, nmax);
			do {
				num = keyboard.nextShort();
				//4.Comprobación de digito,si no es valido se le vuelve pedir
				if (num <= nmin || num >= nmax) {
					System.out.println("Valor no deseado,intente de nuevo");
				} else {
					safe = true;
				}
			} while (safe = false);
		} else if (x == Option_2.MaxIncluido) {
			//3.Petición del digito
			System.out.printf("Introduzca un valor comprendido entre %d y %d", nmin, nmax);
			do {
				num = keyboard.nextShort();
				//4.Comprobación de digito,si no es valido se le vuelve pedir
				if (num <= nmin || num > nmax) {
					System.out.println("Valor no deseado,intente de nuevo");
				} else {
					safe = true;
				}
			} while (safe = false);
		} else if (x == Option_2.MinIncluido) {
			//3.Petición del digito
			System.out.printf("Introduzca un valor comprendido entre %d y %d", nmin, nmax);
			do {
				num = keyboard.nextShort();
				//4.Comprobación de digito,si no es valido se le vuelve pedir
				if (num < nmin || num >= nmax) {
					System.out.println("Valor no deseado,intente de nuevo");
				} else {
					safe = true;
				}
			} while (safe = false);
		} else {
			System.out.println("Error en el enum");
		}
		//5.Devolver digito
		return num;
	}

	static Integer LeerNumRango(int nmin, int nmax, Option_2 x) {
		int num = 0;
		boolean safe = false;
		//1.Comprobación de parametros,si no es valido,salta error
		if (nmin > nmax) {
			throw new IllegalArgumentException("Error en los valores del rango,vuelve a intertarlo");
		} else {
		}
		//2.Designar tipo de rango
		if (x == Option_2.Incluidos) {
			//3.Petición del digito
			System.out.printf("Introduzca un valor comprendido entre %d y %d", nmin, nmax);
			do {
				num = keyboard.nextInt();
				//4.Comprobación de digito,si no es valido se le vuelve pedir
				if (num < nmin || num > nmax) {
					System.out.println("Valor no deseado,intente de nuevo");
				} else {
					safe = true;
				}
			} while (safe = false);
		} else if (x == Option_2.Excluidos) {
			//3.Petición del digito
			System.out.printf("Introduzca un valor comprendido entre %d y %d", nmin, nmax);
			do {
				num = keyboard.nextInt();
				//4.Comprobación de digito,si no es valido se le vuelve pedir
				if (num <= nmin || num >= nmax) {
					System.out.println("Valor no deseado,intente de nuevo");
				} else {
					safe = true;
				}
			} while (safe = false);
		} else if (x == Option_2.MaxIncluido) {
			//3.Petición del digito
			System.out.printf("Introduzca un valor comprendido entre %d y %d", nmin, nmax);
			do {
				num = keyboard.nextInt();
				//4.Comprobación de digito,si no es valido se le vuelve pedir
				if (num <= nmin || num > nmax) {
					System.out.println("Valor no deseado,intente de nuevo");
				} else {
					safe = true;
				}
			} while (safe = false);
		} else if (x == Option_2.MinIncluido) {
			//3.Petición del digito
			System.out.printf("Introduzca un valor comprendido entre %d y %d", nmin, nmax);
			do {
				num = keyboard.nextInt();
				//4.Comprobación de digito,si no es valido se le vuelve pedir
				if (num < nmin || num >= nmax) {
					System.out.println("Valor no deseado,intente de nuevo");
				} else {
					safe = true;
				}
			} while (safe = false);
		} else {
			System.out.println("Error en el enum");
		}
		//5.Devolver digito
		return num;
	}

	static Long LeerNumRango(long nmin, long nmax, Option_2 x) {
		long num = 0;
		boolean safe = false;
		//1.Comprobación de parametros,si no es valido,salta error
		if (nmin > nmax) {
			throw new IllegalArgumentException("Error en los valores del rango,vuelve a intertarlo");
		} else {
		}
		//2.Designar tipo de rango
		if (x == Option_2.Incluidos) {
			//3.Petición del digito
			System.out.printf("Introduzca un valor comprendido entre %d y %d", nmin, nmax);
			do {
				num = keyboard.nextLong();
				//4.Comprobación de digito,si no es valido se le vuelve pedir
				if (num < nmin || num > nmax) {
					System.out.println("Valor no deseado,intente de nuevo");
				} else {
					safe = true;
				}
			} while (safe = false);
		} else if (x == Option_2.Excluidos) {
			//3.Petición del digito
			System.out.printf("Introduzca un valor comprendido entre %d y %d", nmin, nmax);
			do {
				num = keyboard.nextLong();
				//4.Comprobación de digito,si no es valido se le vuelve pedir
				if (num <= nmin || num >= nmax) {
					System.out.println("Valor no deseado,intente de nuevo");
				} else {
					safe = true;
				}
			} while (safe = false);
		} else if (x == Option_2.MaxIncluido) {
			//3.Petición del digito
			System.out.printf("Introduzca un valor comprendido entre %d y %d", nmin, nmax);
			do {
				num = keyboard.nextLong();
				//4.Comprobación de digito,si no es valido se le vuelve pedir
				if (num <= nmin || num > nmax) {
					System.out.println("Valor no deseado,intente de nuevo");
				} else {
					safe = true;
				}
			} while (safe = false);
		} else if (x == Option_2.MinIncluido) {
			//3.Petición del digito
			System.out.printf("Introduzca un valor comprendido entre %d y %d", nmin, nmax);
			do {
				num = keyboard.nextLong();
				//4.Comprobación de digito,si no es valido se le vuelve pedir
				if (num < nmin || num >= nmax) {
					System.out.println("Valor no deseado,intente de nuevo");
				} else {
					safe = true;
				}
			} while (safe = false);
		} else {
			System.out.println("Error en el enum");
		}
		//5.Devolver digito
		return num;
	}

	static Float LeerNumRango(float nmin, float nmax, Option_2 x) {
		float num = 0;
		boolean safe = false;
		//1.Comprobación de parametros,si no es valido,salta error
		if (nmin > nmax) {
			throw new IllegalArgumentException("Error en los valores del rango,vuelve a intertarlo");
		} else {
		}
		//2.Designar tipo de rango
		if (x == Option_2.Incluidos) {
			//3.Petición del digito
			System.out.printf("Introduzca un valor comprendido entre %.2f y %.2f", nmin, nmax);
			do {
				num = keyboard.nextFloat();
				//4.Comprobación de digito,si no es valido se le vuelve pedir
				if (num < nmin || num > nmax) {
					System.out.println("Valor no deseado,intente de nuevo");
				} else {
					safe = true;
				}
			} while (safe = false);
		} else if (x == Option_2.Excluidos) {
			//3.Petición del digito
			System.out.printf("Introduzca un valor comprendido entre %.2f y %.2f", nmin, nmax);
			do {
				num = keyboard.nextFloat();
				//4.Comprobación de digito,si no es valido se le vuelve pedir
				if (num <= nmin || num >= nmax) {
					System.out.println("Valor no deseado,intente de nuevo");
				} else {
					safe = true;
				}
			} while (safe = false);
		} else if (x == Option_2.MaxIncluido) {
			//3.Petición del digito
			System.out.printf("Introduzca un valor comprendido entre %.2f y %.2f", nmin, nmax);
			do {
				num = keyboard.nextFloat();
				//4.Comprobación de digito,si no es valido se le vuelve pedir
				if (num <= nmin || num > nmax) {
					System.out.println("Valor no deseado,intente de nuevo");
				} else {
					safe = true;
				}
			} while (safe = false);
		} else if (x == Option_2.MinIncluido) {
			//3.Petición del digito
			System.out.printf("Introduzca un valor comprendido entre %.2f y %.2f", nmin, nmax);
			do {
				num = keyboard.nextFloat();
				//4.Comprobación de digito,si no es valido se le vuelve pedir
				if (num < nmin || num >= nmax) {
					System.out.println("Valor no deseado,intente de nuevo");
				} else {
					safe = true;
				}
			} while (safe = false);
		} else {
			System.out.println("Error en el enum");
		}
		//5.Devolver digito
		return num;
	}

	static Double LeerNumRango(double nmin, double nmax, Option_2 x) {
		double num = 0;
		boolean safe = false;
		//1.Comprobación de parametros,si no es valido,salta error
		if (nmin > nmax) {
			throw new IllegalArgumentException("Error en los valores del rango,vuelve a intertarlo");
		} else {
		}
		//2.Designar tipo de rango
		if (x == Option_2.Incluidos) {
			//3.Petición del digito
			System.out.printf("Introduzca un valor comprendido entre %.2f y %.2f", nmin, nmax);
			do {
				num = keyboard.nextDouble();
				//4.Comprobación de digito,si no es valido se le vuelve pedir
				if (num < nmin || num > nmax) {
					System.out.println("Valor no deseado,intente de nuevo");
				} else {
					safe = true;
				}
			} while (safe = false);
		} else if (x == Option_2.Excluidos) {
			//3.Petición del digito
			System.out.printf("Introduzca un valor comprendido entre %.2f y %.2f", nmin, nmax);
			do {
				num = keyboard.nextDouble();
				//4.Comprobación de digito,si no es valido se le vuelve pedir
				if (num <= nmin || num >= nmax) {
					System.out.println("Valor no deseado,intente de nuevo");
				} else {
					safe = true;
				}
			} while (safe = false);
		} else if (x == Option_2.MaxIncluido) {
			//3.Petición del digito
			System.out.printf("Introduzca un valor comprendido entre %.2f y %.2f", nmin, nmax);
			do {
				num = keyboard.nextDouble();
				//4.Comprobación de digito,si no es valido se le vuelve pedir
				if (num <= nmin || num > nmax) {
					System.out.println("Valor no deseado,intente de nuevo");
				} else {
					safe = true;
				}
			} while (safe = false);
		} else if (x == Option_2.MinIncluido) {
			//3.Petición del digito
			System.out.printf("Introduzca un valor comprendido entre %.2f y %.2f", nmin, nmax);
			do {
				num = keyboard.nextDouble();
				//4.Comprobación de digito,si no es valido se le vuelve pedir
				if (num < nmin || num >= nmax) {
					System.out.println("Valor no deseado,intente de nuevo");
				} else {
					safe = true;
				}
			} while (safe = false);
		} else {
			System.out.println("Error en el enum");
		}
		//5.Devolver digito
		return num;
	}
}