package zs.java.polymorphism;



import lombok.Getter;
import lombok.Setter;


class Employee {
    private  String name;
    private String sex;
    private Integer age;
    static  final double SALARY_BASIC=3000.0;

    public  Employee(String aName,Integer aAge){
        name = aName;
        age = aAge;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    /**
     * 获得每月工作，并打印
     */
    public void getSalary(){
        System.out.println(name+"，今年"+age+"岁，每月工作"+SALARY_BASIC);
    }


}
