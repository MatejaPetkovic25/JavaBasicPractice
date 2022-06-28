public class NizoviZadatak2 {
    public static void main(String[] args) {
//Zadatak2: Napisati program koji racuna  aritmeticku sumu svih elemenata niza,
// od prvog elementa niza do n gde je n poslednji element niza ...
// u prevodu niz[0] + niz[1} + niz[2] + ... + niz[n]

        //napisati program koji prvo samo stampa elemente niza
        //onda smisliti kako da racunamo sumu

         int [] nizZ = {10, 23, 50, 67, 30, 20};

        /* int i = 0;
        int suma = 0;
        for(i = 0; i < 6; i++) {

            suma = suma + nizZ[i];

            System.out.println(suma);

        }
        */

        int i = 0;
        int suma = 0;
        while (i < nizZ.length) {

            suma = suma + nizZ[i];
            System.out.println(suma);
            i++;
        }

    }
}
