public class NizoviPetlje {
    public static void main(String[] args) {

        int[] nizA = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        int brojac = 0; //Uglavnom ce se zvati i ili j...
        while(brojac < nizA.length) {               // nizA.length je 10 u ovom slucaju
            System.out.println(nizA[brojac]);
            brojac++; // brojac = brojac + 1; - Brojac postaje brojac plus 1
        }

        // Za for sledi ovako:
        /*
        int i = 0;
        for (int i = 0; i < nizA.length; i++) {
                  sout (nizA[i])

        }
         */

    }
}
