//A program to calculate the cost of various items, the applicable tax, and the final total.
//Run the program to get the results.
//
//@author Kaitlyn Hennessy
//@version 9/4/15
//
public class Arithmetic{
    public static void main (String[] args){
        //Item quantities and prices.
        int nSocks=3; //Number of pairs of socks.
        double sockCost$=2.58; //Cost per pair.
        int nGlasses=6; //Number of drinking glasses.
        double glassCost$=2.29; //Cost per glass.
        int nEnvelopes=1; //Number of boxes of envelopes.
        double envelopeCost$=3.25; //Cost per box of envelopes.
        
        double taxPercent=0.06; //Tax rate.
        
        double totSockCost=(double)nSocks*sockCost$; //Total cost for socks.
        double totGlassCost=(double)nGlasses*glassCost$; //Total cost for glasses.
        double totEnvelopeCost=(double)nEnvelopes*envelopeCost$; //Total cost for boxes of envelopes.
        
        double sockTax=totSockCost*taxPercent; //Get tax on socks
        double roundSock=(int)(sockTax*100)/100.0; //Round the tax on socks
        double glassTax=totGlassCost*taxPercent; //Get tax on glasses
        double roundGlass=(int)(glassTax*100)/100.0; //Round the tax on glasses
        double envelopeTax=totEnvelopeCost*taxPercent; //Get tax on envelopes
        double roundBox=(int)(envelopeTax*100)/100.0; //Round the tax on envelope boxes
        
        double costPreTax=totSockCost+totGlassCost+totEnvelopeCost; //Calculate the total cost.
        double taxToAdd=costPreTax*taxPercent; //Calculate how much to add in tax.
        double roundTax=(int)(taxToAdd*100)/100.0; //Round the total tax
        double finalCost=costPreTax+roundTax; //Calculate the final cost.
        double roundFinal=(int)(finalCost*100)/100.0; //Round the total 
        
        //Print desired information.
        System.out.println("Pairs of Socks");
        System.out.println("Quantity: "+nSocks);
        System.out.println("Price per unit: $"+sockCost$);
        System.out.println("Glasses");
        System.out.println("Quantity: "+nGlasses);
        System.out.println("Price per unit: $"+glassCost$);
        System.out.println("Boxes of Envelopes");
        System.out.println("Quantity: "+nEnvelopes);
        System.out.println("Price per unit: $"+envelopeCost$);
        System.out.println();
        System.out.println("Total price of socks: $"+totSockCost);
        System.out.println("Tax on socks: $"+roundSock);
        System.out.println("Total price of glases: $"+totGlassCost);
        System.out.println("Tax on glasses: $"+roundGlass);
        System.out.println("Total price of boxes of envelopes: $"+totEnvelopeCost);
        System.out.println("Tax on boxes of envelopes: $"+roundBox);
        System.out.println();
        System.out.println("Total before tax: $"+costPreTax);
        System.out.println("Tax: $"+roundTax);
        System.out.println("Total: $"+roundFinal);

    }
}