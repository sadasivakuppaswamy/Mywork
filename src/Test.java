import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by Sadasiva.Kuppaswamy on 23-04-2015.
 */
public class Test {
    public static void main(String... a){

       /* String []s={"HC (TANG)", "Default"};
       StringBuffer str=new StringBuffer("");
        for(int i=s.length-1;i>=0;i--){
            str=str.append(s[i]);
            str.append(", ");

        }

        System.out.print(str.substring(0,str.length()-2));*/

        Map product=new HashMap<String,String>();
        product.put("test1","000123431");
        product.put("test2","000123432");
        product.put("test3", "000123433");
       // System.out.println(productList(product.get("test1"),product.get("test2"),product.get("test3")));
        String s="Created group testgroup for planogram myplanotest1, consisting of the following products:\n" +
                "Product(s):1200000178, 1200000179, 1200000180";
       // s.substring(s.lastIndexOf(":"));
        System.out.println(s.substring(s.lastIndexOf(":")+1));
        System.out.println(s.substring(0,s.lastIndexOf(":")+1));



       /* StringBuffer str=new StringBuffer("");
        for(int i=s.length-1;i>=0;i--){
            str=str.append(s[i]);
            str.append(", ");

        }

        System.out.print(str.substring(0, str.length() - 2));*/


        /*String listPrice="50.00";


        System.out.print(listPrice.substring(listPrice.indexOf(".")+1).concat(".00"));*/


        List<String> afterSort=new ArrayList<String>();
        Date dateTime = new Date();
        SimpleDateFormat fieldDt = new SimpleDateFormat("yyyyMMddS");

        String fieldDate = fieldDt.format(dateTime.getTime())+"1";// + (1000 * 60 * 60 * 24));

        String effDate = fieldDt.format(dateTime.getTime());
        System.out.println(fieldDate);
        System.out.println(effDate);
    }
    /*public static String productList(Object... s){

        if(s.length==0)
            return null;
        else{
            StringBuffer str=new StringBuffer("");
            for(int i=s.length-1;i>=0;i--){
                str=str.append(s[i]);
                str.append(", ");

            }


            return str.substring(0, str.length() - 2);
        }

    }*/

}
