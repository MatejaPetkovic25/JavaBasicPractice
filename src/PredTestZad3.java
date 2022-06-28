import java.util.Scanner;

public class PredTestZad3 {
    public static void main(String[] args) {
        //Zadatak 3 - Uneti dvocifren broj i prikazati prvu i drugu cifru
        Scanner sc = new Scanner(System.in);

        System.out.print("Unesi dvocifren broj: ");
        int broj = sc.nextInt();

        if (broj < 10 || broj > 99) {
            System.out.println("Niste uneli dvocifren broj.");
        }
        else{
            int prvaCifra = broj/10;
            int drugaCifra = broj%10;
            System.out.println("Prva cifra je " + prvaCifra);
            System.out.println("Druga cifra je " + drugaCifra);
        }





    }
}
