package javaexamples;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by Sadasiva.Kuppaswamy on 09-12-2015.
 */
public class AraaySorting {
    public static void main(String[] args) {
        char[][] chars=new char[][]{{'e','t','5'},{'r','e','2','r'},{'w'},{'t','t'}};
        System.out.println(chars.length);
        for (char[] ch:chars){
            System.out.println(ch.length);
        }
        Arrays.sort(chars, new Comparator<char[]>() {
            @Override
            public int compare(char[] s1, char[] s2) {
                Integer t1 = s1.length;
                Integer t2 = s2.length;
                return t1.compareTo(t2);
            }
        });

        System.out.println(chars.length);
        for (char[] ch:chars){
            System.out.println(ch.length);
        }
    }
}
