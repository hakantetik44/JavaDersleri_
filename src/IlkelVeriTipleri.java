public class IlkelVeriTipleri {
    public static void main(String[] args) {
        //int, double, float, char, boolean Bellekte doğrudan veri saklar.

        // Sayısal Veri Tipleri
        int sayi = 10; //Bellekte 4 byte yer kaplar (32 bit)
        System.out.println("sayi kac = " + sayi);
        double ondalikSayi = 3.14;//Bellekte 8 byte yer kaplar (64 bit).
        System.out.println("ondalikSayimiz = " + ondalikSayi);

        float _ondalikSayi2 = 3.14f; // float tipine dönüştürme
        System.out.println("ondalikSayi2 = " + _ondalikSayi2);

        // Karakter Veri Tipleri
        char karakter = 'A'; // Bellekte 2 byte yer kaplar (16 bit)
        System.out.println("karakter = " + karakter);
        String metin = "Merhaba Java!";
        System.out.println("metin = " + metin);

        // Mantıksal Veri Tipleri
        boolean eveGeldinMI = true;
        System.out.println("eve geldin mi bugun ?= " + eveGeldinMI);
        boolean yemekYedinMI = false;
        System.out.println("Yemek yedin mi sen sabah ? = " + yemekYedinMI);


    }

}
