import java.util.Scanner;

public class Aula03M01 {
    public static void Executar() {
        Scanner sc = new Scanner(System.in);
        // Scanner tem como objetivo separar a entrada dos textos
        String nome;

        System.out.println("Qual o seu nome?");
        nome = sc.next();

        System.out.println("Olá " + nome); // interpolação de dados

        sc.close();
    }
}
