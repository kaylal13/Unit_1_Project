import java.util.Scanner;
public class Main {
    public static void main (String [] args){
        System.out.println("When entering values, do NOT include $ or % sign!");
        System.out.println("-------------------");
        Scanner scan = new Scanner (System.in);
        System.out.println("Your bill: ");
        double totalBill = scan.nextDouble();
        int newBill = (int)(totalBill*100);


        System.out.println("Tip percent: ");
        double percentage = scan.nextInt();


        System.out.println("Amount of people in party: ");
        int partyAmount = scan.nextInt();
        System.out.println("-------------------");


        double totalTip =(int)((newBill*percentage)/100);
        double newTotalTip = totalTip/100;
        String formattedTotalTip = String.format ("%.2f", newTotalTip);
        System.out.println("Your total tip is: $"+formattedTotalTip);


        double tipPerPerson = (int)(totalTip/partyAmount);
        double newTip = tipPerPerson/100;
        System.out.println("For tips, each person pays: $"+newTip);


        double totalAmount= totalBill+newTotalTip;
        System.out.println("The total amount (bill and tips) is: $"+totalAmount);


        double totalPerPerson = (int)((totalAmount/partyAmount)*100);
        double newTotal = totalPerPerson/100;
        System.out.println("In total each person pays: $"+newTotal);




    }
}
