package jaya;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int numberCount=Integer.parseInt(sc.nextLine());
        String[] numbers=sc.nextLine().split(" ");
        long sum=0l;
        for (int i = 0; i < numberCount; ++i){
            System.out.println(numbers[i]);
            sum+=Integer.parseInt(numbers[i]);
        }
        System.out.println(""+sum);

    }
}