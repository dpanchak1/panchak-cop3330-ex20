/*
 *  UCF COP3330 Fall 2021 Assignment 20 Solution
 *  Copyright 2021 David Panchak
 */
package org.example;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        String output="";
        double tax=0;
        Scanner input=new Scanner(System.in);

        System.out.print("What is the order amount? ");
        double amount=input.nextDouble();
        System.out.print("What state do you live in? ");
        String state=input.next();
        System.out.print("What county do you live in? ");
        String county=input.next();

        if(state.equals("Wisconsin"))
        {
            tax+=.05;
            if(county.equals("Eau Claire"))
            {
                tax+=.005;
            }
            if(county.equals("Dunn"))
            {
                tax+=.004;
            }
        }
        if(state.equals("Illinois"))
        {
            tax+=.08;
        }
        Double taxAmount=amount*tax;

        if(tax>0)
        {
            output=output+String.format("The tax is $%.02f.%n",taxAmount);
        }
        double total=1+tax;
        total=total*amount;
        output=output+String.format("The total is $%.02f.",total);

        System.out.printf("%s",output);

    }
}
