/*KgVggT.java
        Berechnen Sie aus zwei eingegebenen Ganzen Zahlen das kgV (kleinste gemeinsame
        Vielfache) und den ggT (größten gemeinsame Teiler).
        Kleinste gemeinsame Vielfache und größte gemeinsame Teiler
        Geben Sie zwei ganze Zahlen ein: 14 21
        kgV: 42
        ggT: 7*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        System.out.println("Gig Zahl 1 ein:");
        int zahl1 = Integer.parseInt(myScanner.next());
        System.out.println("Gib Zahl 2 ein:");
        int zahl2 = Integer.parseInt(myScanner.next());
        int ggT=0;
        for (int i=1000;i > 1;i--)
            if (zahl1%i==0 && zahl2%i==0){
                ggT =i;
                break;
            }
        System.out.println("Der kleinste Teiler ist "+ggT);
        int eingabe2 = zahl2;
        int i = zahl1 * zahl2;
        for (int eingabe1=zahl1;zahl1<i;zahl1=zahl1+eingabe1){

            for (zahl2=eingabe2;zahl2<i;zahl2=zahl2+eingabe2){
                if (zahl1==zahl2){


                    System.out.println("KGV = "+zahl1);
                    System.exit(0);

                }

            }
        }



    }
}




