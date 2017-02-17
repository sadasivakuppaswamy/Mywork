import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sadasiva.Kuppaswamy on 03-06-2015.
 */
public class SortingStrings {
    public static void main(String... a){
        List<String> list=new ArrayList<String>();



        list.add(null);
        list.add("DSPROACTIV");

        list.add("MYSTORE1");list.add("ProactivJP");

        System.out.println(isSortedList(list));

    }

    public static boolean isSortedList(List<String> list)
    {
        if(list == null || list.isEmpty())
            return false;

        if(list.size() == 1)
            return true;

        for(int i=1; i<list.size();i++)
        {
            if(list.get(i)==null)
                break;
            if(list.get(i-1)==null)
                continue;

            if (list.get(i).compareToIgnoreCase(list.get(i - 1)) < 0 )
                return false;
        }

        return true;
    }
}
