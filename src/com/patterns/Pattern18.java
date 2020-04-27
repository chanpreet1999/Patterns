package com.patterns;

/*
 
 * * * * * * * 
  *       * 
    *   * 
      * 
    * * * 
  * * * * * 
* * * * * * * 

CONSTRAINT - n is odd
 */

public class Pattern18 
{
    public static void main(String[] args) 
    {
        int n = 7;
        int stars = n;
        int spaces = 0;
        for(int cr = 1; cr <= n; cr++)
        {
            for(int csp = 1; csp <= spaces; csp++)
                System.out.print("  ");
            
            for(int cst = 1; cst <= stars; cst++)
            {
                if(cr == 1 || cr >= n/2+1 || cst == 1 || cst == stars)
                System.out.print("* ");
                else
                    System.out.print("  ");
            }
            if(cr <= n/2)
            {
                spaces++;
                stars -=2;
            }
            else
            {
                spaces--;
                stars +=2;
            }
            System.out.println();
        }
    }

}
