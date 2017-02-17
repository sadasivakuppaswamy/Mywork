import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by Sadasiva.Kuppaswamy on 11-05-2015.
 */
public class Search1 {

        public static void main(String... a){
            String s1="1200000179, 1200000178, 1200000180";
            String s2="1200000178, 1200000179, 1200000180";
            if(s1.trim().length()==0 && s2.trim().length()==0){
                System.out.print("true");

            }
           else if(s1.trim().length()==0 && s2.trim().length()!=0){
                System.out.print("false");
            }
            else if(s1.trim().length()!=0 && s2.trim().length()==0){
                System.out.print("true");
            }
            else {
                String[] splits = s1.split(",");
                Set first=new HashSet();

                for(String asset: splits){
                    //System.out.println(asset);
                    first.add(asset);
                }
                String[] splits2 = s2.split(",");
                Set second=new HashSet();
                int count=0;
                for(String s: splits2){
                    //System.out.println(asset);
                    second.add(s);

                   /* if(first.contains(s))
                        count++;*/
                }

                if(first.size()>second.size()){
                    compareStrings(first,second);
                }
                else{
                    compareStrings(second,first);
                }
            }
        }
    public static boolean compareStrings(Set first,Set second){
        int count=0;
        System.out.println(first.size());
        System.out.println(second.size());
        Iterator itr=second.iterator();
        while(itr.hasNext()){
           // System.out.println(itr.next());
           if(first.contains(itr.next())){
               count++;
           }
        }

        System.out.println(count);
        if(second.size()==count){
            System.out.print("true");
            return true;
        }
        else
            System.out.print("false");
        return false;


    }
}



