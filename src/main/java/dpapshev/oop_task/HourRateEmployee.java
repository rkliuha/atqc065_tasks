package dpapshev.oop_task;


public class HourRateEmployee extends Employee {
    private double hourRate;
    HourRateEmployee(String name,String sex,int id,double hourRate){
        this.name = name;
        this.sex = sex;
        this.id = id;
        this.hourRate = hourRate;
        calculateSalary();
    }

    public void calculateSalary() {
        this.salary = 20.8*8*hourRate;
    }
}
