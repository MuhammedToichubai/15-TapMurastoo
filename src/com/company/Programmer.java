package com.company;

public class Programmer extends Person{
    String companyName;

    public  Programmer(){
    }

    public Programmer(String name, String designation, String companyName) {
        super(name, designation);
        this.companyName = companyName;
    }

    void  coding(){
        System.out.println("Loves to write code - Код жазганды жакшы көрөт.");

    }

    @Override
    public String toString() {
        return "Name='" + name + '\'' + ", designation='" + designation + '\'' + ", companyName='" + companyName+"'." ;
    }

}


