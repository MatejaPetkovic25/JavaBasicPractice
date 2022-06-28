public class PredTestZad8 {
    public static void main(String[] args) {
//Zadatak 8 - Napisati niz od 10 brojeva koji ce se sabirati do 100, kada predje 100 treba ispisati za koliko je presao
        //Na primer ako imamo niz 80, 10, 9, 3, 5, 7, 22, 90, 8
        //Treba da nam ispise 80, 10, 9, 3 i onda poruka "Presli ste granicu za 2"
        int[] niz = {12, 30, 40, 8, 9, 8, 9, 12, 5, 24};
        int suma = 0;

        for (int i = 0; i < niz.length; i++) {
            suma = suma + niz[i];
            System.out.println(niz[i]);
            if (suma > 100) {
                System.out.println("Presli ste granicu za " + (suma - 100));
                break;
            }
        }

    }
}
