public class DegiskenOrnekleri {
    public static void main(String[] args) {
        int yas = 35;
        String isim = "Hakan";
        double boy = 1.83;
        boolean egitmenMi=true;

        System.out.println("Adı: " + isim);
        System.out.println("Yas: " + yas);
        System.out.println("Boy: " + boy);
        System.out.println("Eğitmen mi: " + egitmenMi);
        
        // Değişkenlerin değerlerini değiştirme
        yas = 36;
        boy = 1.84;

        System.out.println("Yas: " + yas);
        System.out.println(boy);
        //final değişkenler
        final double PI = 3.14159;
        final String Okul_adi = "Bilkent Üniversitesi";
        
        final int sayi=5;
        System.out.println("sayi = " + sayi);


        int numara =    100;//4byte
        long buyukNumara = numara;// 8 byte (64 bit)
        System.out.println("Küçük veri tipi (int): " + numara);
        System.out.println("Büyük veri tipi (long): " + buyukNumara);


    }
}
