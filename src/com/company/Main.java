package com.company;



public class Main {

    public static void main(String[] args) {
///*        БУЛ ТАПШЫРМАДА PERSON ДЕГЕН КЛАСС ТУЗОСУЗДОР.
// *       ПОЛЕЛЕРИН ЖАНА МЕТОДТОРУН СУРОТТО КОРСОТУЛГОНДОЙ
// *      КЫЛЫП  ТУЗОСУЗДОР.
// *       АЛ КЛАССТЫ 3 БАШКА КЛАСС МУРАСТАШЫ  КЕРЕК.
// *       АЛ 3 КЛАССТЫН ОЗДОРУНУН УНИКАЛДУУ ПОЛЕЛЕРИ ЖАНА
// *       МЕТОДТОРУ БАР СУРОТТОГУДОЙ.
// *              КОНСТРУКТОР ТУЗОСУЗДОР ЖАНА ОЗДОРУНУН УНИКАЛДУУ МЕТОДТОРУН ДА ТУЗОСУЗДОР.
// *               МЕЙН МЕТОДКО 3 КЛАССТЫН ОБЪЕКТИЛЕРИН ТУЗОСУЗДОР, ПОЛЕЛЕРИНЕ КОНСТРУКТОР МЕНЕН МААНИ БЕРИП,
// *      КОНСОЛГО TOSTRING() МЕТОДУН КОЛДОНУП МААЛЫМАТТАРЫН  ЧЫГАРЫНЫЗДАР.

     Programmer programmer = new Programmer("Muhammed","Programmer","Peaksoft");
        Dancer dancer = new Dancer("Zulfiya","Dancer","ZuDance");
        Singer singer = new Singer("Muzur","Singer","KeneshTobu");

       System.out.println("Man can do everything. example:");
        System.out.println(programmer.toString());
        programmer.learnUiron();
        programmer.walkHodit();
        programmer.eatJe();
        programmer.coding();
        System.out.println("___________________________________________________________________");
        System.out.println(dancer.toString());
        dancer.learnUiron();
        dancer.walkHodit();
        dancer.eatJe();
        dancer.dancing();
        System.out.println("_________________________________________________________________________________");
        System.out.println(singer.toString());
        singer.learnUiron();
        singer.walkHodit();
        singer.eatJe();
        singer.singing();
        singer.playGuitar();
       System.out.println("_____________________________________________________________________________________");


    }

}
