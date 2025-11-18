package Reto;

import java.util.Scanner;

import Reto.Funciones1;
import Reto.Funciones2;

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
		int opcion = 0;
		
		do {
			switch (opcion) {
			case 1:
			double n1 = Funciones1.KilometrosMillas(opcion) ;
			System.out.println(n1);
			break;
		default:
			
			break;
			}
		} while (opcion != 0);
		System.out.println("0. Salir");
	}

}
