package main.java.dshkliar.oop_task;

/**
 * Created by Dmytro on 025 25 08 2016.
 */
public abstract class Employee {
    String name;
    char sex;
    int id;
    double salary;
    int hour_rate;

    Employee(){
        id=0;
        name="none";
        sex='n';
        salary=0.0;
        hour_rate=0;
    }

    Employee(int id, String name, char sex, int hourRate){
        this.id=id;
        this.name=name;
        this.sex=sex;
        this.hour_rate=hourRate;
    }

    Employee(int id, String name, char sex, double salary){
        this.id=id;
        this.name=name;
        this.sex=sex;
        this.salary=salary;
    }
}