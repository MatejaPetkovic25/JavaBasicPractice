import java.util.Scanner;

public class DrugiCasZadatak2 {
    public static void main(String[] args) {
//Zadatak 2 - Napraviti for petlju koja ce da se pokrene 5 puta.
// Svaki put ce traziti od korisnika da unese neki broj.
// Ako korisnik unese 0 onda je potrebno ispisati "Bingo!"

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.print("Unesite neki broj: ");
            int a = sc.nextInt();
            if (a == 0) {
                System.out.println("Bingo!");
            }

        }
        System.out.println("Kraj programa.");

    }

}
