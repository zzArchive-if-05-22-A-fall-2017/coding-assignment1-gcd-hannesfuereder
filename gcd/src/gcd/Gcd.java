/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gcd;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Hannes
 */
public class Gcd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int num1 = 24;
        int num2 =16;
        int result = gcdEucledian(num1, num2);
        System.out.println("Result: " + result);
        int result2 = gcdPrimeFactors(num1,num2);
        System.out.println("Result: " + result2);
        
        num1 = 25;
        num2 =15;
        result = gcdEucledian(num1, num2);
        System.out.println("Result: " + result);
        result2 = gcdPrimeFactors(num1,num2);
        System.out.println("Result: " + result2);
        
         num1 = 99;
        num2 =66;
        result = gcdEucledian(num1, num2);
        System.out.println("Result: " + result);
        result2 = gcdPrimeFactors(num1,num2);
        System.out.println("Result: " + result2);
    }
    
     static int gcdEucledian(int a, int b){
        if(b == 0)
        {
            return a;
        }
        else
        {
            int val = (int)a / b;
            int newB =  a-val*b;
            return gcdEucledian(b,newB);
        }
    }
    static int gcdPrimeFactors(int a, int b){
        
        List<Integer> fOfA = factors(a);
        List<Integer> fOfB = factors(b);
        int y = 0;
        int result = 1;
        while(y < fOfA.size())
        {
            if(fOfB.contains(fOfA.get(y)))
            {
                    result*= fOfA.get(y);
                    fOfB.remove(fOfA.get(y));
                    fOfA.remove(fOfA.get(y));
            }
            else
            {
                y++;
            }
        }

        return result;
    }
    static List<Integer> factors(int a)
    {
        List<Integer> list = new ArrayList <Integer>();
        while(a != 1)
        {
            Boolean ok = false;
            int i = 2;
            while(ok != true)
            {
                if(a%i== 0)
                {
                    ok = true;
                    list.add(i);
                    
                }
                else
                {
                    i++;
                }
            }
            a /= i;
        }
        
        
        return list;
    }
}
