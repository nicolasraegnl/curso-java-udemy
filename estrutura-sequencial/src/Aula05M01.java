import java.util.Scanner;

public class Aula05M01 {
    public static void Executar() {
        Scanner sc = new Scanner(System.in);

        int n1, n2, resultado;

        System.out.println("Informe um número");
        n1 = sc.nextInt();

        System.out.println("Informe mais um número");
        n2 = sc.nextInt();

        resultado = n1 + n2;
        System.out.println("O resultado da soma dos números é " + resultado);

        sc.close();
    }
}
