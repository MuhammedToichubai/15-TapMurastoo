package com.company;

public class Singer extends Person {
    String bandName;

    public Singer() {
    }

    public Singer(String name, String designation, String bandName) {
        super(name, designation);
        this.bandName = bandName;
    }

    void  singing(){
        System.out.println("He has a beautiful voice and sings well - Анын үнү сонун, жакшы ырдайт.");

    }

    void playGuitar(){
        System.out.println("Can play all the songs on the guitar - Гитарада бардык ырларды ойной алат.");

    }

    @Override
    public String toString() {
        return "Name='" + name + '\'' +", designation='" + designation + '\'' + ", bandName='" + bandName + "'.";
    }
}
