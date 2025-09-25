import java.util.Scanner;
public class Main {
    public static void main (String [] args){
        System.out.println("When entering values, do NOT include $ or % sign!");
        System.out.println("-------------------");
        Scanner scan = new Scanner (System.in);
        System.out.println("Your bill: ");
        double totalBill = scan.nextDouble();

        System.out.println("Tip percent: ");
        double percentage = scan.nextInt();

        System.out.println("Amount of people in party: ");
        int partyAmount = scan.nextInt();
        System.out.println("-------------------");

        double totalTip = totalBill*(percentage/100);
        System.out.println("Your total tip is: "+totalTip);

        double tipPerPerson = totalTip/partyAmount;
        System.out.println("For tips, each person pays: "+tipPerPerson);

        double totalAmount= totalBill+totalTip;
        System.out.println("The total amount (bill and tips) is: "+totalAmount);

        double totalPerPerson = tipPerPerson+totalAmount/partyAmount;
        System.out.println("In total each person pays: "+totalPerPerson);


    }
}
