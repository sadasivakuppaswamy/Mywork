package DT_STR_IMPL;

/**
 * Created by Sadasiva.Kuppaswamy on 08-07-2015.
 */
public class SCircularList<T>{
    private class CNode<T>{
        CNode link;
        T data;
        public CNode(T data){
            this.data=data;

        }
        public CNode(T data,CNode link){
            this.data=data;
            this.link=link;
        }
    }

    private CNode start;
    private int size;
    public SCircularList(){
        size=0;
    }
    public void append(T data){
        size++;
        CNode temp=new CNode(data);
        if(start==null){
            start=temp;
        }
        else{
            CNode tmp=start;
            while(tmp.link!=start)
                tmp=tmp.link;
            tmp.link=temp;

        }
        temp.link=start;
    }
    public void addbeg(T data){
        size++;
        CNode temp=new CNode(data);
        if (start==null){

            start=temp;
        }
        else {
            CNode tmp=start;
            while (tmp.link!=start)
                tmp=tmp.link;
            tmp.link=temp;
            temp.link=start;
        }

        start=temp;
    }
    public void addAt(int index,T data){
        CNode temp=new CNode(data);
        if(index>size)
            throw new ArrayIndexOutOfBoundsException("Index exceeded size");
        if(start==null){
            start=temp;
        }
        else{
            CNode tmp=start;
            CNode prevNode=null;
            for(int i=0;i<index;i++){
                if(tmp.link==null)
                    break;
                prevNode=tmp;
                tmp=tmp.link;
            }
            prevNode.link=temp;
            temp.link=tmp;
           // tmp.link=temp;
        }

        size++;

    }
    public T deleteAt(int index){
        if(index>=size||size==0){
            throw new ArrayIndexOutOfBoundsException("Index is not in range of size");

        }
        CNode tmp=start;
        CNode prev=start;
        for(int i=0;i<index;i++){

            prev=tmp;
            tmp=tmp.link;

        }
        if(tmp==start)
            start=tmp.link;

        prev.link=tmp.link;
        size--;
        return (T) tmp.data;
    }
    public T getAt(int index){

        if(index>=size||size==0){
            throw new ArrayIndexOutOfBoundsException("Index is not in range of size");

        }
        CNode tmp=start;
       // CNode prev=start;
        for(int i=0;i<index;i++){

           // prev=tmp;
            tmp=tmp.link;

        }
        return (T) tmp.data;

    }
    public void display(){
        if(start!=null){
            CNode tmp=start;
            String out="[";
            while (tmp.link!=start){

                out+=tmp.data+"==>";
                tmp=tmp.link;

            }
            out+=tmp.data+"==>";
            out+=tmp.link.data+"]";
            System.out.println(out);
        }
        else
            throw new ArrayIndexOutOfBoundsException("No Products in Circulr List");

    }
public static void main(String... a){
    SCircularList<String> sCircularList=new SCircularList<String>();
    sCircularList.append("sadasiva");
    sCircularList.append("mani");
    sCircularList.display();
    sCircularList.addbeg("chakravarthy");
    sCircularList.display();
    sCircularList.addAt(2, "kowsalya");
    sCircularList.display();
    sCircularList.deleteAt(2);
    sCircularList.display();
}
}
