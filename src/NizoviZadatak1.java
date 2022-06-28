public class NizoviZadatak1 {
    public static void main(String[] args) {

        //Inicijalizovati niz tipa String sa 2 vrednosti, imenom i prezimenom
        //Isprintamo vrednost imena i prezimena
        //Izmeniti prezime osobe
        //Opet isprintamo ime i prezime da vidimo rezultat

        /*String[] niz1 = new String[2];
        niz1[0] = "Petar Petrovic ";
        niz1[1] = "Marina Marinkovic";

        System.out.println(niz1[0]);
        System.out.println(niz1[1]);

        niz1[1] = "Marina Petrovic";
        System.out.println(niz1[1]);*/

        String[] niz2 = {"Petar ", "Petrovic", "Marina ", "Marinkovic"};
        System.out.print(niz2[0]);
        System.out.println(niz2[1]);
        System.out.print(niz2[2]);
        System.out.println(niz2[3]);

        niz2[3] = "Petrovic";

        System.out.print(niz2[0]);
        System.out.println(niz2[1]);
        System.out.print(niz2[2]);
        System.out.println(niz2[3]);




    }
}
