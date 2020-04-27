package com.patterns;

/*
 
1 
2 3 
4 5 6 
7 8 9 10 
11 12 13 14 15 
 
 */

public class Pattern11 
{

    public static void main(String[] args) 
    {
        int n = 5;
        int stars = 1;
        int count = 1;
        for(int cr = 1; cr <= n; cr++)
        {
            for(int cst  = 1; cst <= stars; cst++)
            {
                System.out.print(count + " ");
                count++;
            }
            stars++;
            System.out.println();
        }
    }

}
