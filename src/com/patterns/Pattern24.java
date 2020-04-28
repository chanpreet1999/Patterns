package com.patterns;
/*
        1 
      2 1 
    3 2 1 
  4 3 2 1 
5 4 3 2 1 

 */
public class Pattern24 
{
    public static void main(String[] args) 
    {
        int n = 5;
        int spaces = n-1;
        int stars = 1;
        for(int cr = 1; cr <= n; cr++)
        {
            for(int csp = 1; csp <= spaces; csp++)
                System.out.print("  ");
            
            int count = stars;
            for(int cst = 1; cst <= stars; cst++)
            {
                System.out.print(count+ " ");
                count--;
            }
            
            spaces--;
            stars++;
            System.out.println();
        }
    }
    
}
