import java.util.Scanner;
public class WasteCalculator{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter waste collected at collection point 1:");
        double point1=sc.nextDouble();
        System.out.println("enter waste collected at collection point 2:");
        double point2=sc.nextDouble();
        double totalWaste = calculateTotalWaste(point1, point2);
        System.out.println("The total waste collected from both points is: " + totalWaste);
        sc.close();
    }
    public static double calculateTotalWaste(double point1waste,double point2waste){
        return point1waste+point2waste;
    }
}