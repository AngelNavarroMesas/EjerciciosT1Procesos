package ejercicio7;

import java.util.Scanner;

public class Clase2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ip;
        for(int i=1;i<10;i++){
            ip = sc.nextLine();
            String[] arrayIp = ip.split("\\.");
            int principio = Integer.parseInt(arrayIp[0]);
            if(principio<=223) {
                System.out.println(ip);
            }
        }

    }
}
