import java.util.Scanner;

public class VezbaPetlje {
    public static void main(String[] args) {
        //FizzBuzz:
        //Napisati program koji za brojeve od 1 do 100 racuna sledece:
        //ako je broj deljiv sa 3 i sa 5 ispisuje "fizzbuzz" (plus ispisuje taj broj)
        //ako je broj deliv sa 3 ispisuje "fizz" (plus ispisuje taj broj)
        //ako je broj deljiv sa 5 izpisuje "buzz" (plus ispisuje taj broj)

        Scanner sc = new Scanner(System.in);
        System.out.print("Unesi broj do kojeg zelis da proveris deljivost brojeva sa 3 i sa 5: ");
        int[] nizA = new int[sc.nextInt()];
        for (int i = 1; i <= nizA.length; i++) {

            if(i%3 == 0 && i%5== 0) {
                System.out.println(i + " fizzbuzz");
            }
            else if (i%3 == 0) {
                System.out.println(i + " fizz");
            } else if (i%5 == 0) {
                System.out.println(i + " buzz");
            }

        }



    }
}
