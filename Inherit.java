/**
 *
 * @author vicen
 */
import java.util.Scanner;
class calculatenumbers 
{
    int z;
    public void addnumber(int x, int y)
    {
        z = x + y;
        System.out.println("The sum of two numbers are: " + z);
    }
    public void subnumber(int x, int y)
    {
            z = x - y;
            System.out.println("The sub of two numbers are: " + z);
    }  
}
class calculatenumber1 extends calculatenumbers
{
    public void divnumber(int x, int y)
    {
    z = x/y;
    System.out.println("The div of number is: " + z);
    }
}
public class Inherit extends calculatenumber1
{
    public void multnumbers(int x, int y)
    {
        z = x * y;
        System.out.println("The mult of two numbers are: " + z);
    }
    public static void main(String args[])
    {
        int a, b;
        Inherit myobj = new Inherit();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a: ");
        a = scan.nextInt();
        System.out.println("Enter number b: ");
        b = scan.nextInt();
        myobj.addnumber(a, b);
        myobj.subnumber(a, b);
        myobj.multnumbers(a, b);
        myobj.divnumber(a, b); 
    }
}
