package DT_STR_IMPL;

/**
 * Created by Sadasiva.Kuppaswamy on 06-07-2015.
 */
public class SNode<T> implements Comparable<T> {


    private SNode<T> next;

    private T data;

    @Override
    public int compareTo(T arg) {
        if(arg==this.data)
            return 0;
        else
        return 1;
    }
    public SNode(T obj){
        data=obj;
        next=null;
    }

    public SNode<T> getNext() {
        return next;
    }

    public void setNext(SNode<T> next) {
        this.next = next;
    }
    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
