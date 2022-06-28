public class DrugiCasZadatak3 {
    public static void main(String[] args) {
//Zadatak 3 - Prikazati sve dvocifrene brojeve deljive sa 3 - Koristiti FOR

        for (int i = 10; i < 100; i++) {

            if (i%3 == 0) {
                System.out.println(i);
            }

        }
        // Isti zadatak preko While funkcije
        /* int i = 10;

        while (i < 100) {
            if(i%3 == 0) {
                System.out.println(i);
            }
            i++;

        }
        */

        // Isti zadatak preko do while funkcije

       /* int i = 10;
        do {
            if(i%3 == 0) {
                System.out.println(i);
            }

            i++;
        } while (i < 100);
        */
    }
}
