package jaya;

/**
 * Created by Sadasiva.Kuppaswamy on 26-06-2015.
 */
import java.util.Scanner;


public class NumberFactorial {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Object system;
        // TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");

        int number = scanner.nextInt();
        int result = 1;

        if(number <=0){
            result=1;
        }
        else{
            for(int i =1;i<=number;i++){
                result = result*i;
            }

        }
        System.out.println("Factorial of number:"+result);
    }
}
