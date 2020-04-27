package com.patterns;
/*
 
* * *   * * * 
* *       * * 
*           * 
* *       * * 
* * *   * * * 
    
CONSTRAINT - n is odd
  
*/
public class Pattern6 
{

    public static void main(String[] args)
    {
       int n = 5;
       int stars = n-2;
       int spaces = 1;
       for(int cr = 1; cr <= n; cr++)
       {
           for(int cst = 1; cst <= stars; cst++)
               System.out.print("* ");
          
           for(int csp = 1; csp <= spaces; csp++)
               System.out.print("  ");
           
           for(int cst = 1; cst <= stars; cst++)
               System.out.print("* ");
          
           if(cr <= n/2)
           {
               spaces+= 2;
               stars = stars-1;
           }
           else
           {
               spaces-= 2;
               stars = stars+1;
           }
           System.out.println();
       }
    }

}
