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

		int opcion = 0;
		do {
			System.out.println("Selecciona el tipo de conversion: ");
			System.out.println("1. Longitud");
			System.out.println("2. Peso");
			System.out.println("3. Temperatura");
			System.out.println("4. Volumen");
			System.out.println("0. Salir");
			opcion = Funciones.dimeEntero("Dime una opcion", sc);
			
			switch (opcion) {
			case 1:
				Funciones1.menuLongitud(sc);
				break;
			case 2:
				Funciones1.menuPeso(sc);
				break;
			case 3:
				Funciones2.menuTemperatura(sc);
				break;
			case 4:
				Funciones2.menuVolumen(sc);
				break;
			default:
				System.out.println("Fin");
				break;
			}
		} while (opcion != 0);
	}

}
