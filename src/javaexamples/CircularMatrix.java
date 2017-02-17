package javaexamples;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Sadasiva.Kuppaswamy on 16-12-2015.
 */
public class CircularMatrix {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter rows");
        int index=Integer.parseInt(bufferedReader.readLine());
        int[][] array=new int[index][index];
        int k=1,r1=0,r2=index-1,c1=0,c2=index-1;
        while (k<=index*index){
            for(int i=c1;i<c2;i++){
                array[r1][i]=k++;
            }
            for(int j=r1;j<=r2;j++){
                array[j][c2]=k++;
            }
            for(int l=c2-1;l>=c1;l--){
                array[r2][l]=k++;
            }
            for(int m=r2-1;m>=r1+1;m--){
                array[m][c1]=k++;
            }
            c1++;
            c2--;
            r1++;
            r2--;
        }
        System.out.println("The Circular Matrix is:");
        for(int i=0;i<index;i++)
        {
            for(int j=0;j<index;j++)
            {
                System.out.print(array[i][j]+ "\t");
            }
            System.out.println();
        }
    }

    }

