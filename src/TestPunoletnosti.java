import java.util.Scanner;

public class TestPunoletnosti {
    public static void main(String[] args) {
        Scanner skener = new Scanner(System.in);

        System.out.print("Trenutna godina: ");
        int trenutnaGodina = skener.nextInt();
        System.out.print("Unesite vasu godinu rodjenja: ");

        int godinaRodjenja = skener.nextInt();

        if (trenutnaGodina - godinaRodjenja >= 18) {
            System.out.println("Osoba je punoletna");

        }
        else {
            System.out.println("Osoba nije punoletna");

        }

    }

}