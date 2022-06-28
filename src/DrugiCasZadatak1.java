import java.util.Scanner;

public class DrugiCasZadatak1 {
    public static void main(String[] args) {

        //Zadatak 1 - Preko skenera uneti tri broja. Prvi broj ce odredjivati funkciju druga dva broja.
        // Ako se unese broj 1 onda druga dva moraju da se saberu, ako se unese 2 onda se od drugog oduzima treci,
        // ako se unese 3 onda se mnoze, ako se unese 4 onda se dele

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite tri broja. Prvi odredjuje funkciju druga dva i mora biti 1-4.");
        int a = sc.nextInt();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        switch (a) {
            case 1:
                double zbir = b + c;
                System.out.println("Zbir dva broja je " + zbir);
                break;
            case 2:
                double oduzimanje = b - c;
                System.out.println("Kada oduzmemo treci broj od drugog dobije se: " + oduzimanje);
                break;
            case 3:
                double proizvod = b * c;
                System.out.println("Kada pomnozimo brojeve dobije se " + proizvod);
                break;
            case 4:
                double kolicnik = b / c;
                System.out.println("Kolicnik dva broja je " + kolicnik);
                break;
            default:
                System.out.println("Niste uneli prvi broj kako treba.");
                break;

        }


    }


}
