package javaexamples;

import java.util.regex.Pattern;

/**
 * Created by Sadasiva.Kuppaswamy on 03-12-2015.
 */
public class TriangleSum {
    public static void main(String[] args) {
        //System.out.println(isValidString("54#354#5#4#2"));
        //System.out.println(isTriangle(12));
        System.out.println(validtrianglesum("5#6#23#6#1#2#4#5#0#3#2#4#5#0#3"));
    }
    public static String validtrianglesum(String input1)
    {
        if(isValidString(input1)){
            String[] allNumbers= input1.split("#");
            if(isTriangle(allNumbers.length))
                return ""+totalMaxSum(allNumbers);
        }

        return "Invalid";
    }
    public static boolean isValidString(String input){
        if(Pattern.matches("(\\d+([#]\\d+)+)", input))
            return true;
        return false;

    }
    public static boolean isTriangle(int totalNumber){
        int lines=0;
        int elements=0;
        if(totalNumber==0||totalNumber==1)
            return false;
        for (int i=1;lines<10000 && elements<totalNumber;i++){
            elements=(i*(i+1))/2;
          //  lines=i;
            if(totalNumber==elements){

                return true;
            }

        }
        return false;
    }
    public static int totalMaxSum(String[] digits){
        int lines=0;
        int elements=0;
        int totalSum=0;
        int startIndex=0;


        for (int i=1;lines<100000 && elements<digits.length;i++){
            elements=(i*(i+1))/2;
         //   lines=i;

            totalSum=totalSum+lineMax(digits, startIndex, elements);
            startIndex=elements;

        }

        return totalSum;
    }

    private static int lineMax(String[] digits, int startIndex, int elements) {
        int max=0;
        for(int start=startIndex;start<elements;start++){
            max=max>Integer.parseInt(digits[start])?max:Integer.parseInt(digits[start]);

        }
        return max;
    }


}
