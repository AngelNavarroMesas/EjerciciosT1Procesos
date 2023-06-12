package ejercicioPractico3;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    static String[] comando1 = {"java", "src/ejercicioPractico3/CuentaCaracteres.java", "a"};
    static ProcessBuilder pb1 = new ProcessBuilder(comando1);
    static String[] comando2 = {"java", "src/ejercicioPractico3/CuentaCaracteres.java", "e"};
    static ProcessBuilder pb2 = new ProcessBuilder(comando2);
    static String[] comando3 = {"java", "src/ejercicioPractico3/CuentaCaracteres.java", "i"};
    static ProcessBuilder pb3 = new ProcessBuilder(comando3);
    static String[] comando4 = {"java", "src/ejercicioPractico3/CuentaCaracteres.java", "o"};
    static ProcessBuilder pb4 = new ProcessBuilder(comando4);
    static String[] comando5 = {"java", "src/ejercicioPractico3/CuentaCaracteres.java", "u"};
    static ProcessBuilder pb5 = new ProcessBuilder(comando5);
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opc;
        do {
            System.out.println();
            System.out.println("Elija como ejecutar los procesos");
            System.out.println("1. Todos a la vez");
            System.out.println("2. Uno por uno");
            System.out.println("3. Salir");
            opc = sc.nextInt();
            sc.nextLine();
            switch (opc) {
                case 1:
                    aLaVez();
                    break;
                case 2:
                    unoAUno();
                    break;
                case 3:
                    System.out.println("-----Saliendo-----");
                    break;
            }
        } while (opc != 3);
    }

    public static void unoAUno(){
        pb1.inheritIO();
        pb2.inheritIO();
        pb3.inheritIO();
        pb4.inheritIO();
        pb5.inheritIO();
        try{
            long inicio = System.currentTimeMillis();
            inicio = System.currentTimeMillis();
            Process p1 = pb1.start();
            p1.waitFor();
            Process p2= pb2.start();
            p2.waitFor();
            Process p3= pb3.start();
            p3.waitFor();
            Process p4= pb4.start();
            p4.waitFor();
            Process p5= pb5.start();
            p5.waitFor();
            long fin = System.currentTimeMillis();
            int tiempo = (int) (fin - inicio);
            System.out.println(tiempo);
        }catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

        public static void aLaVez(){
        pb1.inheritIO();
        pb2.inheritIO();
        pb3.inheritIO();
        pb4.inheritIO();
        pb5.inheritIO();
        try{
            long inicio = System.currentTimeMillis();
            Process p1 = pb1.start();
            Process p2= pb2.start();
            Process p3= pb3.start();
            Process p4= pb4.start();
            Process p5= pb5.start();
            p1.waitFor();
            p2.waitFor();
            p3.waitFor();
            p4.waitFor();
            p5.waitFor();
            long fin = System.currentTimeMillis();
            int tiempo = (int) (fin - inicio);
            System.out.println(tiempo);
        }catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
