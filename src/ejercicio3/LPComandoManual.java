package ejercicio3;

import java.io.IOException;
import java.util.Scanner;

public class LPComandoManual {
    public static void main(String[] args) {
        String programa="";
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el nombre del programa a lanzar");
        programa = sc.nextLine();
        String comando[] = {"java", programa};
        ProcessBuilder pb = new ProcessBuilder(comando);
        //Prove este ejercicio ejecutando el ejercicio2 ---> src/ejercicio2/LanzaProcesoLento.java
        pb.inheritIO();
        try {
            pb.start();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
