package com.patterns;

/*
    
*   
*   *   
*   *   *   
*   *   *   *   
*   *   *   *   *   


*/

public class Pattern1 
{
    public static void main(String[] args) 
    {
        int n = 5;
        int stars = 1;
        for(int cr = 1; cr <= n; cr++)
        {
            for(int cst = 1; cst <= stars; cst++)
            {
                System.out.print("*\t");
            }
            stars++;
            System.out.println();
        }
    }

}
