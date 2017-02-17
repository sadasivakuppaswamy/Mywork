package DT_STR_IMPL;

/**
 * Created by Sadasiva.Kuppaswamy on 06-07-2015.
 */
public class ArrayListTest {
    public static void main(String... a){
        MyArrayList<Integer> mylist=new MyArrayList<Integer>();
        mylist.add(10);
        mylist.add(59);
        mylist.add(49);
        mylist.add(22);
        mylist.add(10);
        mylist.add(59);
        mylist.add(49);
        mylist.add(22);
        mylist.add(49);
        //mylist.add(22);
        System.out.println(mylist.size());
        mylist.add(32, 9);
        System.out.println(mylist.size());
        System.out.println(mylist.get(9));
        mylist.add(11, 3);
        System.out.println("mylist.get(9)"+mylist.get(9));
        mylist.remove(0);
        System.out.println(mylist.get(0));




    }
}
