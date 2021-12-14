package zs.java.polymorphism;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

class Manager extends Employee{
    @Getter
    @Setter
    private double bonus;

    public Manager(String aName,Integer aAge,double aBonus){
        super(aName,aAge);
        bonus=aBonus;
    }

    @Override
    public String getName() {
        return "经理的名字是："+super.getName();
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    /**
     * 经理每月工资底薪+提成
     */
    @Override
    public void getSalary(){
        System.out.println(getName()+"，今年"+getAge()+"岁，每月工资"+(SALARY_BASIC+bonus));
    }

    /**
     * 经理级别的，基础休假是4+（年龄-20）/2.5
     */
    @Override
    public int getRestDay(int aAge) {
        return 4 + (aAge - 20) / 2;
    }

    public double getRestDay(double aAge){
        return 4+(aAge-20)/2.5;
    }

    @Override
    public boolean equals(Object ManagerObject) {
        if(super.equals(ManagerObject)){
            Manager manager=(Manager) ManagerObject;
            return Objects.equals(bonus,manager.bonus);
        }
       return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), 17*bonus);
    }
}
