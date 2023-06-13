package ejercicioPractico2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
public class CuentaLineas {
    public static void main(String[] args) {
        int contador = 0;
        try {
            BufferedReader bf = new BufferedReader(new FileReader("C:\\pruebas\\numLineas.txt"));
            Scanner sc = new Scanner(bf);
            while (sc.hasNext()){
                contador++;
                sc.next();
            }
            System.out.println(contador);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
