import java.util.Scanner;

public class forecast 
{
    public static double calculatefuturevalue(double initialamount , double growthrate , int years)
{
    if ( years == 0) 
    {
        return initialamount;
    }
    else {
        return calculatefuturevalue ( initialamount ,growthrate , years - 1 ) * (1 + growthrate);
    }

}
    public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
    System.out.print("The initial amount: ");
    double initialamount = scan.nextDouble();
    System.out.print("The growthrate: ");
    double growthrate = scan.nextDouble();
    System.out.print("The years: ");
    int years = scan.nextInt();
   
    double futurevalue = calculatefuturevalue(initialamount , growthrate , years);
    System.out.printf("The forecast value after %d years is %.2f", years , futurevalue );
}
}


