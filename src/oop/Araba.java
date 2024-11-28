package oop;

public class Araba {

    String marka;
    String model;
    int yil;

    public void bilgileriGoster() {
        System.out.println("Arabamin Markasi: " + marka);
        System.out.println("Arabamin Modeli: " + model);
        System.out.println("Arabamin Yili: " + yil);
    }


    public void calistir() {
        System.out.println(marka + " " + model + " arabasi calisti");
    }


}
