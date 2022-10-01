import java.util.Scanner;

public class App {

    static final byte DOBRO = 2;
    public static void main(String[] args){

        Scanner console = new Scanner(System.in);

        double lado = 5;

        double area = Math.pow(lado, DOBRO);
        double dobroArea = area * DOBRO;
    
        System.out.printf("O dobro da área do quadrado é %.2f", dobroArea);
        console.close();
    }
}
