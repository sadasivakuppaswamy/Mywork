package DT_STR_IMPL.HashMap;

/**
 * Created by Sadasiva.Kuppaswamy on 16-05-2016.
 */
public class HashMapCustom<K,V> {
    private Entry<K,V>[] table;
    private int capacity=4;

    public K contains(K obj) {
        int hash=hash(obj);
        if(table[hash]==null){
            return null;
        }
        else {
            Entry<K,V> tmp=table[hash];
            while (tmp.next!=null){
                if(tmp.key.equals(obj)){
                    return tmp.key;
                }
                tmp=tmp.next;
            }
            return null;

        }
    }

    static class Entry<K,V>{
        K key;
        V value;
        Entry<K,V> next;
        public Entry(K key,V value,Entry next){
            this.key=key;
            this.value=value;
            this.next=next;
        }

    }
    public HashMapCustom(){
        table = new Entry[capacity];
    }
    private int hash(K key){
        return Math.abs(key.hashCode()) % capacity;
    }
    public void put(K newKey,V data){
        if(newKey==null)
            return;
        int hash=hash(newKey);
        Entry<K,V> newEntry=new Entry<K, V>(newKey,data,null);
        if(table[hash]==null){
            table[hash]=newEntry;
        }
        else{
            Entry<K,V> previous=null;
            Entry<K,V> current=table[hash];
            while (current!=null){
                if(current.key.equals(newKey)){
                    if(previous==null){
                        newEntry.next=current.next;
                        table[hash]=newEntry;
                        return;
                    }
                    else{
                        newEntry.next=current.next;
                        previous.next=newEntry;
                        return;
                    }

                }
                previous=current;
                current=current.next;
            }
            previous.next=newEntry;
        }

    }
    public V get(K newKey){
        int hash=hash(newKey);
        if(table[hash]==null)
            return null;
        else{
            Entry<K,V> tmp=table[hash];
            while(tmp!=null){
                if(tmp.key.equals(newKey)){
                    return tmp.value;
                }
                tmp=tmp.next;
            }
            return null;
        }

    }
    public boolean remove(K removeKey){
        int hash=hash(removeKey);
        if(table[hash]==null)
            return false;
        else {
            Entry<K,V> previous = null;
            Entry<K,V> current = table[hash];
            while (current!=null){
                if(current.key.equals(removeKey)){
                    if(previous==null){
                        table[hash]=table[hash].next;
                        return true;
                    }
                    else{
                        previous.next=current.next;
                        return true;

                    }

                }
                previous=current;
                current=current.next;

            }
            return false;
        }
    }
    public void display(){
        for(int i=0;i<capacity;i++){
            if(table[i]!=null){
                Entry<K,V> entry=table[i];
                while (entry!=null){
                    System.out.println(entry.key+ " :: "+entry.value);
                    entry=entry.next;
                }
            }
        }
    }
}

