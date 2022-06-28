public class PredTestZad1 {
    public static void main(String[] args) {
        //Zadatak 1) Napraviti niz koji ce sadrzati nazive gradove i treba odstampati sve gradove osim grada "Prag"

        String[] gradovi = {"Berlin", "Budimpesta", "Bec", "Sofija", "Prag", "Istanbul"};
        for(int i = 0; i < gradovi.length; i++) {
            if (!gradovi[i].equals("Prag")) {
                System.out.println(gradovi[i]);
            }
        }

    }
}
