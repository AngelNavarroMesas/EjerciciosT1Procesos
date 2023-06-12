package ejercicio5;

import java.io.File;
import java.io.IOException;

public class LanzaPreguntaNombre {
    public static void main(String[] args) {
        String []comando = {"java", "C:\\Users\\angel\\IdeaProjects\\EjerciciosT1Procesos\\src\\ejercicio5\\PreguntaNombre.java"};
        ProcessBuilder pb = new ProcessBuilder(comando);
        pb.redirectInput(new File("C:\\Users\\angel\\IdeaProjects\\EjerciciosT1Procesos\\src\\ejercicio5\\nombre.txt"));
        pb.redirectOutput(ProcessBuilder.Redirect.INHERIT);
        pb.redirectError(ProcessBuilder.Redirect.INHERIT);
        try {
            Process p = pb.start();
            p.waitFor();
        }catch (IOException e){
            e.printStackTrace();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
