package ejercicio9;

import java.util.Scanner;

public class PreguntaNombre {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre="";

		System.out.println("Introduzce tu nombre: ");
        nombre = sc.nextLine();
        System.out.println("¡Hola "+nombre+"!");
        sc.close();
    }
}
