public class PredTestZad5 {
    public static void main(String[] args) {
        //Zadatak 5 - Napraviti dva niza i prikazati koji niz ima vise clanova, a koji niz ima vecu sumu

        int[] nizA = {1, 5, 7, 9, 10, 12, 13, 42, 4, 7, 11};
        int[] nizB = {100, 250, 120, 430, 253};
        int sumaA = 0;
        int sumaB = 0;

        for (int i = 0; i < nizA.length; i++) {

            sumaA = sumaA + nizA[i];
        }

        for (int j = 0; j < nizB.length; j++) {
            sumaB = sumaB + nizB[j];
        }

        if (nizA.length > nizB.length) {
            System.out.println("Niz koji ima vise clanova je prvi niz" );
        } else if (nizA.length < nizB.length) {
            System.out.println("Niz koji ima vise clanova je drugi niz" );
        } else {
            System.out.println("Nizovi su jednaki po broju clanova.");
        }

        System.out.println("----------------------");


        if (sumaA > sumaB) {
            System.out.println("Vecu sumu ima prvi niz.");
        } else if (sumaA < sumaB) {
            System.out.println("Vecu sumu ima drugi niz.");
        } else {
            System.out.println("Suma je jednaka.");
        }


    }
}
