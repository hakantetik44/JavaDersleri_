package oop.Encapsulation;

public class KamyonTest {
    public static void main(String[] args) {

        Kamyon kamyon1 = new Kamyon("Toyota", "Corolla",25);

       kamyon1.KamyonBilgileriniGoster();

        System.out.println("Mevcut kapasite " +  kamyon1.getKapasite()  +  "  ton");

        kamyon1.setKapasite(30);

        System.out.println("Yeni kapasite " +  kamyon1.getKapasite()  +  "  ton");

        kamyon1.setKapasite(-10); // Kapasite negatif olma durumu kontrol edilir.

        kamyon1.KamyonBilgileriniGoster();
    }
}
