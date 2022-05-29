/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.financialcalc;

/**
 *
 * @author Kashif Saeed
 */
public class FinancialCalc {
      double computeFinalValue(double principle, double interestRate, int numOfYears)
{
    double finalValue = 0.0;
    finalValue = principle * Math.pow((1 + interestRate), numOfYears);
    return finalValue;
}
    
    public static void main(String[] args){
        
        FinancialCalc obj = new FinancialCalc();
        System.out.println("Hence the finalValue is" + obj.computeFinalValue(50.0, 0.3, 4));
        
    }

 
}
