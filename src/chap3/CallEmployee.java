package chap3;

import static chap3.Employee.work;
public class CallEmployee {
    public static void main(String[] args) {
       //call satatic  void main & method
        System.out.println("Id : "+Employee.id);
        work();
        
        Employee e = new Employee();
        System.out.println("Namem : "+e.name);
        System.out.println("Age : "+e.age);
        e.getSalary();
    }
}
