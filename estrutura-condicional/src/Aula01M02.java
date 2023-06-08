import java.util.Locale;

public class Aula01M02 {
    public static void Executar() {
        // Expressoes comparativas

        Locale.setDefault(Locale.US);

        int x = 5;
        int y = 10;

        System.out.printf("X é maior que Y? %d", x > y);
        System.out.printf("\nX é menor que Y? %d", x < y);
        System.out.printf("\nX é diferente de Y? %d", x != y);
        System.out.printf("\nX é igual a Y? %d", x == y);

        //também temos os comparadores maior ou igual e menor ou igual

        int a = 20;
        int b = 20;


        System.out.printf("\nA é maior ou igual a B? %d", a >= b);
        System.out.printf("\nB é maior ou igual a B? %d", a <= b);

        //agora vamos fazer um teste trocando o valor de b

        b = 21;

        System.out.printf("\nA é maior ou igual a B? %d", a >= b);
        System.out.printf("\nB é maior ou igual a B? %d", a <= b);
    }
}
