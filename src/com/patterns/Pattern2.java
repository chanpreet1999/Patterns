package com.patterns;

/*
 
*  *   *   *   *   
*   *   *   *   
*   *   *   
*   *   
*   
  
  */

public class Pattern2 
{
    public static void main(String[] args) 
    {
        int n = 5;
        int stars = n;
        for(int cr = 1; cr <= n; cr++)
        {
            for(int cst = stars; cst >= 1; cst--)
            {
                System.out.print("*\t");
            }
            stars--;
            System.out.println();
        }
    }
}
