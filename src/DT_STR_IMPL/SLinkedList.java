package DT_STR_IMPL;

import javax.naming.LimitExceededException;

/**
 * Created by Sadasiva.Kuppaswamy on 06-07-2015.
 */
public class SLinkedList<T> {
    public SNode<T> head;
    private int size;

    public SLinkedList(){
        head=new SNode<T>(null);
        size=0;
    }
    public void add(T object){
        SNode<T> tmpnode=new SNode<T>(object);
        SNode<T> currentNode=head;
        while (currentNode.getNext()!=null){
            currentNode=currentNode.getNext();

        }
        tmpnode.setNext(currentNode.getNext());
        currentNode.setNext(tmpnode);
        size++;


    }
    public void add(T node,int index) throws LimitExceededException {
        if(index<=size){
            SNode<T> tmpNode=new SNode<T>(node);
            SNode<T> currentNode=head;
            for (int i=0;currentNode.getNext()!=null && i<index;i++){
                currentNode=currentNode.getNext();
            }
            tmpNode.setNext(currentNode.getNext());
            currentNode.setNext(tmpNode);
            size++;
        }
        else
            throw new LimitExceededException();

    }
    public T get(int index){
        if(index<=0 || index>=size)
        return null;
        else{
            SNode<T> currentNode=head.getNext();
            for(int i=1;i<=index;i++){
                currentNode=currentNode.getNext();

            }
            return currentNode.getData();
        }

    }
    public int size(){
        return size;
    }
    public boolean remove(int index){
        if (index < 1 || index > size())
            return false;
        SNode<T> currentNode=head.getNext();

        for (int i=1;i<index;i++){
            currentNode=currentNode.getNext();

        }
        currentNode.setNext(currentNode.getNext().getNext());
        size--;
        return true;

    }
    public String toString(){
        SNode<T> currentNode=head.getNext();
        StringBuffer output=new StringBuffer("[");
        while(currentNode!=null){
            output=output.append(currentNode.getData().toString()).append(",");
            currentNode=currentNode.getNext();
        }
        return output+"]";
    }
    public SNode<T> reverseByCount(SNode head, int noOfNodes){
        SNode<T> currentNode=head;
        SNode<T> previous=null;
        SNode<T> next=null;
        int count=0;
        while(currentNode.getNext()!=null && count<noOfNodes){
            next = currentNode.getNext();
            currentNode.setNext(previous);
            previous = currentNode;
            currentNode = next;
            count++;
        }
        if (next != null)
            head.setNext(reverseByCount(next,noOfNodes));

        // prev is now head of input list
        return previous;
    }
}
