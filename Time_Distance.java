
/**
 *
 * @author vicen
 */
import java.util.Scanner;
class converter
{
    float time;
    float conv_speed;
    public void kmhrTOms(float speed)
    {
        conv_speed = ((speed * 1000)/(60 * 60));
    }
    
    public void distance_time(float distance)
    {
        time = distance / conv_speed;
        System.out.println("It will take you " + time + " seconds(s) to get there.");
    }
}

public class Time_Distance extends converter
{
    public static void main(String args[])
    {
        float a, b;
        Time_Distance mobj = new Time_Distance();
        Scanner scan = new Scanner(System.in);
        System.out.println("-------------TIME CALCULATOR--------------");
        System.out.println("Enter distance you have to move in meters (m): ");
        a=scan.nextInt();
        System.out.println("Enter speed you are moving it has to be in km/hr: ");
        b=scan.nextInt();
        mobj.kmhrTOms(b);
        mobj.distance_time(a); 
    }
    
}
