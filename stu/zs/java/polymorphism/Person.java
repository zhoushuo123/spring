package zs.java.polymorphism;

import lombok.Data;

@Data
public abstract  class Person {
    private String name;
    public abstract String getDescription();
}
