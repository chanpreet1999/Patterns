package com.patterns;

/*

     *
   *
  *
 *
*

 */

public class Pattern8 
{

    public static void main(String[] args) 
    {
        int n = 5;
        int spaces = n-1;
        for(int cr = 1; cr <= n; cr++)
        {
            for(int csp = 1; csp <= spaces; csp++)
                System.out.print(" ");
            System.out.print("*");
            
            spaces--;
            System.out.println();
        }
    }

}
