package adt;

/**
 * Created by sadasivak on 07-04-2015.
 */
public class NodeList<T> {
    T data;
    NodeList next;

    public NodeList getNext() {
        return next;
    }

    public void setData(T data) {
        this.data = data;
    }

    public void setNext(NodeList next) {
        this.next = next;
    }

    public T getData() {
        return data;
    }
}
