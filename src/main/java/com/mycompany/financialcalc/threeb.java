/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.financialcalc;

/**
 *
 * @author Kashif Saeed
 */
public class threeb {
    public static void main(String[] args){
        double principle = 500.0;
        double finalValue = 535.0;
        int numOfYears = 3;
        double interest = FinancialCalc.conputeinterestRate(principle, finalValue, numOfYears);
        System.out.println("The interest rate you need to turn an initial investment of $500.00 into $525.00 "
                + "at the end of 3 years " + interest + "%");
    }
}
