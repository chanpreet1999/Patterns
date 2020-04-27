package com.patterns;
/*

        1 
      2 3 2 
    3 4 5 4 3 
      2 3 2 
        1 
 
 */

public class Pattern15 
{

    public static void main(String[] args) 
    {
        int n = 5;
        int stars = 1;
        int spaces = n/2;
        int count = 1, countCopy;
        for(int cr = 1; cr <= n; cr++)
        {    
            //spaces
            for(int csp = 1; csp <= spaces; csp++)
            {
                System.out.print("  ");
            }
            
            //stars
            countCopy = count;
            for(int cst = 1; cst <= stars; cst++)
            {
                System.out.print(countCopy + " ");
                
                if(cst <= stars/2)
                    countCopy++;
                else
                    countCopy--;
            }
            
            //future predictions
            if(cr <= n/2)
            {
                count++;
                spaces--;
                stars += 2;
            }
            else
            {
                spaces++;
                stars -= 2;
                count--;
            }
            System.out.println();
        }
    }

}
