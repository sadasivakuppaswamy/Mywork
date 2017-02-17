import java.util.HashSet;
import java.util.Set;

/**
 * Created by Sadasiva.Kuppaswamy on 29-05-2015.
 */
public class StringComparison {
    public static void main(String... a) throws Exception {
        Set<String> set=new HashSet<String>();
        set.add("1091000244");
        set.add("109100024");
        set.add("1091000243");
        set.add("1091000241");
        set.add("123442328");
        set.add("123442329");
        String s1=" 1091000244, 1091000243, 1091000241";
        System.out.print(isProductsInList(set,s1));

    }
    private  static String removeSpecialCharactersAndConvertToLowerCase(String inputLine)
    {
        if (inputLine != null && !inputLine.equals("")) {
            return inputLine.replaceAll(", ", " ").toLowerCase().trim();
        }

        else
            System.out.println("Enter Sentence or Word ");


        return  inputLine;
    }
    private static boolean isProductsInList(Set<String> productset ,String productList){
        int count=0;

        String[] modifiedString = removeSpecialCharactersAndConvertToLowerCase(productList).split(" ");

        for(String s:modifiedString){
            if(productset.contains(s))
                count++;

        }
        if(count==modifiedString.length){
            return true;
        }
        return false;

    }
}
