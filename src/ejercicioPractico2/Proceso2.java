package ejercicioPractico2;

import java.io.IOException;

public class Proceso2 {
    public static void main(String[] args) throws InterruptedException {
        String[] comando1 = {"java", "C:\\Users\\angel\\IdeaProjects\\EjerciciosT1Procesos\\src\\ejercicioPractico2\\CuentaLineas.java"};
        ProcessBuilder pb1 = new ProcessBuilder(comando1);
        pb1.inheritIO();
        try {
            Process p1 = pb1.start();
            int seg = 0;
            while (p1.isAlive() && seg<30 ){
                seg++;
                Thread.sleep(1000);
            }
            if (seg >= 30){
                p1.destroy();
                System.err.println("El proceso ha tardado mas de 30 segundos en terminar");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
