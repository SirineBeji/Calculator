package Calcuator.Calcuator;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
    	Calculator calculator = new Calculator();

        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        
        System.out.println(calculator.add(a,b));
    }
}
