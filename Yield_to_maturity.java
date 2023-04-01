
/**
 *
 * @author vicen
 */
import java.util.Scanner;
class yieldY
{
    float ytm;
    public void formulaY(float C, float F, float P, float n)
    {
        ytm = (C + ((F-P)/n))/((F+P)/2);
        System.out.println("Your approx Yield to maturity is: " + ytm);
    }
}
public class Yield_to_maturity extends yieldY
{
    public static void main(String args[])
    {
        float a, b, c, d;
        Yield_to_maturity obj = new Yield_to_maturity();
        Scanner scan = new Scanner(System.in);
        System.out.println("-------------YIELD TO MATURITY--------------");
        System.out.println("Enter cupon/Interest Payment: ");
        a=scan.nextInt();
        System.out.println("Enter face value: ");
        b=scan.nextInt();
        System.out.println("Enter price: ");
        c=scan.nextInt();
        System.out.println("Year to maturity: ");
        d=scan.nextInt();
        obj.formulaY(a, b, c, d);
    }
    
}
