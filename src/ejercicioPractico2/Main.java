package ejercicioPractico2;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        String[] comando1 = {"Notepad.exe", "C:\\pruebas\\numLineas.txt"};
        String[] comando2 = {"java", "C:\\Users\\anavarro\\IdeaProjects\\EjerciciosT1Procesos\\src\\ejercicioPractico2\\CuentaLineas.java"};
        ProcessBuilder pb1 = new ProcessBuilder(comando1);
        pb1.inheritIO();
        ProcessBuilder pb2 = new ProcessBuilder(comando2);
        pb2.inheritIO();
        try {
            Process p1 = pb1.start();
            if (p1.waitFor(30,TimeUnit.SECONDS)){
                pb2.start();
            }else{
                p1.destroy();
                pb2.start();
                System.err.println("El proceso ha tardado mas de 30 segundos en terminar");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
