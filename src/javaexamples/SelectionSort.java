package javaexamples;

/**
 * Created by Sadasiva.Kuppaswamy on 02-05-2016.
 */
public class SelectionSort {
    public static void main(String a[]){

        int[] arr1 = {10,34,2,56,7,67,88,42};
        int[] arr2 = doSelectionSort(arr1);
        for(int i:arr2){
            System.out.print(i);
            System.out.print(", ");
        }
    }

    private static int[] doSelectionSort(int[] arr1) {
        for(int i=0;i<arr1.length-1;i++){
            int index=i;
            for(int j=i+1;j<arr1.length-1;j++){
                if(arr1[j]<arr1[index])
                    index=j;
                int smallest=arr1[index];
                arr1[index]=arr1[i];
                arr1[i]=smallest;
            }
        }
        return new int[0];
    }

}
