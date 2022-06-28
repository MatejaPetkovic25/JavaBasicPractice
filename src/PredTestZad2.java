import java.util.Scanner;

public class PredTestZad2 {
    public static void main(String[] args) {
        // Zadatak 2 - Napisati program gde korisnik (djak) unosi poslednjih 5 ocena,
        // ako ima sve petice program vrati poruku "Odlican djak",
        // ako nema sve petice vraca poruku "Nije odlican djak"
        Scanner sc = new Scanner(System.in);
        int a = 0;

        System.out.println("Unesite poslednjih 5 ocena.");
        for (int i = 1; i < 6; i++) {
            System.out.print(i + ". ocena: ");
            int ocena = sc.nextInt();
            if (ocena !=5) {
                a = a + 1;
            }
            if (ocena > 5 || ocena < 1 ) {
                System.out.println("Niste uneli ispravnu ocenu. Pocnite ispocetka.");
                break;
            }
        }
        if (a == 0) {
            System.out.println("Odlican djak");
        } else {
            System.out.println("Nije odlican djak");
        }


    }
}
