/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.financialcalc;

/**
 *
 * @author Kashif Saeed
 */
public class threea {
    public static void main(String[] args){
        double finalValue = 100.0;
        double interestRate = 0.5 ;
        int numOfYears = 4;
        double principle = FinancialCalc.computeprinciple(finalValue, interestRate, numOfYears);
        System.out.println("The amount of money you should invest today (at an interest rate of 5%)"
                + " to have a total amount of $1000.00 at the end of 4 years " + principle);
    }
}
