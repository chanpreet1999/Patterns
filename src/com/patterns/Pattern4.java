package com.patterns;

/*

*   *   *   *   *   
    *   *   *   *   
        *   *   *   
            *   *   
                *   

*/
public class Pattern4 
{
    public static void main(String[] args) 
    {
        int n = 5;
        int spaces = 0;
        int stars = n;
        for(int cr = 1; cr <= n; cr++)
        {
            for(int csp = 1; csp <= spaces; csp++)
                System.out.print("\t");
            for(int cst = 1; cst <= stars; cst++)
                System.out.print("*\t");
            
            spaces++;
            stars--;
            System.out.println();
        }
        
    }
    
    
}
