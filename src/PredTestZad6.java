public class PredTestZad6 {
    public static void main(String[] args) {
//Zadatak 6 - Napraviti jednocifreni niz (od 1 do 9), zatim potrebno je napraviti drugi niz
//koji ce sadrzati prva tri parna broja prvog niza
        int[] niz1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int [] nizPar = new int[3];
        int x = 0;

        for (int i = 0; i < niz1.length; i++) {
            if (niz1[i]%2 ==0) {
                nizPar[x] = niz1[i];
                x++; if (x > 2) {
                    break;
                }
            }
        }
        for (int i = 0; i < nizPar.length; i++){
            System.out.println(nizPar[i]);
        }

    }
}
