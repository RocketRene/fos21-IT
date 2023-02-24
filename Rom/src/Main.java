import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        Scanner myScanner= new Scanner(System.in);
        System.out.println("Gib Zahl 1 ein:");

        String zahl1 = (myScanner.next());
        System.out.println("Gib Zahl 2 ein:");

        String zahl2 = (myScanner.next());

        int ergebnis1 = getInt(zahl1);
        int ergebnis2 = getInt(zahl2);
        int Summe = ergebnis2+ergebnis1;
        System.out.println(ergebnis1+" + "+ergebnis2+ " = "+Summe);

    }
    public static int getInt(String zahl){
        int sum =0;
        for (int i = 0; i < zahl.length(); i++){
            char c = zahl.charAt(i);

            switch (c){
                case 'I': sum=sum+1;break;
                case 'V': sum=sum+5;break;
                case 'X': sum=sum+10;break;
                case 'L': sum=sum+50;break;
                case 'C': sum=sum+100;break;
                case 'D': sum=sum+500;break;
                case 'M': sum=sum+1000;break;

            }


        }
        return sum;
    }
}