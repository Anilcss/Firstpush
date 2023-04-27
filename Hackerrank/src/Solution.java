import java.util.Arrays;
import java.util.Scanner;

class Result {
/*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(int [] arr) {
    
   int minisum=0;
   int maxsum=0;
   
   for(int i=0;i<arr.length-2;i++)
   {
       minisum+=arr[i];
   }
   for(int j=1;j<arr.length-1;j++)
    
    {
    
        maxsum+=arr[j];
    }
System.out.print(minisum);
System.out.print(maxsum);
    }
}

public class Solution {
    
    public static void main(String[] args)
     {
    
   Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
    int arr[]=new int[n];
     for(int j=0;j<n;j++)
    
    {
         arr[j]=sc.nextInt();
    System.out.print(arr[j]);
    }
    Arrays.sort(arr);
    
    Result.miniMaxSum(arr);
      
    }
}
