package com.fooddelievery.MAPPs;

import java.util.Objects;

public class Student extends Person
{
      String name ;

    public Student(int id, String name) {
        super(id);
        System.out.println("  sub-class conscrticter ,   student");
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdD() {
        super.getIdD();
      System.out.println(" this is getId  of sub class classs , student  ssss --------  ");
        return super.getIdD();
    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return getId() == student.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + getId() +
                ", name='" + name + '\'' +
                '}';
    }
}
