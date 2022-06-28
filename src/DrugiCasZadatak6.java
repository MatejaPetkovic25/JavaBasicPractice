import java.util.Scanner;

public class DrugiCasZadatak6 {
    public static void main(String[] args) {
//Zadatak 6 - Nacrtajte trougao sa N redova

        Scanner sc = new Scanner(System.in);

        System.out.print("Unesite broj n koji oznacava visinu trougla: ");
        int n = sc.nextInt();
        String tacka = "";
        for(int i = 0; i < n; i++) {
            String tackica = ".";

            tacka = tacka + tackica;

            System.out.println(tacka);


        }
        if(n > 5) {
            System.out.println("Ovo je vas trougao.");
        } else {
            System.out.println("Ovo je vas trouglic");
        }
    }
}
