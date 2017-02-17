package adt;

/**
 * Created by Sadasiva.Kuppaswamy on 29-05-2015.
 */
public class EventSpli {

    public static void main(String... a){

        String s1="Changed the Out Of Stock alternates for product 1220000032 in planogram myplanotest1\n" +
                "    Alternate(s) added:\n" + "1220000031, 1220000036\n" +
                "    Alternate(s) removed: \n";

        String s2="Changed the assortment for planogram  \n 0 product(s) added:"+
                "\nproducts_deleted+ product(s) removed:sada, siva, raghu";
        s1.indexOf(':');
        s1.lastIndexOf(':');
    /*   System.out.println(s1.indexOf(':'));
        System.out.println(s1.lastIndexOf(':'));
        System.out.println(s1.lastIndexOf(':') - s1.indexOf(':'));
        System.out.println(s1.substring(0,s1.indexOf(':')+1));*/
        System.out.println(s1.substring(s1.lastIndexOf(':')-20,s1.lastIndexOf(':')+1));


        System.out.println(s1.substring(s1.indexOf(':')+2,s1.lastIndexOf(':')-20));



        System.out.println(s2.substring(0,s2.lastIndexOf(':')+1));
        System.out.println(s2.substring(s2.lastIndexOf(':')+1));



    }
}
