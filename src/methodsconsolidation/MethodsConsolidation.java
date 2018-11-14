/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package methodsconsolidation;
import java.util.Scanner;
/**
 *
 * @author camac2045
 */

public class MethodsConsolidation {
    
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        int choice;        
        Scanner keyedInput = new Scanner(System.in); //scanner declared
        System.out.println("Callum's Currency Converter\nWhat currency would you like to convert to canadian?\n1 = United States Dollar\n2 = Euro\n3 = British Pound\n4 = Russian Ruble\n5 = Bitcoin\nOther Keys Cloe The Program");
        choice = keyedInput.nextInt();
        if (choice == 1){
            USD();
        }
        else if (choice == 2){
            euro();
        }
        else if (choice == 3){
            pound();
        }
        else if (choice == 4){
            ruble();
        }
        else if (choice == 5){
            bitcoin();
        }
        else{
            System.exit(0);
        }
    }
    
    public static double USD(){
        int input;
        double usd;
        final double USD = 0.75551;
        Scanner keyedInput = new Scanner(System.in); //scanner declared
        System.out.println("Inpout the amount USD you would like converted:");
        input = keyedInput.nextInt();
        usd = input*USD;
        System.out.println("You have "+(usd)+"$CAD");
        return usd;
    }
    public static double euro(){
        int input;
        double euro;
        final double EURO = 0.67107;
        Scanner keyedInput = new Scanner(System.in); //scanner declared
        System.out.println("Inpout the amount EUR you would like converted:");
        input = keyedInput.nextInt();
        euro = input*EURO;
        System.out.println("You have "+(euro)+"$CAD");
        return euro;
    }
    public static double pound(){
        int input;
        double pound;
        final double POUND = 0.58435;
        Scanner keyedInput = new Scanner(System.in); //scanner declared
        System.out.println("Inpout the amount GBP you would like converted:");
        input = keyedInput.nextInt();
        pound = input*POUND;
        System.out.println("You have "+pound+"$CAD");
        return pound;
    }
    public static double ruble(){
        int input;
        double ruble;
        final double RUBLE = 51.2320;
        Scanner keyedInput = new Scanner(System.in); //scanner declared
        System.out.println("Inpout the amount RUB you would like converted:");
        input = keyedInput.nextInt();
        ruble = input*RUBLE;
        System.out.println("You have "+(ruble)+"$CAD");
        return ruble;
    }
    public static double bitcoin(){
        int input;
        double bitcoin;
        final double BITCOIN = 0.00012;
        Scanner keyedInput = new Scanner(System.in); //scanner declared
        System.out.println("Inpout the amount BTC you would like converted:");
        input = keyedInput.nextInt();
        bitcoin = input*BITCOIN;
        System.out.println("You have "+(bitcoin)+"$CAD");
        return bitcoin;
    }
    
}
