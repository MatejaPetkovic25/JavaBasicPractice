import java.util.Scanner;

public class NizoviBonusZadatak {
    public static void main(String[] args) {
        //bonus napravite da se elementi niza i duzina niza ucitava preko skenera

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite koliko brojeva zelite u svom nizu.");
        int[] nizX = new int[sc.nextInt()];
        System.out.println(nizX.length);

        System.out.println("Sada dodelite vrednost za prvih pet brojeva");
        nizX[0] = sc.nextInt();
        nizX[1] = sc.nextInt();
        nizX[2] = sc.nextInt();
        nizX[3] = sc.nextInt();
        nizX[4] = sc.nextInt();

        System.out.println("Prvih pet brojeva su:");
        System.out.println(nizX[0]);
        System.out.println(nizX[1]);
        System.out.println(nizX[2]);
        System.out.println(nizX[3]);
        System.out.println(nizX[4]);
        System.out.println("Svaki sledeci element bice jednak: ");
        System.out.println(nizX[5]);




    }
}
