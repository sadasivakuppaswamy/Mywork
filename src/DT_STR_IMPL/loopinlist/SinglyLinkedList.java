package DT_STR_IMPL.loopinlist;

/**
 * Created by Sadasiva.Kuppaswamy on 03-12-2015.
 */
public class SinglyLinkedList {
    private Node start;

    public void add(Integer i)
    {
        Node node = new Node(i);
        if(start == null)
            start = node;
        else
        {
            Node temp = start;
            while(temp.next != null)
            {
                temp = temp.next;
            }
            temp.next = node;
        }
    }

    public Node getStart()
    {
        return start;
    }
    public Node getNext(Node node){
       return node.getNext();
    }
   /* public void setNext(Node first,Node node){
        Node tmp=start;
        int nodeCount=0;
        while (tmp. )
    }*/

    static class Node
    {
        private Integer value;
        private Node next;
        Node(Integer i)
        {
            this.value = i;
            this.next=null;
        }


        public Integer getValue() {
            return value;
        }
        public void setValue(Integer value) {
            this.value = value;
        }
        public Node getNext() {
            return next;
        }
        public void setNext(Node next) {
            this.next = next;
        }
    }
}
