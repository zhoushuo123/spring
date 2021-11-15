package zs.java.polymorphism;

public class Test {
    public static void main(String[] args) {
        Employee[] employees = new Employee[3];
        Manager manager = new Manager("zs",30,2000.0);
        employees[0] = new Employee("zs1",23);
        employees[1] = new Employee("zs2",24);
        employees[2] =manager;
        employees[0].getSalary();
        employees[2].getSalary();
    }
}
