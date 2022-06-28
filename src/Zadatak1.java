import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {

        //Zadatak 1 - Preko skenera uneti ime, pol i broj godina. Ako je korisnik maloletan treba se
        // ispisati odgovarajuca poruka. Ako je korisnik muskog pola potrebno je ispisati poruku "Gospodine " + ime,
        // a ako je zenskog pola treba ispisati poruku "Gospodjo " + ime

        Scanner sc = new Scanner(System.in);

        System.out.println("Molimo Vas unesite sledece podatke.");
        System.out.print("Ime: ");
        String ime = sc.next();
        System.out.print("Unesite pol (m/z): ");
        String pol = sc.next();
        System.out.print("Broj godina: ");
        int brojGodina = sc.nextInt();

        if (brojGodina < 18) {
            System.out.println("Korisnik je maloletan.");
        }

         if (pol.equals("m")) {
            System.out.println("Gospodine " + ime);
        } else  if (pol.equals("z")) {
            System.out.println("Gospodjo " + ime);
        }

    }

}
