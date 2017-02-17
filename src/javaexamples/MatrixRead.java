package javaexamples;

import java.util.Scanner;

/**
 * Created by Sadasiva.Kuppaswamy on 15-12-2015.
 */
public class MatrixRead {
    public static void main(String[] args) {
        System.out.println("Enter Matrix indexes");
        System.out.println("Enter rows");
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        System.out.println("Enter columns");
        int columns=sc.nextInt();
        System.out.println("Enter Elements");
        int[][] array=new int[rows][columns];
        for(int i=0;i<rows;i++){
            for (int j=0;j<columns;j++){
                array[i][j]=i*10+j;
            }
        }
        System.out.println("Display Array Elements");
        for(int i=0;i<rows;i++){
            for (int j=0;j<columns;j++){
                System.out.print(array[i][j]);
                System.out.print("  ");
            }
            System.out.println("\n");
        }


    }
}
