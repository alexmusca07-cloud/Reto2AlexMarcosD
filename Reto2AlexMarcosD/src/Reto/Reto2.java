package Reto;

import java.util.Scanner;

import Reto.Funciones1;
import Reto.Funciones2;
import Reto.Funciones;

public class Reto2 {

	public static void main(String[] args) {
		
		/*
		 * El programa debe mostrar un menú para que el usuario elija la operación que
		 * desea realizar y después otro menú para elegir que quiere hacer, después se
		 * pedirán y mostrarán los datos. Después de elegir una opción en el menú 2 y
		 * realizar la operación, debe volver al menú 2. Para volver al menú principal
		 * lo hará con la opción 0.
		 */
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Selecciona el tipo de conversion: ");
		System.out.println("1. Longitud");
		System.out.println("2. Peso");
		System.out.println("3. Temperatura");
		System.out.println("4. Volumen");
		System.out.println("0. Salir");
		
		int opcion = 0;
		int opcionl = 0;
		
		
		
		do {
			opcion = Funciones.dimeEntero("Dime una opcion", sc);
			switch (opcion) {
			case 1:
				do {
					System.out.println("Selecciona a la conversión de longitud:");
					System.out.println("1. Millas a kilómetros");
					System.out.println("2. Kilómetros a millas");
					System.out.println("0. Salir");
				} while (opcionl != 0);
			double n1 = (opcion);
			System.out.println(n1);
			break;
			case 2:
				do {
					System.out.println("Selecciona a la conversión de longitud:");
					System.out.println("1. Millas a kilómetros");
					System.out.println("2. Kilómetros a millas");
					System.out.println("0. Salir");
				} while (opcionl != 0);
			double n2 = (opcion);
			System.out.println(n2);
			break;
			case 3:
				do {
					System.out.println("Selecciona a la conversión de longitud:");
					System.out.println("1. Millas a kilómetros");
					System.out.println("2. Kilómetros a millas");
					System.out.println("0. Salir");
				} while (opcionl != 0);
			double n3 = (opcion);
			System.out.println(n3);
			break;
		default:
			
			break;
			}
		} while (opcion != 0);
	}

}
