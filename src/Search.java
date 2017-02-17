import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Sadasiva.Kuppaswamy on 11-05-2015.
 */
public class Search {

    private static String inputLine;

    public static void main(String... a) throws Exception {
        String s1=" 1200000179,1200000178, 1200000180";
        String s2="1200000178, 1200000179, 1200000180";

        String newString1 = null;
        String newString2=null;
        String[] splits=null;
        Set first=null;
        String[] splits2=null;

        Set second=null;
       if(verifySpecialCharacterCount(s1)){
            newString1=removeSpecialCharactersAndConvertToLowerCase(s1);
           splits = newString1.split(" ");
           first=new HashSet();

           for(String asset: splits){
               //System.out.println(asset);
               first.add(asset);
           }
       }
        if(verifySpecialCharacterCount(s2)){
             newString2=removeSpecialCharactersAndConvertToLowerCase(s2);
            splits2 = newString2.split(" ");
            second=new HashSet();

            for(String s: splits2){
                //System.out.println(asset);
                second.add(s);

            }
        }



        splits2 = newString2.split(" ");
        second=new HashSet();
        int count=0;
        for(String s: splits2){
            //System.out.println(asset);
            second.add(s);
           if(first.contains(s))
               count++;
        }

        System.out.println(second.size());
        System.out.print(count);
        if(second.size()==count){
            System.out.print("Contains");
        }
        else
            System.out.print("S2 not contain in S1");

       // getSpecialCharacterCount("Sdge,hgdt,");*/


        
    }
    public  static String removeSpecialCharactersAndConvertToLowerCase(String inputLine) throws Exception
    {
        if (inputLine != null && !inputLine.equals("")) {
            return inputLine.replaceAll("[^a-zA-Z0-9]", " ").toLowerCase().trim();
        }

        else
            System.out.println("Enter Sentence or Word ");


        return  inputLine;
    }

    public static boolean verifySpecialCharacterCount(String s) {
        if (s == null || s.trim().length()==0) {
            System.out.println("Incorrect format of string");
            return false;
        }
        Pattern p = Pattern.compile("[^A-Za-z0-9]");
        Matcher m = p.matcher(s);
        // boolean b = m.matches();
        boolean b = m.find();
        if (b == true)
            System.out.println("There is a special character in my string ");
        else
            System.out.println("There is no special char.");
        
        return b;
    }

}
