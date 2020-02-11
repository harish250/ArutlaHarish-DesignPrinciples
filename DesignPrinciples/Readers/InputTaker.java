package DesignPrinciples.Readers;
import DesignPrinciples.*;

import java.util.*;
public class InputTaker
{
    static Scanner sc;

    public InputTaker() {
        sc = new Scanner(System.in);
    }

    static int readNumber1() {
        return sc.nextInt();
    }
    
    static int readNumber2() {
        return sc.nextInt();
    }
   public void takeInput()
   {
    int number1=0;
    int number2=0;
    int choice=0;
    
    while(true)
    {
        System.out.println("1 -- Add operation (+)");
        System.out.println("2 -- Substract operation (-)");
        System.out.println("3 -- Multiplication operation (*)");
        System.out.println("4 -- Division operation (/)");
        System.out.println("5 -- Modulo Operation (%)");
        System.out.println("6 -- Exit ");
        System.out.println("Enter your choice");
        choice=sc.nextInt();
                
        switch(choice)
        {
            case 1:
            System.out.println("Enter the first number ");
            number1 =readNumber1();    
            System.out.println("Enter the second number");
            number2=readNumber2();
            Add add = new Add(); 
            add.compute(number1, number2);
            break;
            case 2:
            System.out.println("Enter the first number ");
            number1 =readNumber1();    
            System.out.println("Enter the second number");
            number2=readNumber2();
            Substract substract = new Substract();
            substract.compute(number1, number2);
            break;
            case 3:
            System.out.println("Enter the first number ");
            number1 =readNumber1();    
            System.out.println("Enter the second number");
            number2=readNumber2();
            Multiplication multiplication = new Multiplication();
            multiplication.compute(number1, number2);
            break;
            case 4:
            System.out.println("Enter the first number ");
            number1 =readNumber1();    
            System.out.println("Enter the second number");
            number2=readNumber2();
            Division division = new Division();
            division.compute(number1, number2);
            break;
            case 5:
            System.out.println("Enter the first number ");
            number1 =readNumber1();    
            System.out.println("Enter the second number");
            number2=readNumber2();
            Modulo modulo = new Modulo();
            modulo.compute(number1,number2);
            break;
            case 6:
            System.out.println("Exiting....");
            System.exit(0);
            break;
            default:
            System.out.println("Enter your choice please ");
            break;
                
        }

        
    }
   }



}