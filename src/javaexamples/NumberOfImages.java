package javaexamples;

/**
 * Created by Sadasiva.Kuppaswamy on 18-12-2015.
 */
public class NumberOfImages {
    public static void main(String[] args) {
        int[] matrix=new int[]{4,4};
        int[] fillings=new int[]{2,0,3,1,2,0,4,1,5,0};
        System.out.println(find_Images(fillings, 4,4));
    }

    private static int find_Images(int[] fillings, int rows,int columns) {
        int pixels=0;
        int images=0;
        int row=0;
        int elements=rows*columns;
        int startIndex=0;
        int lastIndex=0;
        int startPixel=0;
        int nextPixel=0;
        for(int i=0;i<fillings.length;i++){
            if(i%2==0){
                pixels+=fillings[i];
                row=pixels/rows;
            }


            else {
                nextPixel=findNextPixel(fillings[i]);
            }

        }
        return 0;
    }

    private static int findNextPixel(int filling) {
        if(filling==0)
            return 1;
        return 0;
    }
}
