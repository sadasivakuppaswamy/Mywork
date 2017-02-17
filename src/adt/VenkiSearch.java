package adt;

/**
 * Created by Sadasiva.Kuppaswamy on 21-05-2015.
 */
public class VenkiSearch {
    public static void main(String... a){
        System.out.print(isStringFind( "1200000179,1200000178,1200000180","1200000178, 1200000179, 1200000180"));
    }

    public static boolean isStringFind(String search, String find) {
        boolean flag = false;
        if(find.trim().length()==0){
            flag=true;
        }else{
            String[] findValues=find.split(",");
            int findValuesCount=findValues.length;
            if(findValuesCount==0){
                if(search.indexOf(find)!=-1){
                    flag=false;
                }else{
                    flag=true;
                }
            }else{
                for(int i=0;i<findValuesCount;i++){
                    String temp=findValues[i];
                    if(search.indexOf(temp)!=-1){
                        flag=true;
                        break;
                    }else{
                        flag=false;
                    }
                }
            }
        }

        return flag;
    }

}
