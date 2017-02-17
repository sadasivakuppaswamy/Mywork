package DT_STR_IMPL;

/**
 * Created by Sadasiva.Kuppaswamy on 07-07-2015.
 */
public class SListTest {
    public static SLinkedList<Integer> lList;
    public static void main(String[] args) {
        lList = new SLinkedList<Integer>();

        // add elements to LinkedList
        lList.add(1);
        lList.add(4);
        lList.add(5);
        lList.add(6);
        lList.add(19);



        System.out.println("lList - print linkedlist: " + lList);
        System.out.println("lList.size() - print linkedlist size: " + lList.size());
        System.out.println("lList.get(3) - get 3rd element: " + lList.get(3));
        System.out.println("lList.remove(2) - remove 2nd element: " + lList.remove(2));
        System.out.println("lList.get(3) - get 3rd element: " + lList.get(3));
        System.out.println("lList.size() - print linkedlist size: " + lList.size());
        System.out.println("lList - print linkedlist: " + lList);
        System.out.println(lList.reverseByCount(lList.head, 3));
        System.out.println(lList);
    }

}

