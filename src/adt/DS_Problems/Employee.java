package adt.DS_Problems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/**
 * Created by Sadasiva.Kuppaswamy on 01-12-2015.
 */
public class Employee implements Comparable {
    int rollNo;
    String Name;
    float salary;
    public Employee(int rollNo,String Name,float salary){
        this.rollNo=rollNo;
        this.Name=Name;
        this.salary=salary;

    }
    @Override
    public int compareTo(Object o) {
        Employee e=(Employee)o;
        if (salary==e.salary)
            return 0;
        else if (salary>e.salary)
            return 1;
        else
            return -1;

    }

    public static void main(String[] args) {
        ArrayList al=new ArrayList();

        Employee e1=new Employee(123,"sadasiva",68);
        Employee e2=new Employee(234,"mohan",51);
        Employee e3=new Employee(456,"Him",40);
        Employee e4=new Employee(567,"Him2",40);
        al.add(e1);
        al.add(e2);
        al.add(e3);
        al.add(e4);
        Collections.sort(al);
        Iterator itr=al.iterator();
        while(itr.hasNext()){
            Employee e=(Employee)itr.next();
            System.out.println("ENo:"+e.rollNo+"   Name:"+e.Name+"  Sal:"+e.salary);
        }
    }
}
