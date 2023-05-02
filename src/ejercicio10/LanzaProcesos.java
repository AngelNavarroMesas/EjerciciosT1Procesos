package ejercicio10;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class LanzaProcesos {
    public static void main(String[] args) {
        String []comando1 = {"java", "src\\ejercicio10\\Proceso1.java"};
        String []comando2 = {"java", "src\\ejercicio10\\Proceso2.java"};
        String []comando3 = {"java", "src\\ejercicio10\\Proceso3.java"};


        ProcessBuilder pb1 = new ProcessBuilder(comando1);
        ProcessBuilder pb2 = new ProcessBuilder(comando2);
        ProcessBuilder pb3 = new ProcessBuilder(comando3);
        List<ProcessBuilder> pbl = new ArrayList<>();
        pbl.add(pb1);
        pbl.add(pb2);
        pbl.add(pb3);
        pb3.redirectOutput(ProcessBuilder.Redirect.appendTo(new File("src\\ejercicio10\\ips.txt")));
        pb1.redirectError(ProcessBuilder.Redirect.INHERIT);
        pb2.redirectError(ProcessBuilder.Redirect.INHERIT);
        pb3.redirectError(ProcessBuilder.Redirect.INHERIT);
        
        try{
            ProcessBuilder.startPipeline(pbl);
        }catch (Exception e){

        }
    }
}
