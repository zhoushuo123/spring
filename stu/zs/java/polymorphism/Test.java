package zs.java.polymorphism;


public class Test {
    public static void main(String[] args) {
        Employee[] employees = new Employee[3];
        Manager manager = new Manager("zs",30,2000.0);
        employees[0] = new Employee("zs1",23);
        employees[1] = new Employee("zs2",24);
        manager.getRestDay(40);
        employees[2] =manager;
        employees[0].getSalary();
        employees[2].getSalary();
        manager.setBonus(3000);
        employees[1].getSex();
        System.out.println(employees[2].getRestDay(25)+ manager.getRestDay(25));
        // 在堆中创建了1个Manager数组对象。声明类型为Manager数组类型,这个数组里面有10个Manager类型的引用变量
        Manager[] manages = new Manager[10];
        //声明了一个Employee数组类型的 staff的变量，变量的引用是可manages数据变量的引用一致。堆中的Manager数组对象。
        Employee[] staff = manages;
        /**
        //此时staff[0]还没有初始化，staff[0]为null，还没有类型呢
        System.out.println(staff[0].getClass());
         **/
//        初始化staff[0]，对象类型为Employee。，会报错，因为此处是将一个Employee超类对象的引用赋给一个子类的变量。
        if(staff[0] instanceof Employee){
            staff[0] = new Employee("zsw",23);
        }
        staff[1] = new Manager("zsw1",34,2000.0);
        System.out.println(staff[1].getClass());
        //
        // manager=(Manager)employees[0];
        employees[1]=manager;
        manages[0].setBonus(100);
        staff[0].getSalary();
    }
}
