import java.util.Scanner;

public class Decisoes {

    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);

        System.out.println("Me diga a sua idade e vejamos se pode dirigir:");
        int idade = tec.nextInt();
        if (idade >= 18) {
            System.out.println("Você já pode dirigir se tiver carta!");
        } else {
            System.out.println("Você é novo demais!");
        }

        System.out.println("\nMe diga um número, sendo ele positivo, negativo ou zero:");
        int n = tec.nextInt();
        if (n > 0) {
            System.out.println("Seu número é positivo!");
        } else if (n == 0) {
            System.out.println("O número escolhido é 0!");
        } else {
            System.out.println("Seu número é negativo!");
        }

        System.out.println("\nMe dê um número, que vou te dizer se é par ou ímpar:");
        int num = tec.nextInt();
        if (num % 2 == 0) {
            System.out.println("O seu número é par!");
        } else {
            System.out.println("Seu número é ímpar!");
        }

        tec.close();
    }
}
