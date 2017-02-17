package javaexamples;

/**
 * Created by Sadasiva.Kuppaswamy on 14-12-2015.
 */
public class QuickSort {
    int[] elements=null;
    int number=0;
    public static void main(String[] args) {

        QuickSort quickSort=new QuickSort();
        quickSort.elements=new int[]{10,20,4,3,2,3};
        quickSort.sort(quickSort.elements);
        for (int element:quickSort.elements){
            System.out.println(element);
        }

    }
    public void sort(int[] values) {
        // check for empty or null array
        if (values ==null || values.length==0){
            return;
        }
        this.elements = values;
        number = values.length;
        quicksort(0, number - 1);
    }

    private void quicksort(int low  , int high) {
        int i=low;
        int j=high;
        int pivot = elements[low + (high-low)/2];
        while (i <= j) {
            while (elements[i]<pivot){
                i++;

            }
            while (elements[j]>pivot)
                j--;
            if(i<=j){
                swap(i,j);
                i++;
                j--;
            }
        }

        if(low<j){
            quicksort(low,j);
        }
        if(high>i)
            quicksort(i,high);
    }
 private  void swap( int low, int high) {
        int temp=elements[low];
        elements[low]=elements[high];
        elements[high]=temp;
    }
}
