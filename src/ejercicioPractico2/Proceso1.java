package ejercicioPractico2;

public class Proceso1 {
    public static void main(String[] args) {
        String[] comando1 = {"cmd", "/C", "md", "C:\\ejercicio2 "};
        String[] comando2 = {"cmd", "/C", "type", "null", ">", "C:\\ejercicio2\\numLineas.txt"};
        String[] comando3 = {"Notepad.exe", "C:\\ejercicio2\\numLineas.txt"};
        ProcessBuilder pb1 = new ProcessBuilder(comando1);
        pb1.inheritIO();
        ProcessBuilder pb2 = new ProcessBuilder(comando2);
        pb2.inheritIO();
        ProcessBuilder pb3 = new ProcessBuilder(comando3);
        pb3.inheritIO();
        try {
            Process p1 = pb1.start();
            p1.waitFor();
            Process p2 = pb2.start();
            p2.waitFor();
            Process p3 = pb3.start();
            p3.waitFor();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
