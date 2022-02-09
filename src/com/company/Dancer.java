package com.company;

public class Dancer extends Person{
    String groupName;

    public Dancer() {
    }

    public Dancer(String name, String designation, String groupName) {
        super(name, designation);
        this.groupName = groupName;
    }

    void dancing(){
        System.out.println("She dances very well, so she dances - Ал абдан жакшы бийлейт, ошондуктан бийлейт.");

    }

    @Override
    public String toString(){
        return "Name='"+name+"', designation='"+designation+"', groupName= '"+groupName+"'.";
    }
}
