/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.inputnumber;
import java.util.Scanner;
import java.util.InputMismatchException;

/**
 *
 * @author PC
 */
public class InputNumber {

    
    public static void main(String[] args) 
    {
        boolean run = true;
        Scanner InputNunber = new Scanner(System.in);
        while (run) 
        {            
            try 
            {
                System.out.println("Enter Number");
                int Input = InputNunber.nextInt();
                System.out.println(Input);
                
                
            } catch (InputMismatchException  e) 
            {
                System.out.println("Please enter a number.");
                System.out.println("END");
                run = false;
            }
            finally 
            {
                System.out.println("____________________________");
            }
        }
    }
}
