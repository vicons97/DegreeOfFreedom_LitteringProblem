/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOP_Programs;

/**
 *
 * @author vicen
 */
import java.util.Scanner;

class Km_Liters_Calculator
{
    int km_Liters;
    public void Gas_km(int starting_km, int finishing_km, int gas_used)
    {
            km_Liters = ((finishing_km - starting_km)/gas_used);
            System.out.println("The kilometers per liters is: " + km_Liters + "km/L");
    }
}
class Km_Price_Calculator extends Km_Liters_Calculator
{
    int Km_Price;
    public void Km_Price(int starting_km, int finishing_km, int gas_used, int gas_price)
    {
        Km_Price = ((finishing_km - starting_km)/gas_used)/gas_price;
        System.out.println("The kilometers per dolar is: " + Km_Price + "Km/$");
    }
}

public class Gas_Mileage_Calculator extends Km_Price_Calculator
{
    
    public static void main(String args[])
    {
        int start, finish, gas, price;
        Gas_Mileage_Calculator gascalc = new Gas_Mileage_Calculator();
        Scanner scan = new Scanner(System.in);
        System.out.println("-------------GAS MILEAGE CALCULATOR--------------");
        System.out.println("Enter the starting km: ");
        start = scan.nextInt();
        System.out.println("Enter the finishing km: ");
        finish = scan.nextInt();
        System.out.println("Enter used gas in Liters: ");
        gas = scan.nextInt();
        System.out.println("Enter price gas per Liter: ");
        price = scan.nextInt();
        gascalc.Gas_km(start, finish, gas);
        gascalc.Km_Price(start, finish, gas, price);
    }
}
