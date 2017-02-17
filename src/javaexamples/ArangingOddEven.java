package javaexamples;

/**
 * Created by Sadasiva.Kuppaswamy on 14-12-2015.
 */
public class ArangingOddEven {
    public static void main(String[] args) {
        int[] elements=new int[]{1,21,4,3,0,6,4,3,2};
        int evenIndex=0;
        int oddIndex=elements.length-1;

        while (evenIndex!=oddIndex){
            int swap=0;
            if(elements[evenIndex]%2==0)
                evenIndex++;
            else
                swap++;
            if(elements[oddIndex]%2==1)
                oddIndex--;
            else
                swap++;
            if(swap==2){
                int temp =elements[evenIndex];

                elements[evenIndex]=elements[oddIndex];
                elements[oddIndex]=temp;
            }
        }
        for(int element:elements){
            System.out.println(element);
        }

    }
}
