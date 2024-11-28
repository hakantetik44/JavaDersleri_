public class Operatörler {
    public static void main(String[] args) {
      /*  int sayi1 = 10;
        int sayi2 = 3;

        // Toplama
        int sayilarinToplami= sayi1 + sayi2;
        System.out.println("Sayilarin Toplami bu kadar eder = > " +(sayi1+sayi2));

        // cıkarma
        int cikarma = sayi1 - sayi2;
        System.out.println("Çıkarma: " + cikarma);

        // carpma
        int carpma = sayi1 * sayi2;
        System.out.println("Çarpma: " + carpma);

        // Bölme
        double bolme = (double)sayi1 / sayi2;
        System.out.println("Bölme: " + bolme);

        // Modülü
        int mod = sayi1 % sayi2;
        System.out.println("Mod: " + mod);

        int sayi= 10;
        sayi++;
        System.out.println("sayi1 = " + sayi);
        sayi--;
        System.out.println("sayi2 = " + sayi);
        ++sayi;
        System.out.println("sayi3= " + sayi);
        --sayi;
        System.out.println("sayi4 = " + sayi);
         */
        // Karşılaştırma Operatörleri
        int sayi1 = 10;
        int sayi2 = 20;

        System.out.println("sayi1 == sayi2: " + (sayi1 == sayi2)); // false
        System.out.println("sayi1!= sayi2: " + (sayi1!= sayi2)); // true
        System.out.println("sayi1 > sayi2: " + (sayi1 > sayi2)); // false
        System.out.println("sayi1 < sayi2: " + (sayi1 < sayi2)); // true
        System.out.println("sayi1 >= sayi2: " + (sayi1 >= sayi2)); // false
        System.out.println("sayi1 <= sayi2: " + (sayi1 <= sayi2)); // true

        // Mantıksal Operatörler
        boolean   renkliMi = true , sıcakMi = false;
        System.out.println("renkliMi ve sıcakMi: " + (renkliMi && sıcakMi));
        System.out.println("renkliMi ya da  sıcakMi: " + (renkliMi || sıcakMi));
        System.out.println("renkli degil mi : " + (!renkliMi));

        
    }
}
