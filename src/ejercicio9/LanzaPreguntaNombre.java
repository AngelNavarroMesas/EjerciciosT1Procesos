package ejercicio9;

import java.io.*;

public class LanzaPreguntaNombre {
    public static void main(String[] args) {
        Runtime run = Runtime.getRuntime();
        String[] comando = {"java", "src\\ejercicio9\\PreguntaNombre.java"};

        try{
            Process pro = run.exec(comando);
            OutputStream os = pro.getOutputStream();
            OutputStream osw = new OutputStream(os);
            InputStream is = pro.getInputStream();
            InputStreamReader isr = new InputStreamReader(is);


        }catch(Exception e){

        }
    }
}
