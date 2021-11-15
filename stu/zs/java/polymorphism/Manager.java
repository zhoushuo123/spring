package zs.java.polymorphism;

import lombok.Getter;
import lombok.Setter;

class Manager extends Employee{
    @Getter
    @Setter
    private double bonus;

    public Manager(String aName,Integer aAge,double aBonus){
        super(aName,aAge);
        bonus=aBonus;
    }

    /**
     * 经理每月工资底薪+提成
     */
    @Override
    public void getSalary(){
        System.out.println(super.getName()+"，今年"+super.getAge()+"岁，每月工资"+(SALARY_BASIC+bonus));
    }

}
