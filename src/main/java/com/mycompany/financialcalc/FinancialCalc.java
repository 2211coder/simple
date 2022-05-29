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
    public static void main(String[] args){
        double principle=30000.0;
        
        double interestRate = 0.035;
        int numOfYears = 7;
        
        double finalValue = 0.0;
        finalValue = principle * Math.pow((1 + interestRate), numOfYears);
        System.out.println("Investing $"
                + principle + "\n At an inetersr rate of " +
                (interestRate*100) + "$" + "\n For "+ numOfYears + " Years "+
                "\n Will have a final worth of "+ finalValue);
        
    }
}
