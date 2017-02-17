package adt.DS_Problems;


import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by Sadasiva.Kuppaswamy on 22-07-2015.
 */
public class ListLoopTest {
    public static void main(String... a){
        LinkedList<String> l=new LinkedList<String>();
        l.add("Sadasiva");
        l.add("Mani");
        l.add("Kowsalya");
        l.addLast(l.get(1));
        Iterator itr=l.listIterator();
        int count=1;
        while(itr!=null && count ==2){

        }



    }
}
