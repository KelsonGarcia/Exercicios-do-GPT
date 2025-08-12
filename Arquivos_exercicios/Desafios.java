import java.util.Scanner;

public class Desafios {

    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);

        // Média de 3 números
        System.out.println("Me diga 3 números reais em sequência para calcular a média.");

        System.out.print("Digite o valor A: ");
        double a = tec.nextDouble();

        System.out.print("Digite o valor B: ");
        double b = tec.nextDouble();

        System.out.print("Digite o valor C: ");
        double c = tec.nextDouble();

        double media = (a + b + c) / 3;
        System.out.printf("A média entre esses 3 números é: %.2f%n", media);

        // Conversão de temperatura
        System.out.print("\nDigite uma temperatura em Celsius para converter em Fahrenheit: ");
        double celsius = tec.nextDouble();
        double fahrenheit = (celsius * 9 / 5) + 32;
        System.out.printf("A temperatura em Fahrenheit é: %.2f°F%n", fahrenheit);

        // Dobro e triplo
        System.out.print("\nDigite um número para calcular o dobro e o triplo: ");
        int n = tec.nextInt();
        int dobro = n * 2;
        int triplo = n * 3;
        System.out.println("O dobro do seu número é: " + dobro + " e o triplo é: " + triplo);

        tec.close();
    }
}
