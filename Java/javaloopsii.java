import java.util.*;
import java.io.*;
import java.math.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            
            int j=0,s=a+b;
            do
            {
                if(j==0 && i>0) System.out.println();
                j++;
                System.out.print(s+" ");
                s+=(Math.pow(2,j)*b);
            }while(j<n);
            
        }
        in.close();
        
        
    }
}
