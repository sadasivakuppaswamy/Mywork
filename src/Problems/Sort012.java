package Problems;

/**
 * Created by Sadasiva.Kuppaswamy on 16-05-2016.
 * Sort an array of 0s, 1s and 2s
 Given an array A[] consisting 0s, 1s and 2s, write a function that sorts A[]. The functions should put all 0s first, then all 1s and all 2s in last.

 Example
 Input = {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
 Output = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2}
 */
//Sort an array of 0,1,2 in O(n)
public class Sort012 {
    public void sort012(int[] a) {
        int indexOf0 = 0;
        int IndexOf2 = a.length -1;
        int i = 1;
        int temp = 0;
        while(i < a.length )  {
            if(a[i] == 0 && i > indexOf0) {
                temp = a[i];
                a[i] = a[indexOf0];
                a[indexOf0] = temp;
                indexOf0++;
            } else if(a[i] == 2 && i < IndexOf2) {
                temp = a[i];
                a[i] = a[IndexOf2];
                a[IndexOf2] = temp;
                IndexOf2--;
            } else
                i++;
        }
    }
    public static void main(String... ar){
        int[] a = { 2, 0, 1, 1, 2, 0, 2, 2, 0, 1, 1, 2, 1, 0, 2 };

         sort012(a,a.length);
        for(int i:a) {
            System.out.print(i+" ");
        }

    }
    static void sort012(int a[], int arr_size)
    {
        int lo = 0;
        int hi = arr_size - 1;
        int mid = 0,temp=0;
        while (mid <= hi)
        {
            switch (a[mid])
            {
                case 0:
                {
                    temp   =  a[lo];
                    a[lo]  = a[mid];
                    a[mid] = temp;
                    lo++;
                    mid++;
                    break;
                }
                case 1:
                    mid++;
                    break;
                case 2:
                {
                    temp = a[mid];
                    a[mid] = a[hi];
                    a[hi] = temp;
                    hi--;
                    break;
                }
            }
        }
    }
}
