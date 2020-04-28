package com.patterns;

/*

0
505
45054
3450543
234505432
12345054321

 */

public class Pattern23 
{
    public static void main(String[] args) 
    {
        int n = 5;
        int printer = 1;
        int count1 = n;
        
        System.out.println(0);
        for(int cr = 1; cr <= n; cr++)
        {
            int count1Copy = count1;
            for(int ptr = 1; ptr <= printer; ptr++)
            {
                System.out.print(count1Copy);
                count1Copy++;
            }
            
            System.out.print(0);
            
            int count2 = n;
            for(int ptr = 1; ptr <= printer; ptr++)
            {
                System.out.print(count2);
                count2--;
            }
            printer++;
            count1--;
            System.out.println();
        }
    }
    
}
