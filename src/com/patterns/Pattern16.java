package com.patterns;
/*
 
1               1 
1 2           2 1 
1 2 3       3 2 1 
1 2 3 4   4 3 2 1 
1 2 3 4 5 4 3 2 1 
 
 */


public class Pattern16 
{

    public static void main(String[] args) 
    {
        int n = 5;
        int stars = 1;
        int spaces = 2*n -3;
        int count = 1;
        for(int cr = 1; cr <= n; cr++)
        {
            count = 1;
            for(int cst = 1; cst <= stars; cst++)
            {
                System.out.print(count + " ");
                count++;
            }
            
            for(int csp = 1; csp <= spaces; csp++)
                System.out.print("  ");
            
            count--;
            if(cr == n)
            {
                stars--;
                count--;
            }
            for(int cst = 1; cst <= stars; cst++)
            {
                System.out.print(count + " ");
                count--;
            }
            stars++;
            spaces -= 2;
            System.out.println();
        }
    }

}
