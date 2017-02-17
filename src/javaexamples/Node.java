package javaexamples;

/**
 * Created by Sadasiva.Kuppaswamy on 06-05-2016.
 */
public class Node {
    private int data;
    private Node left;
    private Node right;
    private Node nextRight;

    public Node(int data) {
        this.data=data;
    }

    public int getData() {
        return data;
    }
    public void setData(int data) {
        this.data = data;
    }
    public Node getLeft() {
        return left;
    }
    public void setLeft(Node left) {
        this.left = left;
    }
    public Node getRight() {
        return right;
    }
    public void setRight(Node right) {
        this.right = right;
    }
    public Node getNextRight() {
        return nextRight;
    }
    public void setNextRight(Node nextRight) {
        this.nextRight = nextRight;
    }
}
