public class PredTestZad7 {
    public static void main(String[] args) {
//Zadatak 7 - Napraviti niz i prikazati njegov najveci i najmanji clan

        int[] niz = {12, 50, 34, 20, 7 ,23, 16, 54, 13};

        int broj = niz[0];
        for (int i = 0; i < niz.length; i++) {
            if (broj < niz[i]) {
                broj = niz[i];
            }

        }
        System.out.println("Najveci broj u nizu je " + broj);
        for (int i = 0; i < niz.length; i++) {
            if (broj > niz[i]) {
                broj = niz[i];
            }

        }

        System.out.println("Najmanji broj u nizu je " + broj);
    }
}
