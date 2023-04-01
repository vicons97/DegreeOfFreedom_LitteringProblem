
/**
 *
 * @author vicen
 */
import java.util.Scanner;
import java.lang.Math;

class interest
{
    float sim;
    double comp;
    public void simple(float P, float rate, float time)
    {
        sim = (P * rate * time) * 100;
        System.out.println("The simple rate is: " + sim);
    }
    public void compound(double PA, double r, double n, double t)
    {
        comp = PA*Math.pow((1+(r/n)),(n*t));
        System.out.println("The compund rate is: " + comp);
        
    }
}

public class Interest_Rates extends interest
{
    public static void main(String args[])
    {
        int a, b, c;
        double d, e, f, g;
        Interest_Rates obj = new Interest_Rates();
        Scanner scan = new Scanner(System.in);
        System.out.println("-------------SIMPLE INTEREST--------------");
        System.out.println("Enter loan: ");
        a=scan.nextInt();
        System.out.println("Enter rate: ");
        b=scan.nextInt();
        System.out.println("Enter time: ");
        c=scan.nextInt();
        System.out.println("-------------COMPOUND INTEREST--------------");
        System.out.println("Enter The principal amount (initial investment or loan amount): ");
        d=scan.nextInt();
        System.out.println("Enter The annual interest rate (as a decimal): ");
        e=scan.nextInt();
        System.out.println("Enter The number of times interest is compounded per year: ");
        f=scan.nextInt();
        System.out.println("Enter The time period (in years): ");
        g=scan.nextInt();
        obj.simple(a, b, c);
        obj.compound(d, e, f, g);
    }
    
}
