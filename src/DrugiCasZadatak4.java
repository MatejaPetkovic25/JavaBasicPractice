import java.util.Scanner;

public class DrugiCasZadatak4 {
    public static void main(String[] args) {
//Zadatak 4 - Prikazati aritmeticku sredinu od 1 do N - Koristiti WHILE
        Scanner sc = new Scanner(System.in);

        System.out.print("Unesite broj N: ");
        int n = sc.nextInt();
        int i = 0;
        double suma = 0;
        while(i <= n) {

            suma = suma + i;
        i++;

        }
        System.out.println("Aritmeticka sredina od 1 do N je: " + suma / n);

        }





}
