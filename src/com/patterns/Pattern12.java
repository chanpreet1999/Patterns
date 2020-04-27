package com.patterns;

/*
 
0 
1 1 
2 3 5 
8 13 21 34 
55 89 144 233 377 
 
 */

public class Pattern12 
{

    public static void main(String[] args) 
    {
        int n = 5;
        int stars = 1;
        int first = 0;
        int second = 1;
        int third;
        for(int cr = 1; cr <= n; cr++)
        {
            for(int cst = 1; cst <= stars; cst++)
            {
                System.out.print(first + " ");
                third = first + second;
                first = second;
                second = third;
            }
            stars++;
            System.out.println();
        }
    }

}
