import java.util.Locale;

public class Aula08M01 {
    public static void Executar() {
        Locale.setDefault(Locale.US);

        double value = 10.35784;
        System.out.println(value);
        System.out.printf("%.2f%n", value);
        System.out.printf("%.4f%n", value);
    }
}
