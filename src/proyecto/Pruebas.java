package proyecto;

import proyecto.Options.Option;
import proyecto.Options.Option_2;

public class Pruebas {

	public static void main(String[] args) {
		String msg1 = "Color favorito", msg2 = "¿Estas bien?(s/n)", ans1 = "Rojo", ans2 = "Azul";
		boolean safe = false;
		byte numberby1 = 6, numberby2 = 10, nopt, nfunc;
		short numbersh1 = 6, numbersh2 = 10;
		int numberint1 = 6, numberint2 = 10;
		long numberlong1 = 6, numberlong2 = 10;
		float numberfloat1 = 6, numberfloat2 = 10;
		double numberdou1 = 6, numberdou2 = 10;
		Option option = Option.Mayor;
		Option_2 option2 = Option_2.Incluidos;
		System.out.println("Seleccione la función deseada:" + "\n" + "1.Lectura de caracter" + "\n"
				+ "2.Lectura de cadena" + "\n" + "3.Lectura de booleano" + "\n" + "4.Lectura numerica");
		nfunc = Teclado.LeerByte();
		switch (nfunc) {
		case 1:
			//1.LeerCaracter
			System.out.println(Teclado.LeerCaracter());
			break;
		case 2:
			//2.LeerCadena
			System.out.println(Teclado.LeerCadena());
		case 3:
			System.out.println("Elige:" + "\n" + "1.Respuesta numerica" + "\n" + "2.Respuesta s/n");
			nopt = Teclado.LeerByte();
			do {
				switch (nopt) {
				case 1:
					//3.LeerBoolean 3 parametros
					System.out.println(Teclado.LeerBoolean(msg1, ans1, ans2));
					safe = true;
					break;
				case 2:
					//4.LeerBoolean 1 parametro
					System.out.println(Teclado.LeerBoolean(msg2));
					safe = true;
					break;
				default:
					System.out.println("Valor no valido");
				}
			} while (safe == false);
		case 4:
			System.out.println("Elige:" + "\n" + "1.Sin condiciones" + "\n" + "2.Con limite" + "\n" + "3.Con rango");
			nopt = Teclado.LeerByte();
			do {
				switch (nopt) {
				case 1:
					System.out.println("Elige tipo de valor:" + "\n" + "1.Byte" + "\n" + "2.Short" + "\n" + "3.Integer"
							+ "\n" + "4.Long" + "\n" + "5.Float" + "\n" + "6.Double");
					nopt = Teclado.LeerByte();
					do {
						switch (nopt) {
						case 1:
							System.out.println(Teclado.LeerByte());
							safe = true;
							break;
						case 2:
							System.out.println(Teclado.LeerShort());
							safe = true;
							break;
						case 3:
							System.out.println(Teclado.LeerInt());
							safe = true;
							break;
						case 4:
							System.out.println(Teclado.LeerLong());
							safe = true;
							break;
						case 5:
							System.out.println(Teclado.LeerFloat());
							safe = true;
							break;
						case 6:
							System.out.println(Teclado.LeerDouble());
							safe = true;
							break;
						default:
							System.out.println("Valor no valido");
						}
					} while (safe == false);
					break;
				case 2:
					do {
						switch (nopt) {
						case 1:
							System.out.println("Elige tipo de valor:" + "\n" + "1.Mayor" + "\n" + "2.Menor" + "\n"
									+ "3.MayorIgual" + "\n" + "4.MenorIgual");
							System.out.println(Teclado.LeerByte());
							nopt = Teclado.LeerByte();
							switch (nopt) {
							case 1:
								option = Option.Mayor;
								safe = true;
								break;
							case 2:
								option = Option.Menor;
								safe = true;
								break;
							case 3:
								option = Option.MayorIgual;
								safe = true;
								break;
							case 4:
								option = Option.MenorIgual;
								safe = true;
								break;
							default:
								System.out.println("Valor no valido");
							}
							while (safe == false)
								;
							System.out.println(Teclado.LeerNumParametro(numberby1, option));
							break;
						case 2:
							System.out.println("Elige tipo de valor:" + "\n" + "1.Mayor" + "\n" + "2.Menor" + "\n"
									+ "3.MayorIgual" + "\n" + "4.MenorIgual");
							nopt = Teclado.LeerByte();
							switch (nopt) {
							case 1:
								option = Option.Mayor;
								safe = true;
								break;
							case 2:
								option = Option.Menor;
								safe = true;
								break;
							case 3:
								option = Option.MayorIgual;
								safe = true;
								break;
							case 4:
								option = Option.MenorIgual;
								safe = true;
								break;
							default:
								System.out.println("Valor no valido");

							}
							while (safe == false)
								;
							System.out.println(Teclado.LeerNumParametro(numbersh1, option));
							break;
						case 3:
							System.out.println("Elige tipo de valor:" + "\n" + "1.Mayor" + "\n" + "2.Menor" + "\n"
									+ "3.MayorIgual" + "\n" + "4.MenorIgual");
							nopt = Teclado.LeerByte();
							switch (nopt) {
							case 1:
								option = Option.Mayor;
								safe = true;
								break;
							case 2:
								option = Option.Menor;
								safe = true;
								break;
							case 3:
								option = Option.MayorIgual;
								safe = true;
								break;
							case 4:
								option = Option.MenorIgual;
								safe = true;
								break;
							default:
								System.out.println("Valor no valido");
							}
							while (safe == false)
								;
							System.out.println(Teclado.LeerNumParametro(numberint1, option));
							break;
						case 4:
							System.out.println("Elige tipo de valor:" + "\n" + "1.Mayor" + "\n" + "2.Menor" + "\n"
									+ "3.MayorIgual" + "\n" + "4.MenorIgual");
							nopt = Teclado.LeerByte();
							switch (nopt) {
							case 1:
								option = Option.Mayor;
								safe = true;
								break;
							case 2:
								option = Option.Menor;
								safe = true;
								break;
							case 3:
								option = Option.MayorIgual;
								safe = true;
								break;
							case 4:
								option = Option.MenorIgual;
								safe = true;
								break;
							default:
								System.out.println("Valor no valido");
							}
							while (safe == false)
								;
							System.out.println(Teclado.LeerNumParametro(numberlong1, option));
							break;
						case 5:
							System.out.println("Elige tipo de valor:" + "\n" + "1.Mayor" + "\n" + "2.Menor" + "\n"
									+ "3.MayorIgual" + "\n" + "4.MenorIgual");
							nopt = Teclado.LeerByte();
							switch (nopt) {
							case 1:
								option = Option.Mayor;
								safe = true;
								break;
							case 2:
								option = Option.Menor;
								safe = true;
								break;
							case 3:
								option = Option.MayorIgual;
								safe = true;
								break;
							case 4:
								option = Option.MenorIgual;
								safe = true;
								break;
							default:
								System.out.println("Valor no valido");

							}
							while (safe == false)
								;
							System.out.println(Teclado.LeerNumParametro(numberfloat1, option));
							break;
						case 6:
							System.out.println("Elige tipo de valor:" + "\n" + "1.Mayor" + "\n" + "2.Menor" + "\n"
									+ "3.MayorIgual" + "\n" + "4.MenorIgual");
							nopt = Teclado.LeerByte();
							switch (nopt) {
							case 1:
								option = Option.Mayor;
								safe = true;
								break;
							case 2:
								option = Option.Menor;
								safe = true;
								break;
							case 3:
								option = Option.MayorIgual;
								safe = true;
								break;
							case 4:
								option = Option.MenorIgual;
								safe = true;
								break;
							default:
								System.out.println("Valor no valido");

							}
							while (safe == false)
								;
							System.out.println(Teclado.LeerNumParametro(numberdou1, option));
							break;
						default:
							System.out.println("Valor no valido");
						}
					} while (safe == false);
					break;
				case 3:
					do {
						switch (nopt) {
						case 1:
							System.out.println("Elige tipo de valor:" + "\n" + "1.Incluidos" + "\n" + "2.Excluidos"
									+ "\n" + "3.MaxIncluido" + "\n" + "4.MinIncluido");
							System.out.println(Teclado.LeerByte());
							nopt = Teclado.LeerByte();
							switch (nopt) {
							case 1:
								option2 = Option_2.Incluidos;
								safe = true;
								break;
							case 2:
								option2 = Option_2.Excluidos;
								safe = true;
								break;
							case 3:
								option2 = Option_2.MaxIncluido;
								safe = true;
								break;
							case 4:
								option2 = Option_2.MinIncluido;
								safe = true;
								break;
							default:
								System.out.println("Valor no valido");
							}
							while (safe == false)
								;
							System.out.println(Teclado.LeerNumRango(numberby1, numberby2, option2));
							break;
						case 2:
							System.out.println("Elige tipo de valor:" + "\n" + "1.Incluidos" + "\n" + "2.Excluidos"
									+ "\n" + "3.MaxIncluido" + "\n" + "4.MinIncluido");
							nopt = Teclado.LeerByte();
							switch (nopt) {
							case 1:
								option2 = Option_2.Incluidos;
								safe = true;
								break;
							case 2:
								option2 = Option_2.Excluidos;
								safe = true;
								break;
							case 3:
								option2 = Option_2.MaxIncluido;
								safe = true;
								break;
							case 4:
								option2 = Option_2.MinIncluido;
								safe = true;
								break;
							default:
								System.out.println("Valor no valido");
							}
							while (safe == false)
								;
							System.out.println(Teclado.LeerNumRango(numbersh1, numbersh2, option2));
							break;
						case 3:
							System.out.println("Elige tipo de valor:" + "\n" + "1.Incluidos" + "\n" + "2.Excluidos"
									+ "\n" + "3.MaxIncluido" + "\n" + "4.MinIncluido");
							nopt = Teclado.LeerByte();
							switch (nopt) {
							case 1:
								option2 = Option_2.Incluidos;
								safe = true;
								break;
							case 2:
								option2 = Option_2.Excluidos;
								safe = true;
								break;
							case 3:
								option2 = Option_2.MaxIncluido;
								safe = true;
								break;
							case 4:
								option2 = Option_2.MinIncluido;
								safe = true;
								break;
							default:
								System.out.println("Valor no valido");
							}
							while (safe == false)
								;
							System.out.println(Teclado.LeerNumRango(numberint1, numberint2, option2));
							break;
						case 4:
							System.out.println("Elige tipo de valor:" + "\n" + "1.Incluidos" + "\n" + "2.Excluidos"
									+ "\n" + "3.MaxIncluido" + "\n" + "4.MinIncluido");
							nopt = Teclado.LeerByte();
							switch (nopt) {
							case 1:
								option2 = Option_2.Incluidos;
								safe = true;
								break;
							case 2:
								option2 = Option_2.Excluidos;
								safe = true;
								break;
							case 3:
								option2 = Option_2.MaxIncluido;
								safe = true;
								break;
							case 4:
								option2 = Option_2.MinIncluido;
								safe = true;
								break;
							default:
								System.out.println("Valor no valido");
							}
							while (safe == false)
								;
							System.out.println(Teclado.LeerNumRango(numberlong1, numberlong2, option2));
							break;
						case 5:
							System.out.println("Elige tipo de valor:" + "\n" + "1.Incluidos" + "\n" + "2.Excluidos"
									+ "\n" + "3.MaxIncluido" + "\n" + "4.MinIncluido");
							nopt = Teclado.LeerByte();
							switch (nopt) {
							case 1:
								option2 = Option_2.Incluidos;
								safe = true;
								break;
							case 2:
								option2 = Option_2.Excluidos;
								safe = true;
								break;
							case 3:
								option2 = Option_2.MaxIncluido;
								safe = true;
								break;
							case 4:
								option2 = Option_2.MinIncluido;
								safe = true;
								break;
							default:
								System.out.println("Valor no valido");
							}
							while (safe == false)
								;
							System.out.println(Teclado.LeerNumRango(numberfloat1, numberfloat2, option2));
							break;
						case 6:
							System.out.println("Elige tipo de valor:" + "\n" + "1.Incluidos" + "\n" + "2.Excluidos"
									+ "\n" + "3.MaxIncluido" + "\n" + "4.MinIncluido");
							nopt = Teclado.LeerByte();
							switch (nopt) {
							case 1:
								option2 = Option_2.Incluidos;
								safe = true;
								break;
							case 2:
								option2 = Option_2.Excluidos;
								safe = true;
								break;
							case 3:
								option2 = Option_2.MaxIncluido;
								safe = true;
								break;
							case 4:
								option2 = Option_2.MinIncluido;
								safe = true;
								break;
							default:
								System.out.println("Valor no valido");
							}
							while (safe == false)
								;
							System.out.println(Teclado.LeerNumRango(numberdou1, numberdou2, option2));
							;
						default:
							System.out.println("Valor no valido");
						}
					} while (safe == false);
					break;
				default:
					System.out.println("Valor no valido");
				}
			} while (safe == false);
			//1.LeerCaracter
			//System.out.println(Teclado.LeerCaracter());
			//2.LeerCadena
			//System.out.println(Teclado.LeerCadena());
			//3.LeerBoolean 3 parametros
			//System.out.println(Teclado.LeerBoolean(msg1, ans1, ans2));
			//4.LeerBoolean 1 parametro
			//System.out.println(Teclado.LeerBoolean(msg2));
			//5.Lectura numerica
			//System.out.println(Teclado.LeerByte());
			//System.out.println(Teclado.LeerShort());
			//System.out.println(Teclado.LeerInt());
			//System.out.println(Teclado.LeerLong());
			//System.out.println(Teclado.LeerFloat());
			//System.out.println(Teclado.LeerDouble());
			//6.Lectura con un limite
			//do{
			//		System.out.println("Elige tipo de valor:" + "\n" + "1.Mayor" + "\n" + "2.Menor" + "\n" + "3.MayorIgual" + "\n" + "4.MenorIgual")
			//		nopt = Teclado.LeerByte();
			//		switch (nopt) {
			//		case 1:
			//			option = Option.Mayor;
			//			safe=true;
			//			break;
			//		case 2:
			//			option = Option.Menor;
			//			safe=true;
			//			break;
			//		case 3:
			//			option = Option.MayorIgual;
			//			safe=true;
			//			break;
			//		case 4:
			//			option = Option.MenorIgual;
			//			safe=true;
			//			break;
			//		default:
			//			System.out.println("Valor no valido");
			//				}
			//		}while(safe==false);
			//		System.out.println(Teclado.LeerNumParametro(numberby1, option));
			//do{
			//		System.out.println("Elige tipo de valor:" + "\n" + "1.Byte" + "\n" + "2.Short" + "\n" + "3.Integer" + "\n" + "4.Long")
			//		nopt = Teclado.LeerByte();
			//		switch (nopt) {
			//		case 1:
			//			option = Option.Mayor;
			//			safe=true;
			//			break;
			//		case 2:
			//			option = Option.Menor;
			//			safe=true;
			//			break;
			//		case 3:
			//			option = Option.MayorIgual;
			//			safe=true;
			//			break;
			//		case 4:
			//			option = Option.MenorIgual;
			//			safe=true;
			//			break;
			//		default:
			//			System.out.println("Valor no valido");
			//				
			//		}while(safe==false);
			//System.out.println(Teclado.LeerNumParametro(numbersh1, option));
			//do{
			//		System.out.println("Elige tipo de valor:" + "\n" + "1.Byte" + "\n" + "2.Short" + "\n" + "3.Integer" + "\n" + "4.Long")
			//		nopt = Teclado.LeerByte();
			//		switch (nopt) {
			//		case 1:
			//			option = Option.Mayor;
			//			safe=true;
			//			break;
			//		case 2:
			//			option = Option.Menor;
			//			safe=true;
			//			break;
			//		case 3:
			//			option = Option.MayorIgual;
			//			safe=true;
			//			break;
			//		case 4:
			//			option = Option.MenorIgual;
			//			safe=true;
			//			break;
			//		default:
			//			System.out.println("Valor no valido");
			//				}
			//		}while(safe==false);
			//System.out.println(Teclado.LeerNumParametro(numberint1, option));
			//do{
			//		System.out.println("Elige tipo de valor:" + "\n" + "1.Byte" + "\n" + "2.Short" + "\n" + "3.Integer" + "\n" + "4.Long")
			//		nopt = Teclado.LeerByte();
			//		switch (nopt) {
			//		case 1:
			//			option = Option.Mayor;
			//			safe=true;
			//			break;
			//		case 2:
			//			option = Option.Menor;
			//			safe=true;
			//			break;
			//		case 3:
			//			option = Option.MayorIgual;
			//			safe=true;
			//			break;
			//		case 4:
			//			option = Option.MenorIgual;
			//			safe=true;
			//			break;
			//		default:
			//			System.out.println("Valor no valido");
			//				}
			//		}while(safe==false);
			//System.out.println(Teclado.LeerNumParametro(numberlong1, option));
			//do{
			//		System.out.println("Elige tipo de valor:" + "\n" + "1.Byte" + "\n" + "2.Short" + "\n" + "3.Integer" + "\n" + "4.Long")
			//		nopt = Teclado.LeerByte();
			//		switch (nopt) {
			//		case 1:
			//			option = Option.Mayor;
			//			safe=true;
			//			break;
			//		case 2:
			//			option = Option.Menor;
			//			safe=true;
			//			break;
			//		case 3:
			//			option = Option.MayorIgual;
			//			safe=true;
			//			break;
			//		case 4:
			//			option = Option.MenorIgual;
			//			safe=true;
			//			break;
			//		default:
			//			System.out.println("Valor no valido");
			//				}
			//		}while(safe==false);
			//System.out.println(Teclado.LeerNumParametro(numberfloat1, option));
			//do{
			//		System.out.println("Elige tipo de valor:" + "\n" + "1.Byte" + "\n" + "2.Short" + "\n" + "3.Integer" + "\n" + "4.Long")
			//		nopt = Teclado.LeerByte();
			//		switch (nopt) {
			//		case 1:
			//			option = Option.Mayor;
			//			safe=true;
			//			break;
			//		case 2:
			//			option = Option.Menor;
			//			safe=true;
			//			break;
			//		case 3:
			//			option = Option.MayorIgual;
			//			safe=true;
			//			break;
			//		case 4:
			//			option = Option.MenorIgual;
			//			safe=true;
			//			break;
			//		default:
			//			System.out.println("Valor no valido");
			//				}
			//		}while(safe==false);
			//System.out.println(Teclado.LeerNumParametro(numberdou1, option));
			//		System.out.println("Elige tipo de valor:" + "\n" + "1.Byte" + "\n" + "2.Short" + "\n" + "3.Integer" + "\n" + "4.Long")
			//		do{
			//nopt = Teclado.LeerByte();	
			//		switch (nopt) {
			//		case 1:
			//			option2 = Option_2.Incluidos;
			//			safe=true;
			//			break;
			//		case 2:
			//			option2 = Option_2.Excluidos;
			//			safe=true;
			//			break;
			//		case 3:
			//			option2 = Option_2.MaxIncluido;
			//			safe=true;
			//			break;
			//		case 4:
			//			option2 = Option_2.MinIncluido;
			//			safe=true;
			//			break;
			//		default:
			//			System.out.println("Valor no valido");
			//		}
			//		}while(safe==false);
			//		System.out.println(Teclado.LeerNumRango(numberby1, numberby2, option2));
			//		System.out.println("Elige tipo de valor:" + "\n" + "1.Incluidos" + "\n" + "2.Excluidos" + "\n" + "3.MaxIncluido" + "\n" + "4.MinIncluido");
			//		do{
			//	nopt = Teclado.LeerByte();	
			//		switch (nopt) {
			//		case 1:
			//			option2 = Option_2.Incluidos;
			//			safe=true;
			//			break;
			//		case 2:
			//			option2 = Option_2.Excluidos;
			//			safe=true;
			//			break;
			//		case 3:
			//			option2 = Option_2.MaxIncluido;
			//			safe=true;
			//			break;
			//		case 4:
			//			option2 = Option_2.MinIncluido;
			//			safe=true;
			//			break;
			//		default:
			//			System.out.println("Valor no valido");
			//		}
			//		}while(safe==false);
			//		System.out.println(Teclado.LeerNumRango(numbersh1, numbersh2, option2));
			//		System.out.println("Elige tipo de valor:" + "\n" + "1.Byte" + "\n" + "2.Short" + "\n" + "3.Integer" + "\n" + "4.Long")
			//				do{
			//nopt = Teclado.LeerByte();
			//		switch (nopt) {
			//		case 1:
			//			option2 = Option_2.Incluidos;
			//			safe=true;
			//			break;
			//		case 2:
			//			option2 = Option_2.Excluidos;
			//			safe=true;
			//			break;
			//		case 3:
			//			option2 = Option_2.MaxIncluido;
			//			safe=true;
			//			break;
			//		case 4:
			//			option2 = Option_2.MinIncluido;
			//			safe=true;
			//			break;
			//		default:
			//			System.out.println("Valor no valido");
			//		}
			//		}while(safe==false);
			//		System.out.println(Teclado.LeerNumRango(numberint1, numberint2, option2));
			//		System.out.println("Elige tipo de valor:" + "\n" + "1.Byte" + "\n" + "2.Short" + "\n" + "3.Integer" + "\n" + "4.Long")
			// do{
			//nopt = Teclado.LeerByte();

			//		switch (nopt) {
			//		case 1:
			//			option2 = Option_2.Incluidos;
			//			safe=true;
			//			break;
			//		case 2:
			//			option2 = Option_2.Excluidos;
			//			safe=true;
			//			break;
			//		case 3:
			//			option2 = Option_2.MaxIncluido;
			//			safe=true;
			//			break;
			//		case 4:
			//			option2 = Option_2.MinIncluido;
			//			safe=true;
			//			break;
			//		default:
			//			System.out.println("Valor no valido");
			//		}
			//		}while(safe==false);
			//		System.out.println(Teclado.LeerNumRango(numberlong1, numberlong2, option2));
			//		System.out.println("Elige tipo de valor:" + "\n" + "1.Byte" + "\n" + "2.Short" + "\n" + "3.Integer" + "\n" + "4.Long")
			//		do{
			//nopt = Teclado.LeerByte();
			//		switch (nopt) {
			//		case 1:
			//			option2 = Option_2.Incluidos;
			//			safe=true;
			//			break;
			//		case 2:
			//			option2 = Option_2.Excluidos;
			//			safe=true;
			//			break;
			//		case 3:
			//			option2 = Option_2.MaxIncluido;
			//			safe=true;
			//			break;
			//		case 4:
			//			option2 = Option_2.MinIncluido;
			//			safe=true;
			//			break;
			//		default:
			//			System.out.println("Valor no valido");
			//		}
			//		}while(safe==false);
			//		System.out.println(Teclado.LeerNumRango(numberfloat1, numberfloat2, option2));
			//		System.out.println("Elige tipo de valor:" + "\n" + "1.Byte" + "\n" + "2.Short" + "\n" + "3.Integer" + "\n" + "4.Long")
			//		do{
			//nopt = Teclado.LeerByte();
			//		switch (nopt) {
			//		case 1:
			//			option2 = Option_2.Incluidos;
			//			safe=true;
			//			break;
			//		case 2:
			//			option2 = Option_2.Excluidos;
			//			safe=true;
			//			break;
			//		case 3:
			//			option2 = Option_2.MaxIncluido;
			//			safe=true;
			//			break;
			//		case 4:
			//			option2 = Option_2.MinIncluido;
			//			safe=true;
			//			break;
			//		default:
			//			System.out.println("Valor no valido");
			//		}
			//		}while(safe==false);
			//		System.out.println(Teclado.LeerNumRango(numberdou1, numberdou2, option2));

		}

	}
}
