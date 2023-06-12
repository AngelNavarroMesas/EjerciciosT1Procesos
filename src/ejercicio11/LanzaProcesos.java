package ejercicio11;

import java.io.File;
import java.io.IOException;

public class LanzaProcesos {
    public static void main(String[] args) throws IOException {
        String[] comando1 = {"cmd", "/C", "type", "null", ">", "C:\\pruebas\\carpeta1\\fichero2.txt"};
        String[] comando2 = {"Notepad.exe", "C:\\pruebas\\carpeta1\\fichero2.txt"};
        String[] comando3 = {"java", "src\\ejercicio11\\ProcesoLeer.java"};

        ProcessBuilder pb1 = new ProcessBuilder(comando1);
        pb1.inheritIO();
        ProcessBuilder pb2 = new ProcessBuilder(comando2);
        pb2.inheritIO();
        ProcessBuilder pb3 = new ProcessBuilder(comando3);
        pb3.inheritIO();
        pb3.redirectInput(new File("C:\\pruebas\\carpeta1\\fichero2.txt"));
        pb3.redirectOutput(ProcessBuilder.Redirect.INHERIT);
        pb3.redirectError(ProcessBuilder.Redirect.INHERIT);
        try {
            Process p1 = pb1.start();
            p1.waitFor();
            Process p2 = pb2.start();
            p2.waitFor();
            Process p3 = pb3.start();
            p3.waitFor();
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
