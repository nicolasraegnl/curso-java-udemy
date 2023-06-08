import java.util.Scanner;

public class Aula03M02 {
    public static void Executar() {
        // if e else

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        String diaSemana;

        if (x == 1) {
            diaSemana = "Domingo";
        } else if (x == 2){
            diaSemana = "Segunda";
        } else if (x == 3) {
            diaSemana = "Terça";
        } else if (x == 4) {
            diaSemana = "Quarta";
        } else if (x == 5) {
            diaSemana = "Quinta";
        } else if (x == 6) {
            diaSemana = "Sexta";
        } else if (x == 7) {
            diaSemana = "Sabádo";
        } else {
            diaSemana = "Valor invalido";
        }

        System.out.println("Dia da semana " + diaSemana);
        sc.close();
    }
}
