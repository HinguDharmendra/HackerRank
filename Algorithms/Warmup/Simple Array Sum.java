import java.io.*;
import java.util.Scanner;;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        while(n-- > 0){
            sum += sc.nextInt();
        }
        System.out.println(sum);
    }
}