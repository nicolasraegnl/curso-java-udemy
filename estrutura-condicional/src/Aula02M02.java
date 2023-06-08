import java.util.Scanner;

public class Aula02M02 {
    public static void Executar() {

        Scanner sc = new Scanner(System.in);

        int horas;

        System.out.println("Quantas horas?");
        horas = sc.nextInt();

        if (horas < 12) {
            System.out.println("Bom dia!");
        }
        else {
            if (horas < 18){
                System.out.println("Boa tarde!");
            }
            else {
                System.out.println("Boa Noite!");
            }
        }

        sc.close();
    }

}
