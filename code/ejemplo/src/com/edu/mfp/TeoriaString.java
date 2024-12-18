package com.edu.mfp;

import java.util.Scanner;

public class TeoriaString {

	public static void main(String[] args) {
		//imprimirCaracteres();
		//comparacionDeIgualacionString();
		remplazar();
	}
	
	/* Este es un ejemplo de como usar el Sring.chartAt(int):char 
	 * devuelve el caracter que se encuentra en la posición del int 
	 * pasado por parámetros*/
	public static void imprimirCaracteres() {
		String cadena="Alfombra";
		for (int i=0;i<cadena.length();i++) {
			System.out.println(cadena.charAt(i));
		}
	}
	
	/* En java las cadenas que son exactamente iguales y que no son
	 * producto de una concatenación, etc (Tiempo de compilación) se
	 * les asigna el mismo id por lo que al usar el '==' funcionará 
	 * ya que este compara IDs. 
	 * Sin embargo si la cadena son producto de una concatenación, etc 
	 * (Se ha creado en tiempo de ejecución) no tendrá el mismo IDs por 
	 * lo que '==' no dará siempre false. RECOMENDACIÓN: Usar siempre 
	 * .equals() y sus variaciones ya que si que compara cadenas*/
	public static void comparacionDeIgualacionString() {
		Scanner scanner= new Scanner(System.in);
		System.out.println(scanner.nextLine()==scanner.nextLine());
		System.out.println(scanner.nextLine().equals(scanner.nextLine()));
	}
	
	/* Hay 3 metodos:
	 *  - String.Contains(String):boolean Te dice si contine la cadena 
	 *  (Similar a String.indexOf(String):int ya que si este metodo devuelve -1 es que no la ha encontrado)
	 *  - String.startsWith(String):boolean Te dice si empieza con la cadena
	 *  - String.endsWith(String):boolean Te dice si termina con la cadena*/
	public static void saberCadenaContieneOtra() {
		String cadena = "Cadena";
		System.out.println(cadena.contains("den"));
		System.out.println(cadena.contains("dn"));
		System.out.println(cadena.startsWith("Cad"));
		System.out.println(cadena.startsWith("ad"));
		System.out.println(cadena.endsWith("ena"));
		System.out.println(cadena.endsWith("ae"));
	}
	
	/* Para remplazar puedes usar el String.replace(String antiguo,String nuevo)*/
	public static void remplazar() {
		String cadena="Cadena";
		System.out.println(cadena.replace('a', 'i'));
	}
	
	/* Para saber si una cadena está vacía usamos String.isEmpty() que devuelve true si la cadena es ""
	 * Pero para una cadena como esta "   " nos dará false ya que eso no es una cadena vacía, en ese
	 * caso usaríamos String.isBlank() que nos dará true si la cadena está vacía o en blanco. También
	 * podríamos usar String.trim().isEmpty() ya que String.trim() quita los espacios del principio y
	 * del final por lo que para "    " si quitas los espacios quedaría ""*/

}
