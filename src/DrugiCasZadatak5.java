import java.util.Scanner;

public class DrugiCasZadatak5 {
    public static void main(String[] args) {
//Zadatak 5 - Korisnik unosi brojeve preko skenera i potrebno je racunati sumu dok korisnik ne unese negativan broj
// - Koristiti DO WHILE
        Scanner sc = new Scanner(System.in);

        int i = 0;
        int suma = 0;
        do {
            System.out.print("Unesite broj. Ako unesete negativan broj program ce se zaustaviti: ");
            int a = sc.nextInt();
            suma = suma + a;


            if (a < 0) {
                System.out.println("Program je sada zavrsen.");
                System.out.println("Konacna suma je: " + (suma - a));
                break;

            } else {System.out.println("Suma je trenutno: " + suma);}

        i++;
        } while (i >= 0);

        /*      Ovo je ispravno resenje:
        do {
            System.out.print("Unesite pozitivan broj: ");
            int x = sc.nextInt();
            i = x;
            suma = suma + i;


        } while (i > 0);

        suma = suma - i;

        System.out.println("Program je sada zavrsen. Konacna suma iznosi: " + suma);
*/


    }
}
