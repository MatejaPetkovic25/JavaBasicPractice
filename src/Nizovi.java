public class Nizovi {
    public static void main(String[] args) {

        System.out.println("Pocetak programa");

        //int[] mojNiz; // Deklaracija niza
        //mojNiz ={1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; // Inicijalizacija niza

        int[] Niz1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; // Mora u jednom redu da se izvrsi

        System.out.println("Prvi element je: " + Niz1[0]);
        System.out.println("Drugi element je: " + Niz1[1]);
        System.out.println("Treci element je: " + Niz1[2]);
        System.out.println("Cetvrti element je: " + Niz1[3]);
        // ...
        System.out.println("Poslednji element je: " + Niz1[9]);
        // Out of bounds
        //System.out.println("Pokusaj: " + Niz1[10]);


        //int x; x == 0 po default-u
        //String s; s == null po default-u
        //boolean b; b == false po default-u

        //Sada drugi nacin da se napravi niz

        int[] Niz2 = new int[10];
        System.out.println("Duzina niza 2 je :" + Niz2.length );
        System.out.println("Prvi element niza 2 je: " + Niz2[0]);
        Niz2[0] = 100; // Ovako se dodeljuje vrednost
        System.out.println("Prvi element niza 2 je: " + Niz2[0]);
        Niz2[1] = 200; // Drugi element u nizu 2 postaje dvesta



    }
}
