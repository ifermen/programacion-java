package com.edu.mfp;

import java.util.Scanner;

public class ClaseEjemplo {
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		/*System.out.println("Introduce tu nombre: ");
		
		String nombre=scanner.nextLine();
		
		System.out.println("Introduce tu edad: ");
		int edad=Integer.valueOf(scanner.nextLine());
		
		System.out.println("Hola, " + nombre + " tienes " + edad + " años");*/
		
		/*System.out.println("Introduce un número: ");
		
		int dia_semana=scanner.nextInt();
		String resultado="";
		
		if (dia_semana==1) {
			resultado="Lunes";
		}else if (dia_semana==2) {
			resultado="Martes";
		}else if (dia_semana==3) {
			resultado="Miercoles";
		}else if (dia_semana==4) {
			resultado="Jueves";
		}else if (dia_semana==5) {
			resultado="Viernes";
		}else if (dia_semana==6) {
			resultado="Sabado";
		}else if (dia_semana==7) {
			resultado="Domingo";
		}
		System.out.println("Es " + resultado);*/
		
		/*System.out.println("Introduce tu edad:");
		int edad=scanner.nextInt();
		
		if (edad<18) {
			System.out.println("Es un niño");
		}else if (edad<65){
			System.out.println("Es un adulto");
		}else {
			System.out.println("Es un anciano");
		}*/
		
		/*System.out.println("Intruduce tu peso (kg):");
			float peso=scanner.nextFloat();
		
		System.out.println("Intruduce tu altura(m):");
			float altura=scanner.nextFloat();
		
		float imc=peso/(altura*altura);
		
		if (imc<18.5) {
			System.out.println("Tu IMC es de " + imc + " por lo que es bajo");
		}else if (imc<25) {
			System.out.println("Tu IMC es de " + imc + " por lo que es normal");
		}else if (imc<30) {
			System.out.println("Tu IMC es de " + imc + " por lo que es sobrepeso");
		}else {
			System.out.println("Tu IMC es de " + imc + " por lo que es obeso");
		}*/
		
		/*System.out.println("Escribe un mes");
		String mes=scanner.nextLine();
		
		if (mes=="Enero" || mes=="Marzo" || mes=="Mayo" || mes=="Julio" || mes=="Agosto" || mes=="Octubre" || mes=="Diciembre") {
			System.out.println(mes + " tiene 31 días");
		}else if (mes=="Abril" || mes=="Junio" || mes=="Septiembre" || mes=="Noviembre") {
			System.out.println(mes + " tiene 30 días");
		}else if (mes == "Febrero") {
			System.out.println(mes + " tiene 28 o 29 días");
		}else {
			System.out.println(mes + " no es un mes");
		}*/
		/*for (int i=100;i>=0;i-=2) {
			System.out.println(i);
		}*/
		
		/*for (int i=1;i<151;i++) {
			if (i%7==0 && i%13==0){
				System.out.println(i + " es multiplo de 7 y 13");
			}else if (i%7==0) {
				System.out.println(i + " es multiplo de 7");
			}else if (i%13==0) {
				System.out.println(i + " es multiplo de 13");
			}else {
				System.out.println(i);
			}
		}*/
		
		/*int i =1;
		while (i<=100) {
			System.out.println(i);
			i++;
		}
		System.out.println("----------------------");
		int j =100;
		while (j>=0) {
			System.out.println(j);
			j--;
		}
		System.out.println("----------------------");
		int k=0;
		while (k<=100) {
			System.out.println(k);
			k+=2;
		}
		System.out.println("----------------------");
		int m=1;
		do{
			System.out.println(m);
			m++;
		}while (m<=100);*/
		
		/*System.out.println("Introduce tu edad:");
		int edad=Integer.valueOf(scanner.nextLine());
		while(edad<0 || edad>100) {
			System.out.println("Edad incorrecta, introduce una edad entre 0 y 100");
			edad=Integer.valueOf(scanner.nextLine());
		}
		if (edad<18) {
			System.out.println("Es un niño");
		}else if (edad<65){
			System.out.println("Es un adulto");
		}else {
			System.out.println("Es un anciano");
		}*/
		
		/*int edad=0;
		do {
			System.out.println("Introduce una edad entre 0 y 100");
			edad=Integer.valueOf(scanner.nextLine());
		}while(edad<0 || edad>100);
		
		if (edad<18) {
			System.out.println("Es un niño");
		}else if (edad<65){
			System.out.println("Es un adulto");
		}else {
			System.out.println("Es un anciano");
		}*/
		/*System.out.println(suma(5,8));
		System.out.println(factorial(5));*/
		fibonacci(5);
	}
	public static int suma(int num1,int num2) {
		return num1+num2;
	}
	public static int factorial(int num1) {
		int resultado=1;
		for (int i=1;i<=num1;i++) {
			resultado=resultado*i;
		}
		return resultado;
	}
	
	public static void fibonacci(int numero) {
		int primer=1;
		int segundo=1;
		System.out.println(1);
		System.out.println(1);
		int siguiente=0;
		for (int i=2;i<numero;i++) {
			siguiente=primer+segundo;
			primer=segundo;
			segundo=siguiente;
			System.out.println(siguiente);
		}
	}
}