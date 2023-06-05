import java.util.Scanner;

public class Aula06M01 {
    public static void Executar() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe um número:");
        int n1 = sc.nextInt();

        System.out.println("Informe mais um número:");
        int n2 = sc.nextInt();

        int soma = n1 + n2;
        int subtracao = n1 - n2;
        int divisao = n1 / n2;
        int multiplicacao = n1 * n2;
        int restoDivisao  = n1 % n2;

        System.out.println("O resultado da soma é " + soma);
        System.out.println("O resultado da subtração é " + subtracao);
        System.out.println("O resultado da multipilcação é " + multiplicacao);
        System.out.println("O resultado da divisão é " + divisao);
        System.out.println("O resultado do  resto da divisão é " + restoDivisao);

        sc.close();
    }
}
