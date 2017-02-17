package javaexamples;

/**
 * Created by Sadasiva.Kuppaswamy on 15-02-2016.
 */
public class ArraySizeTest {
    public static void main(String[] args) {
        int[][] a=new int[5][];
        a[0]=new int[]{3,5,4};
        a[1]=new int[]{1,6,7,9};
        a[2]=new int[]{14,34,534};
        a[3]=new int[]{33,35,34};
        a[4]=new int[]{53,55,5,6,4,34};
        for(int[] i: a){
            for(int j:i){
                System.out.print(" " + j);
            }
            System.out.println("\n");
            System.out.println("Size of Array:"+i.length);
            System.out.println("\n");
        }
    }
}
