package ejercicio9;

import java.io.*;

public class LanzaPreguntaNombre {
    public static void main(String[] args) {
        Runtime run = Runtime.getRuntime();
        String[] comando = {"java", "src\\ejercicio9\\PreguntaNombre.java"};

        try{
            Process pro = run.exec(comando);
            FileReader fr = new FileReader("src\\ejercicio9\\entradaPreguntaNombre.txt");
            BufferedReader br = new BufferedReader(fr);

            OutputStream os = pro.getOutputStream();
            OutputStreamWriter osr = new OutputStreamWriter(os);
            BufferedWriter bw = new BufferedWriter(osr);
            String line = br.readLine();
            while(line!=null) {
                bw.write(line);
                bw.newLine();
                line = br.readLine();
            }
            bw.close();
            pro.waitFor();

            InputStream is = pro.getInputStream();
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br2 = new BufferedReader(isr);

            String linea = br2.readLine();
            while(linea!=null) {
                System.out.println(linea);
                linea = br2.readLine();
            }

        }catch(Exception e){

        }
    }
}
