package ejercicioPractico1;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opc;
        String ruta;
        String[] comando;
        System.out.println("Elija qué comando desea ejecutar:");
        System.out.println("1. Crear carpeta");
        System.out.println("2. Crear fichero");
        System.out.println("3. Mostrar contenido del directorio");
        opc = sc.nextInt();
        System.out.println("Introduzca una ruta");
        ruta = sc.next();
        switch (opc) {
            case 1:
                System.out.println("Introduzca el nombre de la carpeta a crear");
                String carpeta = sc.next();
                comando = new String[]{"cmd", "/C", "md", ruta+"\\"+carpeta};
                crear(comando);
                break;
            case 2:
                System.out.println("Introduzca el nombre del fichero a crear");
                String fichero = sc.next();
                comando = new String[]{"cmd", "/C", "type", "nul", ">", ruta+"\\"+fichero};
                crear(comando);
                break;
            case 3:
                comando = new String[]{"cmd", "/C", "dir", ruta};
                ProcessBuilder pb = new ProcessBuilder(comando);
                pb.redirectOutput(ProcessBuilder.Redirect.INHERIT);
                break;
            default:
                System.out.println("Introduzca una de las 3 opciones");
        }
    }
    public static void crear(String[] comando){
        ProcessBuilder pb = new ProcessBuilder(comando);
        pb.inheritIO();
        try {
            Process p = pb.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
