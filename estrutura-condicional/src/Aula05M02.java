import java.util.Scanner;

public class Aula05M02 {
    public static void Executar() {
        // usando o if e else para resolver o algoritmo
        Scanner sc = new Scanner(System.in);

        double preco = 34.5;
        double desconto;
        if (preco < 20.0) {
            desconto = preco * 0.1;
        } else {
            desconto = preco * 0.5;
        }

        System.out.println("Desconto " + desconto);
    }
}
