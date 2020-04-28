package com.patterns;

/*
 
55555
45555
34555
23455
12345
 
 */

public class Pattern22 
{
    public static void main(String[] args) 
    {
        int n = 5;
        int count1 = n, count2;
        int cst;
        for(int cr = 1; cr <= n; cr++)
        {
            count2 = count1; 
            for(cst = 1; count2 < n; cst++)
            {
                System.out.print(count2);
                count2++;
            }
            
            for(; cst <= n; cst++)
            {
                System.out.print(n);
            }
            
            count1--;
            System.out.println();
        }
    }
    
}
