package jaya;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Sadasiva.Kuppaswamy on 04-09-2015.
 */
public class Santhosh {
    public static void main(String... a){
        List<Integer> l=new ArrayList<Integer>();
        l.add(10);
        l.add(20);
        l.add(30);
        Iterator i=l.iterator();
        while(i.hasNext())
        {
            System.out.print(i.next());
            l.add(50);
        }
    }



}
