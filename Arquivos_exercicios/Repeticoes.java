import java.util.Scanner;

public class Repeticoes {

    public static void main(String[] args) {

        System.out.println("Contando de 1 até 10:");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        Scanner tec = new Scanner(System.in);

        System.out.println("\nMe diga um número inteiro e mostrarei a tabuada dele:");
        int n = tec.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }

        System.out.println("\nMe diga um número para eu te mostrar a contagem regressiva:");
        for (int y = tec.nextInt(); y >= 0; y--) {
            System.out.println("Contagem: " + y);
        }

        tec.close();
    }
}
