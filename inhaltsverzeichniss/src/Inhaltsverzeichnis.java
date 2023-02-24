import java.util.Scanner;
public class Inhaltsverzeichnis {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        System.out.println("Gig Wort 1 ein");
        String wort1 = myScanner.next();
        System.out.println(" Gib Wort 2 ein");
        String wort2 = myScanner.next();
        int wort1Lang = wort1.length();
        int wort2Lang = wort2.length();
        int numPunkte = 30 - wort1Lang -wort2Lang;
        String punkte = "";
        for (int i =0;i<numPunkte;i++){
            punkte =punkte+".";
        }
        System.out.println(wort1+punkte+wort2);
    }
}