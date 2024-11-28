package oop;

public class ArabaTest {
    public static void main(String[] args) {
        Araba araba1=  new Araba();
        araba1.marka = "Toyota";
        araba1.model = "Corolla";
        araba1.yil=2024;

        araba1.bilgileriGoster();
        araba1.calistir();


    }
}
