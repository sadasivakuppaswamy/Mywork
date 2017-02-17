package DT_STR_IMPL;

import java.util.NoSuchElementException;

/**
 * Created by Sadasiva.Kuppaswamy on 07-07-2015.
 */
public class DLinkedList<T> {
    public class DNode<T>{
        DNode next;
        DNode prev;
        T data;
        DNode(T data,DNode next,DNode prev){
            this.next=next;
            this.prev=prev;
            this.data=data;

        }

    }
    private DNode<T> head;
    private DNode<T> tail;
    private int size;
    public DLinkedList(){
        size=0;
    }
    public void addFirst(T data){
        DNode tmp=new DNode(data,head,null);
        if(head!=null){
            head.prev=tmp;

        }
        head=tmp;
        if(tail==null){
            tail=tmp;
        }
        size++;
        System.out.println("Adding:"+data);
    }
    public void addLast(T data){
        DNode tmp=new DNode(data,null,tail);
        if(tail!=null){
            tail.next=tmp;

        }
        tail=tmp;
        if(head==null){
            head=tmp;
        }
        size++;
        System.out.println("AddLast() adding:"+data);

    }
    public void iterateForward(){
        System.out.println("\nIterating forward");
        DNode tmp=head;
        while(tmp!=null){
            System.out.print(tmp.data+"<==>");
            tmp=tmp.next;
        }
    }
    public void iterateBackward(){
        System.out.println("\nIterating backward");
        DNode tmp=tail;
        while (tmp!=null){
            System.out.print(tmp.data+"<==>");
            tmp=tmp.prev;

        }
    }
    public T removeFirst(){
        if(isEmpty())
            throw new NoSuchElementException();

            DNode tmp=head;
            head= head.next;
            head.prev=null;
            size--;
            System.out.println("Remove First():"+tmp.data);


        return (T)tmp.data;
    }

    public T removeLast(){
        if(isEmpty())
            throw new NoSuchElementException();
        DNode tmp=tail;
        tail=tail.prev;
        tail.next=null;
        size--;
        System.out.println("Remove Last():"+tmp.data);
        return (T)tmp.data;
    }
    public boolean addAfter(T newdata,T after ){
        DNode current=head;
        while (current.data!=after){
            current=current.next;
            if(current==null)
                return false;

        }
        DNode tmp=new DNode(newdata,null,null);
        if(current.next==null){
            current.next=tmp;
            tmp.prev=current;
            tail=tmp;
        }
        else{
            tmp.next=current.next;
            current.next.prev=tmp;
        }


        tmp.prev=current;
        current.next=tmp;
        size++;
        return  true;
    }
    public T deleteKey(T deleteData){
        DNode current=head;
        while(current.data!=deleteData){
            current=current.next;
            if(current==null)
                return null;

        }
        if(current==head){
            head=current.next;
            head.prev=null;
        }
        else

            current.prev.next = current.next;
        if(current==tail){
            tail=current.prev;
            tail.next=null;
        }

        else{
            current.next.prev = current.prev;
            /*current.prev.next=current.next;
            current.next.prev=current.prev;
*/
        }
        return (T)current.data;
    }
    public void display(){
        String output="[";
        if(isEmpty())
            throw new NoSuchElementException("Empty");
        DNode current=head;
        while (current.next!=null){
            output+=current.data+"<==>";
            current=current.next;
        }
        output+=current.data+"]";
        System.out.println(output);
    }


    public boolean isEmpty(){
        return size==0;
    }
    public int size(){
        return  size;

    }

    public static void main(String... a){
        DLinkedList<String> dLinkedList=new DLinkedList<String>();
        dLinkedList.addFirst("Sadasiva");
        dLinkedList.addLast("Mani");
        dLinkedList.display();
        dLinkedList.addAfter("chakravarthy", "Mani");
        dLinkedList.display();

        System.out.println("" + dLinkedList.deleteKey("Mani"));
        dLinkedList.display();
        dLinkedList.addFirst("Amma");
        dLinkedList.display();

        dLinkedList.addLast("jaya");
        dLinkedList.display();
        dLinkedList.iterateBackward();
        dLinkedList.iterateForward();

    }
}
