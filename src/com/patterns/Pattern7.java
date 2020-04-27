package com.patterns;

/*
     
*
  *
    *
      *
        *

 */

public class Pattern7 
{
    public static void main(String[] args)
    {
        int n= 5;
        int spaces = 0;
        for(int cr = 1; cr <= n; cr++)
        {
            for(int csp = 1; csp <= spaces; csp++)
                System.out.print("  ");
            System.out.print("*");
            spaces++;
            System.out.println();
        }
    }

}
