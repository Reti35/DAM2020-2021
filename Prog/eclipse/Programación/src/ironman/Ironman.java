package ironman;

import java.util.Scanner;

public class Ironman {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Soy Ironman!");
		System.out.println("Bienvenidos al mundo de JAVA");

		System.out.println("------------------------------");

		Scanner teclado = new Scanner(System.in);

		int edad;
		String nombre;

		System.out.println("Dime tu edad");
		edad = teclado.nextInt();
		teclado.nextLine();
		System.out.print("La edad que has introducido");
		System.out.println(" es " + edad);

		System.out.println("�Como te llamas?");
		nombre = teclado.nextLine();
		System.out.print("Bienvenid@, " + nombre);

		teclado.close();
	}

}
