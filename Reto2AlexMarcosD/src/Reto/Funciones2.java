package Reto;

import java.util.Scanner;

public class Funciones2 {
	public static double CelsiusFahrenheit(double a) {
		return (a * 9 / 5) + 32;
	}

	public static double FahrenheitCelsius(double a) {
		return (a - 32) * 5 / 9;
	}

	public static double LitrosGalones(double a) {
		return a * 0.264172;
	}

	public static double GalonesLitros(double a) {
		return a * 3.78541;
	}
	public static void menuTemperatura(Scanner sc) {
		int opcion = 0;
		do {
			double n1 = 0;
			double n2 = 0;
			System.out.println("Selecciona a la conversión de Peso:");
			System.out.println("1. Celsius a Fahrenheit");
			System.out.println("2. Fahrenheit a Celsius");
			System.out.println("0. Salir");
			opcion = Funciones.dimeEntero("Dime una opcion de Temperatura", sc);
			switch (opcion) {
			case 1:
				n1 = Funciones.dimeDouble("Dime el valor para pasarlo a Fahrenheit", sc);
				System.out.println(Funciones2.CelsiusFahrenheit(n1));
				break;
			case 2:
				n2 = Funciones.dimeDouble("Dime el valor para pasarlo a Celsius", sc);
				System.out.println(Funciones2.FahrenheitCelsius(n2));
			default:
				break;
			}
		} while (opcion != 0);
	}
	public static void menuVolumen(Scanner sc) {
		int opcion = 0;
		do {
			double n1 = 0;
			double n2 = 0;
			System.out.println("Selecciona a la conversión de Volumen:");
			System.out.println("1. Litros a Galones");
			System.out.println("2. Galones a Litros");
			System.out.println("0. Salir");
			opcion = Funciones.dimeEntero("Dime una opcion de Volumen", sc);
			switch (opcion) {
			case 1:
				n1 = Funciones.dimeDouble("Dime el valor para pasarlo a Galones", sc);
				System.out.println(Funciones2.LitrosGalones(n1));
				break;
			case 2:
				n2 = Funciones.dimeDouble("Dime el valor para pasarlo a Litros", sc);
				System.out.println(Funciones2.GalonesLitros(n2));
			default:
				break;
			}
		} while (opcion != 0);
	}
}
