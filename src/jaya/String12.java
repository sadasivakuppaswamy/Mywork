package jaya;

import org.junit.Assert;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Sadasiva.Kuppaswamy on 08-10-2015.
 */
public class String12 {
    public static void main(String... a){
        Date dateTime = new Date();
        SimpleDateFormat fieldDt = new SimpleDateFormat("MMddyyyyHHmm");
        String upc=fieldDt.format(dateTime.getTime());
        String upc1 = upc.substring(0, upc.length() - 1)+1;// + (1000 * 60 * 60 * 24));

        String upc2 = upc.substring(0,upc.length()-1)+2;

        String upc3 = upc.substring(0,upc.length()-1)+3;
        String upc4 = upc.substring(0,upc.length()-1)+4;
        System.out.println(upc1);
        System.out.println(upc2);
        System.out.println(upc3);
        System.out.println(upc4);

        Assert.assertEquals((int) (Double.parseDouble("4.5") * 10)
                , Integer.parseInt("45"));

    }
}
