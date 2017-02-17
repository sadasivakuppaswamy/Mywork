package DT_STR_IMPL.hasset;

import DT_STR_IMPL.HashMap.HashMapCustom;

/**
 * Created by Sadasiva.Kuppaswamy on 22-05-2016.
 */
public class HashSetCustom<E> {
    private HashMapCustom<E,Object> hashMapCustom;
    public HashSetCustom(){
            hashMapCustom=new HashMapCustom();
    }
    public void add(E object){
        hashMapCustom.put(object,null);
    }
    public boolean contains(E obj){
        return hashMapCustom.contains(obj)!=null?true:false;

    }
    public boolean remove(E obj){
        return hashMapCustom.remove(obj);
    }
    public void display(){
        hashMapCustom.display();
    }
}
