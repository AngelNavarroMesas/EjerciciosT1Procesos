package ejercicio7;

public class Clase1 {
    public static void main(String[] args) {
        for(int i=0;i<10;i++) {
            System.out.println(random() + "." + random() + "." + random() + "." + random());
        }
    }
    private static int random(){
        int num;
        num= (int) (Math.random()*255);
        return num;
    }
}
