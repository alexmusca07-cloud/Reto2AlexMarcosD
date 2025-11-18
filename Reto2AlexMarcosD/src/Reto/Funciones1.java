package Reto;

import java.util.Scanner;

public class Funciones1 {
	public static double KilometrosMillas(double a) {
		return a * 0.621371;
	}

	public static double MillasKilometros(double a) {
		return a * 1.60934;
	}

	public static double KilosLibras(double a) {
		return a * 2.20462;
	}

	public static double LibrasKilos(double a) {
		return a * 0.453592;
	}

	public static void menuLongitud(Scanner sc) {
		int opcion = 0;
		do {
			double n1 = 0;
			double n2 = 0;
			System.out.println("Selecciona a la conversión de longitud:");
			System.out.println("1. Millas a kilómetros");
			System.out.println("2. Kilómetros a millas");
			System.out.println("0. Salir");
			opcion = Funciones.dimeEntero("Dime una opcion de Longitud", sc);
			switch (opcion) {
			case 1:
				n1 = Funciones.dimeDouble("Dime el valor para pasarlo a Kilometros", sc);
				System.out.println(Funciones1.MillasKilometros(n1));
				break;
			case 2:
				n2 = Funciones.dimeDouble("Dime el valor para pasarlo a Millas", sc);
				System.out.println(Funciones1.KilometrosMillas(n2));
			case 0:
				break;
			}
		} while (opcion != 0);

	}
	public static void menuPeso(Scanner sc) {
		int opcion = 0;
		do {
			double n1 = 0;
			double n2 = 0;
			System.out.println("Selecciona a la conversión de Peso:");
			System.out.println("1. Kilos a Libras");
			System.out.println("2. Libras a Kilos");
			System.out.println("0. Salir");
			opcion = Funciones.dimeEntero("Dime una opcion de Longitud", sc);
			switch (opcion) {
			case 1:
				n1 = Funciones.dimeDouble("Dime el valor para pasarlo a Libras", sc);
				System.out.println(Funciones1.KilosLibras(n1));
				break;
			case 2:
				n2 = Funciones.dimeDouble("Dime el valor para pasarlo a Kilos", sc);
				System.out.println(Funciones1.LibrasKilos(n2));
			default:
			case 0:
				break;
			}
		} while (opcion != 0);

	}

}
