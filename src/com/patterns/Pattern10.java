package com.patterns;
/*
 
    * 
  *   * 
*       * 
  *   * 
    * 

CONSTRAINT - n is odd
 
 */
public class Pattern10 
{

    public static void main(String[] args) 
    {
        int n = 5;
        int sp1 = n/2;
        int sp2 = -1;
        
        for(int cr = 1; cr <= n; cr++)
        {
           for(int csp1 = 1; csp1 <= sp1; csp1++)
               System.out.print("  ");
           System.out.print("* ");
           
           for(int csp2 = 1; csp2 <= sp2; csp2++)
               System.out.print("  ");
           
           if(cr != 1 && cr != n)
               System.out.print("* ");
           
           if(cr <= n/2)
           {
               sp1--;
               sp2 += 2;
           }
           else
           {
               sp1++;
               sp2 -= 2;
           }
           System.out.println();
        }
    }

}
