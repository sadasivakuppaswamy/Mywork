package jaya;

/**
 * Created by Sadasiva.Kuppaswamy on 28-07-2015.
 */
public class Giri {
    public static void main(String... a){
       /* String lastPage="3649 results";
        int recordCount=Integer.parseInt(lastPage.substring(0, lastPage.indexOf("r") - 1));
        System.out.println(recordCount);
        int noOfPages=0;
        if(recordCount%50!=0){
            noOfPages=(recordCount/50)+1;

        }
        else
            noOfPages=recordCount/50;
        System.out.println(noOfPages);*/
        String numberOfProducts="900% of properties complete (9/10)";
        numberOfProducts=numberOfProducts.substring(0, 3);
        System.out.println(numberOfProducts);

    }
}
