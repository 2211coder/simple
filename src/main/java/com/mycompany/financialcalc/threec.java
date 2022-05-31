/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.financialcalc;

/**
 *
 * @author Kashif Saeed
 */
public class threec {
    public static void main(String[] args){
        double principle = 100.00;
        double finalValue = 150.00;
        double interestRate = 0.44;
        
        int numOfYears = (int) FinancialCalc.computenumOfYears(principle, finalValue, interestRate);
        System.out.println("The number of years you need to invest an initial sum of $100.00 at an interest rate"
                + " of 4.4% to have a final value of $150.00 in " + numOfYears +" Year") ;
    }
}
