package ejercicio7;

import java.util.Scanner;

public class Clase3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextLine()){
            String ip = sc.nextLine();
            String[] arrayIp = ip.split("\\.");
            int principio = Integer.parseInt(arrayIp[0]);
            if(principio>=0&&principio<=127){
                System.out.println(ip+" rango A");
            }else if(principio>=128&&principio<=191){
                System.out.println(ip+" rango B");
            }else if(principio>=192&&principio<=223){
                System.out.println(ip+" rango C");
            }

        }
    }
}
