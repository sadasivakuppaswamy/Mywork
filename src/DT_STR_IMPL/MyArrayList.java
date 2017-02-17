package DT_STR_IMPL;

import java.util.Arrays;

/**
 * Created by Sadasiva.Kuppaswamy on 06-07-2015.
 */
public class MyArrayList<T> {

    private static int MAX_SIZE=10;
    private Object elements[];
    private int size =0;
    public MyArrayList(){
        elements=  new Object[MAX_SIZE];
    }
    public void add(T e){
        if(size==MAX_SIZE)
            changeSize();
        elements[size++]=e;
    }

    public void changeSize() {
        elements = Arrays.copyOf(elements, elements.length * 2);
        System.out.println("\nNew length: "+elements.length);
    }
    public Object remove(int index) {
        if(index<size){
            Object obj=elements[index];
            elements[index]=null;
            int tmp=index;
            while(tmp<size){
                elements[tmp]=elements[++tmp];
                elements[tmp]=null;
            }
            size--;
            return obj;
        }else
        throw new ArrayIndexOutOfBoundsException();

    }
    public int size(){
        return size;
    }
    public boolean add(Object e,int index){
        if(index<size){
            if(size==MAX_SIZE)
                changeSize();

           // int tempIndex=index;
            Object tmp=elements[index];
            elements[index++]=e;
            size++;
            while(index<size){
                Object nextElement=elements[index];
                elements[index++]=tmp;
                tmp=nextElement;

            }
            return true;
        }
        else if(index==size){
            if(size==MAX_SIZE)
                changeSize();
            elements[index]=e;
            size++;
            return true;
        }
        else

            return false;
    }
    public T get(int index){
        if(index<size || index>0){
            return (T)elements[index];

        }
        else
            throw new ArrayIndexOutOfBoundsException();
    }

}
