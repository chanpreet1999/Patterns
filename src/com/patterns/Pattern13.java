package com.patterns;

/*

1 
1 1 
1 2 1 
1 3 3 1 
1 4 6 4 1 
1 5 10 10 5 1 

 */

public class Pattern13 
{

    public static void main(String[] args) 
    {
        int max = 6;
        int newVal, oldVal = 1;
        for(int n = 0; n < max; n++)
        {
            oldVal = 1;
            for(int r = 0; r <= n; r++ )
            {
                System.out.print(oldVal + " ");
                
                newVal = ( (n - r) *oldVal / (r + 1) ) ;
                        
                oldVal = newVal;
            }
            System.out.println();
        }
    }

}
