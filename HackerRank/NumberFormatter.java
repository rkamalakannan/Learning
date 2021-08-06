import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.spi.CurrencyNameProvider;

public class Solution {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // double payment = scanner.nextDouble();
        double payment = 12324.134;
        scanner.close();

        // Write your code here.

        CurrencyNameProvider us= new CurrencyNameProvider()
        us.getAvailableCurrencies();

        
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}