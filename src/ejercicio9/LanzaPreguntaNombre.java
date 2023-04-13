package ejercicio9;

import java.io.*;

public class LanzaPreguntaNombre {
    public static void main(String[] args) {
        Runtime run = Runtime.getRuntime();
        String[] comando = {"java", "src\\ejercicio9\\PreguntaNombre.java"};

        try{
            Process pro = run.exec(comando);
            InputStream is = pro.getInputStream();
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);
            BufferedWriter bw = new BufferedWriter(new FileWriter("salidaPreguntaNombre2.txt"));

            String line = br.readLine();
            while(line!=null) {
                bw.write(line);
                bw.newLine();
                line = br.readLine();
            }
            bw.flush();
            bw.close();
        }catch(Exception e){

        }
    }
}
