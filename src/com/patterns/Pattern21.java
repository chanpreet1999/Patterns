package com.patterns;

/*

A B C D E E D C B A 
  A B C D D C B A 
    A B C C B A 
      A B B A 
        A A 

 */

public class Pattern21 
{
    public static void main(String[] args) 
    {
        int n = 5;
        int stars = n;
        int spaces = 0;
        char ch = 'A';
        for(int cr = 1; cr <= n; cr++)
        {
            for(int csp = 1; csp <= spaces; csp++)
                System.out.print("  ");
            for(int cst1 = 1; cst1 <= stars; cst1++)
            {
                System.out.print(ch + " ");
                ch++;
            }
            for(int cst2 = 1; cst2 <= stars; cst2++)
            {
                ch--;
                System.out.print(ch + " ");
            }
            
            spaces++;
            stars--;
            System.out.println();
        }
    }
    
}
