package ejercicio2;

import java.io.File;
import java.io.IOException;

public class LanzaProcesoLento {
    public static void main(String[] args) {
        String comando[] = {"java", "C:\\Users\\angel\\IdeaProjects\\EjerciciosT1Procesos\\src\\ejercicio2\\ProcesoLento.java"};
        ProcessBuilder pb = new ProcessBuilder(comando);
        pb.directory(new File("src/ejercicio2/"));
        pb.redirectError(ProcessBuilder.Redirect.INHERIT);
        try {
            Process p = pb.start();
            while(p.isAlive()) {
                System.out.println("Sigue en ejecución");
                Thread.sleep(3000);
            }
            System.out.println("El proceso ha terminado");
        }catch (IOException e){
            System.err.println("Ha habido un error al lanzar el proceso");
            e.printStackTrace();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
