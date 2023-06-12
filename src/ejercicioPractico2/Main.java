package ejercicioPractico2;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String[] comando1 = {"java", "src\\ejercicioPractico2\\Proceso1.java"};
        String[] comando2 = {"java", "src\\ejercicioPractico2\\Proceso2.java"};
        ProcessBuilder pb1 = new ProcessBuilder(comando1);
        pb1.inheritIO();
        ProcessBuilder pb2 = new ProcessBuilder(comando2);
        pb2.inheritIO();
        try {
            Process p1 = pb1.start();
            int seg = 0;
            while (p1.isAlive() && seg<30 ){
                seg++;
                Thread.sleep(1000);
            }
            if (seg >= 30){
                p1.destroy();
                Process p2 = pb2.start();
                System.err.println("El proceso ha tardado mas de 30 segundos en terminar");
            }else{
                Process p2 = pb2.start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
