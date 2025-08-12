import java.util.Scanner;

public class Saida {

    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);
        System.out.println("Qual é o seu nome?");
        String nome = tec.nextLine();

        System.out.println("Qual é a sua idade?");
        int idade = tec.nextInt();

        System.out.println("Então seu nome é " + nome + " e sua idade é " + idade + " anos, certo?");

        tec.close();
    }
}
