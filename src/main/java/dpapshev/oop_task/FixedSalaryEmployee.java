package dpapshev.oop_task;


public class FixedSalaryEmployee extends Employee{

    FixedSalaryEmployee(String name,String sex,int id){
            this.name = name;
            this.sex = sex;
            this.id = id;
        calculateSalary();

        }


    public void calculateSalary() {
        this.salary = 10000;
    }
}

