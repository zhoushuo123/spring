package zs.java.polymorphism;



import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
class Employee extends Person {

    private String name;
    public String sex;
    private Integer age;
    static final double SALARY_BASIC = 3000.0;

    public Employee(String aName, Integer aAge) {
        name = aName;
        age = aAge;
    }

//    public String getName() {
//        return name;
//    }

    public Integer getAge() {
        return age;
    }

    /**
     * 获得每月工资，并打印
     */
    public void getSalary() {
        System.out.println(name + "，今年" + age + "岁，每月工作" + SALARY_BASIC);
    }

    /**
     * 获得每月休假天数,休假天数和年龄有关，休假天数=基础休假是4天+（年龄-20）/5
     */
    public int getRestDay(int aAge) {
        return 4 + (aAge - 20) / 5;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Employee employee = (Employee) o;
        return Objects.equals(name, employee.name) && Objects.equals(sex, employee.sex) && Objects.equals(age, employee.age);
    }

    /**
     * 自己写的一个equals
     *
     * @param EmployeeObject
     * @return
     */
    public boolean equals1(Object EmployeeObject) {
        if (this == EmployeeObject) {
            return true;
        }
        if (EmployeeObject == null || getClass() != EmployeeObject.getClass()) {
            return false;
        }
        /**
         * 如果所有子类都有统一的语义，就使用instanceofj检测：
         * if(!(EmployeeObject instanceof Employee))
         */
        Employee employee = (Employee) EmployeeObject;
        return name.equals(employee.name)
                && sex.equals(employee.sex)
                && age.equals(employee.age);
    }

    @Override
    public int hashCode() {
        return 7 * Objects.hashCode(name)
                + 11 * Objects.hashCode(sex)
                + 13 * Objects.hashCode(age);
    }

    @Override
    public String getDescription() {
        return "目前是一个员工";
    }
}
