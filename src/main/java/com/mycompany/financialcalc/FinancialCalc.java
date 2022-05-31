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
        
    double principle = 1000.0;
    int numOfYears=7;
    double interestRate = 0.035;
    double finalValue = 0.0;
    finalValue = principle * Math.pow((1 + interestRate), numOfYears);
        FinancialCalc obj = new FinancialCalc();
        System.out.println("Hence You amount increased to "+ finalValue + "after"+
                numOfYears+ " Years");
        
    }
    public static double computeFinalVal(double principle, double interestRate, int numOfYears){
        double finalValue = principle * Math.pow((1 + interestRate), numOfYears);
        return finalValue;
    }
    public static double computeprinciple(double finalValue, double interestRate, int numOfYears){
        double principle = finalValue/Math.pow((1 + interestRate), numOfYears);
        return principle;
    }
    public static double conputeinterestRate(double principle, double finalValue, int numOfYears){
        double interestRate = (Math.pow(finalValue/principle, 1/numOfYears)) + 1;
        return interestRate;
    }
    public static double computenumOfYears(double principle, double finalValue, double interestRate){
        double numOfYears = Math.log((finalValue / principle) / Math.log(1 + interestRate));
        return numOfYears;
    }

    static void computeprinciple() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
 
}
