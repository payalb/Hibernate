package com.java;

import java.util.Scanner;

public class Bank
{

       double rate;
    // n = number of years
    public  double calculateInterest( double PrincipalAmount, double n)
    {
        double interest;
        interest = (PrincipalAmount * n*rate) /100; // interest formula
        return  interest;
    }
    public static void main(String[] args)
    {

        Scanner s1 = new Scanner(System.in);
        System.out.print("Enter PrincipalAmount :" );
        double PrincipalAmount = s1.nextDouble();

        Scanner s2 = new Scanner(System.in);
        System.out.print("Enter Number of Years :" );
        double n = s2.nextDouble();

        ICICI ic;
        ic = new ICICI();// new object created of ICICI Class
        System.out.println(ic.rate);
     //   rate= ic.rate;
      //  ic.rate = rate; // object call by reference
     System.out.print("Interest of ICICI is " +  ic.calculateInterest( PrincipalAmount,n));
    }
}

 class ICICI extends Bank
{
    double rate = 4;
 }