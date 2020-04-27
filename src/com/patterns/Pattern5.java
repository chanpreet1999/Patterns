package com.patterns;

/*
    
    * 
  * * * 
* * * * * 
  * * * 
    * 

CONDITION - n is always odd
*/
public class Pattern5 {

    public static void main(String[] args) 
    {
        int n = 5;
        int stars = 1;
        int spaces = n/2;
        for(int cr = 1; cr <= n; cr++)
        {
            for(int csp = 1; csp <= spaces; csp++)
                System.out.print("  ");
            for(int cst = 1; cst <= stars; cst++)
                System.out.print("* ");
            
            if(cr <= n/2)
            {
                stars += 2;
                spaces--;
            }
            else
            {
                stars -= 2;
                spaces++;
            }
            System.out.println();
        }
    }

}
