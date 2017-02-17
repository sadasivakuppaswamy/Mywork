package adt;

/**
 * Created by Sadasiva.Kuppaswamy on 02-09-2016.
 */
public class Student {
    int number;
    String name;
    Student(int n,String name1){
        number=n;
        name=name1;
    }
    Student(){

    }
    public static void main(String[] args) {
        Student st=new Student(5,"Sadasiva");
        System.out.println(st.number);
        System.out.println(st.name);

    }
}
