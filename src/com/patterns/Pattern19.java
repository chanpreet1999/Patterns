package com.patterns;

/*

* * *   * 
    *   * 
* * * * * 
*   *     
*   * * * 

CONSTRAINT - n is odd
*/

public class Pattern19 
{

    public static void main(String[] args) 
    {
        int n = 5;
        int stars = n;
        for(int cr = 1; cr <= n; cr++)
        {
            for(int cst = 1; cst <= stars; cst++)
            {
                if( (cr == 1 && cst <= n/2+1) || ( cr == n &&  cst >= n/2 + 1) || ( cst == 1 && cr >= n/2 + 1 )|| ( cst == n && cr <= n/2 + 1 )  || cr == n/2 + 1 || cst == n/2 + 1 )
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }

}
