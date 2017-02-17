package javaexamples;

import java.util.*;

/**
 * Created by Sadasiva.Kuppaswamy on 29-01-2016.
 */
public class JediProblem {
    public static void main(String... a){
        String inputText="";


    }
    public static String constructTree(String input1){

              return null;
    }
    private static Map<Character, Integer> sortByComparator(Map<Character, Integer> unsortMap)
    {

        List<Map.Entry<Character, Integer>> list = new LinkedList<Map.Entry<Character, Integer>>(unsortMap.entrySet());

        // Sorting the list based on values
        Collections.sort(list, new Comparator<Map.Entry<Character, Integer>>() {
            public int compare(Map.Entry<Character, Integer> o1,
                               Map.Entry<Character, Integer> o2) {

                    return o2.getValue().compareTo(o1.getValue());


            }
        });

        // Maintaining insertion order with the help of LinkedList
        Map<Character, Integer> sortedMap = new LinkedHashMap<Character, Integer>();
        StringBuffer input1=null;
        for (Map.Entry<Character, Integer> entry : list)
        {
            sortedMap.put(entry.getKey(), entry.getValue());
            input1.append(entry.getKey().toString());

        }

        return sortedMap;
    }

}
