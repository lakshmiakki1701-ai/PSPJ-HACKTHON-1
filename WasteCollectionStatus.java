import java.util.Scanner;
public class WasteCollectionStatus{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Amount of waste collected in kilograms:");
        double wastecollected=sc.nextDouble();

        if(wastecollected>=100){
            System.out.print("Collection Target Achieved");
        }else{
            System.out.print("More Waste Collection Required");
        }
        sc.close();
    }
}