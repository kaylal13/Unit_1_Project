import java.util.Scanner;
public class Main {
    public static void main (String [] args){
        System.out.println("When entering values, do NOT include $ or % sign!");
        System.out.println("-------------------");
        Scanner scan = new Scanner (System.in);
        System.out.println("Your bill: ");
        Double totalBill = (double) scan.nextDouble();

        System.out.println("Tip percent: ");
        int percentage = scan.nextInt();

        System.out.println("Amount of people in party: ");
        int partyAmount = scan.nextInt();
        System.out.println("-------------------");

        double totalTip = totalBill*(double)(percentage/100);
        System.out.println("Your total tip is: "+totalTip);

    }
}
