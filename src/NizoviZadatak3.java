import java.util.Scanner;

public class NizoviZadatak3 {
    public static void main(String[] args) {

        //Napisati program koji izracunava geometrijsku sumu parnih brojeva na
        // neparnim indeksima: niz[0] * niz[1] * ... * niz[n]

        Scanner sc = new Scanner(System.in);

        System.out.print("Unesite koliko brojeva zelite u svom nizu: ");
        int duzinaNiza = sc.nextInt();
        int[] korisnikovNiz = new int [duzinaNiza];
        int geoSuma = 1;
        for (int i = 0; i < duzinaNiza; i++) {
            System.out.println("Unesite element u niz: ");
            korisnikovNiz[i] = sc.nextInt();

            if(i%2 != 0 && korisnikovNiz[i] %2 == 0) {
                geoSuma = geoSuma * korisnikovNiz[i];

            }

            System.out.println("Geosuma za " + i + ". indeks je: " + geoSuma);

        }

        System.out.println("Program je zavrsen.");




    }
}
