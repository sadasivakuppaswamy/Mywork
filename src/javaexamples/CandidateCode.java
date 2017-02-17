package javaexamples;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Sadasiva.Kuppaswamy on 17-12-2015.
 */
public class CandidateCode {

    public static int bridge_count(String[] input1,int input2)
    {
        int currectBridges = 0;
        if(input1==null||input1.length==0) {
            return 0;
        }
        else{

            Map<Integer, Integer> visited = new HashMap<Integer, Integer>();
            int lastVisited = 0;

            for (int i = 0; i < input2; i++) {
                String bridge = input1[i];
                String[] citiesbidges = bridge.split("#");
                visited.put(Integer.parseInt(citiesbidges[0]), Integer.parseInt(citiesbidges[1]));
                if (visited.size() >= 1) {
                    if (Integer.parseInt(citiesbidges[1]) > lastVisited) {
                        lastVisited = Integer.parseInt(citiesbidges[1]);
                        currectBridges++;
                    }

                }

            }
        }
        return currectBridges;
    }

    public static void main(String[] args) {
        String[] input={"1#2","3#6","2#3"};
        System.out.println(bridge_count(input, 3));
    }
}
