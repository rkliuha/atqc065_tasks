package main.java.kmarko.oop_task;

/**
 * Created by Kvita on 25.08.2016.
 */
public abstract class Employee {
   protected String name;
   protected int id;
   protected char sex;
   protected double salary;
   protected int hour_rate;

    Employee() {}

    Employee (String n, int i, char s, double sal) {
        name=n;
        sex=s;
        id=i;
        salary=sal;
    }

    Employee (String n, int i, char s, int h) {
        name=n;
        sex=s;
        id=i;
        hour_rate=h;
    }



}
