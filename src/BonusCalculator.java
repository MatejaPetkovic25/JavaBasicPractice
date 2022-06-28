import java.util.Scanner;

public class BonusCalculator {
    public static void main(String[] args) {
        Scanner skener = new Scanner(System.in);

        System.out.print("Unesite broj uspesnih prodaja: ");
        int prodaje = skener.nextInt();
        System.out.print("Unesite vasu platu: ");
        double plata = skener.nextDouble();

        if (prodaje >= 10) {
            System.out.println("Dobicete " + (plata + plata * 0.2) );
        } else if (prodaje >= 5) {
            System.out.println("Dobicete" + (plata + plata * 0.1) );
        } else if (prodaje >= 2) {
            System.out.println("Dobicete" + (plata + (plata * 0.05)));

        } else if (prodaje >= 1) {
            System.out.println("Dobicete" + (plata + (plata * 0.01)));
        } else {
            System.out.println("Niste nista prodali, otpusteni ste");
        }
    }
}
