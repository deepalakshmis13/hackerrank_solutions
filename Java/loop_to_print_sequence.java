import java.util.*;
import java.io.*;

class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();  // Number of queries
        
        for (int j = 0; j < t; j++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            
            int total = a;  // Start with a
            
            for (int i = 0; i < n; i++) {
                total += b * (int)Math.pow(2, i);  // Add b * 2^i
                System.out.print(total + " ");
            }
            System.out.println();  // New line after each query
        }
        
        in.close();
    }
}
