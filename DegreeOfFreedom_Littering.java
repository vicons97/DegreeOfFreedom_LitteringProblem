/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.abd_oop;

/**
 *
 * @author vicen
 */
import java.util.Scanner;
public class DegreeOfFreedom_Littering {
    
    public void calc_littering(float males_trash,float females_trash,float litters,float deposits) 
    {
        float total = males_trash + females_trash;
        float males_who_litter, females_who_litter;
        
        males_who_litter = (males_trash/total) * ((litters/total*100));
        females_who_litter = (females_trash/total) * ((litters/total*100));
        System.out.println("Total littering of males: " + males_who_litter);
        System.out.println("Total littering of females" + females_who_litter);  
    }
    public static void main(String args[])
    {
            float T_male, T_female, T_deposits, T_litter;
            
            DegreeOfFreedom_Littering obj = new DegreeOfFreedom_Littering();
            Scanner scan =  new Scanner(System.in);
            
            System.out.println("Enter the total of males: ");
            T_male = scan.nextInt();
            System.out.println("Enter the total of females: ");
            T_female = scan.nextInt();
            System.out.println("Enter the total of deposits: ");
            T_deposits = scan.nextInt();
            System.out.println("Enter the total of litters: ");
            T_litter = scan.nextInt();
            
            obj.calc_littering(T_litter, T_female, T_litter, T_deposits);
    }
}
