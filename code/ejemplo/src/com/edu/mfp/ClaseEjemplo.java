package com.edu.mfp;

import java.util.Scanner;

public class ClaseEjemplo {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Introduce tu nombre: ");
		
		String nombre=scanner.nextLine();
		
		System.out.println("Introduce tu edad: ");
		int edad=Integer.valueOf(scanner.nextLine());
		
		System.out.println("Hola, " + nombre + " tienes " + edad + " años");
	}

}
