package com.patterns;
/*
                *   
            *   *   
        *   *   *   
    *   *   *   *   
*   *   *   *   *   
 
 */
public class Pattern3
{
    public static void main(String[] args)
    {
        int n = 5;
        int spaces = n-1;
        int stars = 1;
        for(int cr = 1; cr <= n; cr++)
        {
            for(int csp = 1; csp <= spaces; csp++)
                System.out.print("\t");
            for(int cst = 1; cst <= stars; cst++)
                System.out.print("*\t");
            stars++;
            spaces--;
            System.out.println();
        }
    }
}
