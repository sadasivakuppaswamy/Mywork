package adt;

/**
 * Created by sadasivak on 07-04-2015.
 */
public class LinkedList<T> {
    NodeList<T> headNode=null;
    public int listCount=0;
    public LinkedList(){
        NodeList nodeList=new NodeList();


    }

    public void addNode(NodeList nodeList){
        if(headNode==null){
                headNode=nodeList;
        }
        else{
            headNode.next=nodeList;
        }



    }
    public int size(NodeList nodelist){
        int count=0;
        while(nodelist.next!=null){
            count++;
            nodelist=nodelist.getNext();
        }
        return count;
    }
}
