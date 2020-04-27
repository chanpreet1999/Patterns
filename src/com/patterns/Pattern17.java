package com.patterns;

/*
 
     * 
    * * 
* * * * * 
    * * 
    * 

CONSTRAINT - n is odd

 */

public class Pattern17 
{
    public static void main(String[] args) 
    {
        int n = 5;
        int stars = 1;
        int spaces = n/2;
        for(int cr = 1; cr <= n; cr++)
        {
            if(cr == n/2 +1)
            {
                for(int cst = 1; cst <= n; cst++)
                    System.out.print("* ");
            }
            else
            {
                for(int csp  = 1; csp <= spaces; csp++)
                    System.out.print("  ");
                for(int cst = 1; cst <= stars; cst++)
                    System.out.print("* ");
            }
            
            if(cr <= n/2 )
                stars++;
            else
                stars--;
            System.out.println();
        }
    }

}
