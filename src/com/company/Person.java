package com.company;

public class Person {
    String name;
    String designation;

    public Person(){

    }

    public Person(String name, String designation) {
        this.name = name;
        this.designation = designation;
    }

    void learnUiron(){
        System.out.println("Puts learning first - Окууну биринчи орунга коёт.");

    }

    void walkHodit(){
        System.out.println("Always walks a lot for health - Ден соолук үчүн ар дайым көп басат.");

    }

    void  eatJe(){
        System.out.println("Eat on time - өз убагында тамактанат.");

    }

}
