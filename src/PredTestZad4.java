import java.util.Scanner;

public class PredTestZad4 {
    public static void main(String[] args) {
        //Zadatak 4 - Unositi brojeve sve dok se ne unesu dva ista broja za redom,
        // nakon toga prikazati sumu svih prethodno unetih brojeva
        Scanner sc = new Scanner(System.in);
        int i = 0;
        int suma = 0;
        int b = 0;

        while (i >= 0) {
            System.out.print("Unesi broj: ");
            int a = sc.nextInt();
            if (a == b && b!=0) {
                break;
            }
            b = a;
            suma = suma + a;


            i++;
        }

        System.out.println("Suma svih brojeva je: " + (suma + b) );
    }
}
