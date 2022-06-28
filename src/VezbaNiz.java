import java.util.Scanner;

public class VezbaNiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nizDef = {65, 34, 12, 98, 10, 6, 7, 12, 3, 79};

        int suma1 = 0;
        for (int i1 = 0; i1 < 10; i1++) {
            System.out.println(i1 + ". element niza je broj: " + nizDef[i1]);
            suma1 = suma1 + nizDef[i1];
        }
        System.out.println("Zbir svih brojeva u navedenom nizu je: " + suma1);
        System.out.println("------------------------------------");
        System.out.println("Drugi niz je niz Stringova");
        System.out.print("Unesite broj elemenata u vasem nizu: ");
        String [] nizNedef = new String[sc.nextInt()];
        System.out.println("Broj elemenata u Vasem nizu ce biti " + nizNedef.length);

        for (int i = 0; i < nizDef.length ; i++) {
            System.out.println("Unesite ime: ");
            nizNedef[i] = sc.next();

            if (nizNedef[i].equals("Mateja") || nizNedef[i].equals("Helena")) {
                System.out.println("Jako lepo ime.");
            }
            System.out.println(nizNedef[i] + " je upisano.");
        }
        System.out.println("Kraj.");

    }
}
