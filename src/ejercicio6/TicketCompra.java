package ejercicio6;

import java.util.Scanner;

public class TicketCompra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int id, cantidad;
        double precio, total;
        id = sc.nextInt();
        precio = sc.nextDouble();
        cantidad = sc.nextInt();
        total = precio*cantidad;
        System.out.println(id+"-"+precio+"-"+cantidad+"-"+total);
    }
}
