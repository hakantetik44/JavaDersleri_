package projeler;

import java.util.ArrayList;
import java.util.Scanner;

// Soyut Sınıf: projeler.Kitap
abstract class Kitap {
    // Kapsülleme: private fields
    private String ad;
    private String yazar;

    // Parametreli Constructor
    public Kitap(String ad, String yazar) {
        this.ad = ad;
        this.yazar = yazar;
    }


    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getYazar() {
        return yazar;
    }

    public void setYazar(String yazar) {
        this.yazar = yazar;
    }

    // Soyut metod: Polimorfizm
    public abstract void kitapBilgisi();
}

// Alt sınıf: projeler.Roman
class Roman extends Kitap {

    public Roman(String ad, String yazar) {
        super(ad, yazar);
    }

    // Polimorfizm: Farklı kitap türlerinin farklı davranışları
    @Override
    public void kitapBilgisi() {
        System.out.println("Bu bir roman kitabıdır. projeler.Kitap Adı: " + getAd() + ", Yazar: " + getYazar());
    }
}

// Alt sınıf: projeler.Dergi
class Dergi extends Kitap {

    public Dergi(String ad, String yazar) {
        super(ad, yazar);
    }

    // Polimorfizm: projeler.Dergi kitabı için farklı bir açıklama
    @Override
    public void kitapBilgisi() {
        System.out.println("Bu bir dergi kitabıdır. projeler.Kitap Adı: " + getAd() + ", Yazar: " + getYazar());
    }
}


public class KitapTakipSistemi {
    static ArrayList<Kitap> kitaplar = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int secim;

        do {

            System.out.println("\n--- projeler.Kitap Takip Sistemi ---");
            System.out.println("1. projeler.Kitap Ekle");
            System.out.println("2. Kitapları Listele");
            System.out.println("3. projeler.Kitap Ara");
            System.out.println("4. projeler.Kitap Sil");
            System.out.println("5. projeler.Kitap Türünü Göster");
            System.out.println("6. Çıkış");
            System.out.print("Bir seçenek seçin: ");
            secim = scanner.nextInt();
            scanner.nextLine();  // buffer temizleme

            switch (secim) {
                case 1:

                    System.out.print("projeler.Kitap türünü seçin (projeler.Roman/projeler.Dergi): ");
                    String tur = scanner.nextLine();
                    System.out.print("projeler.Kitap adı: ");
                    String kitapAdi = scanner.nextLine();
                    System.out.print("Yazar adı: ");
                    String yazarAdi = scanner.nextLine();
                    if (tur.equalsIgnoreCase("projeler.Roman")) {
                        Kitap roman = new Roman(kitapAdi, yazarAdi);
                        kitaplar.add(roman);
                        System.out.println("projeler.Roman kitabı eklendi!");
                    } else if (tur.equalsIgnoreCase("projeler.Dergi")) {
                        Kitap dergi = new Dergi(kitapAdi, yazarAdi);
                        kitaplar.add(dergi);
                        System.out.println("projeler.Dergi kitabı eklendi!");
                    } else {
                        System.out.println("Geçersiz kitap türü.");
                    }
                    break;

                case 2:

                    if (kitaplar.isEmpty()) {
                        System.out.println("Henüz hiç kitap eklenmedi.");
                    } else {
                        System.out.println("\n--- Kitaplar ---");
                        for (Kitap kitap : kitaplar) {
                            kitap.kitapBilgisi(); // Polimorfizm
                        }
                    }
                    break;

                case 3:

                    System.out.print("Aramak istediğiniz kitabın adını girin: ");
                    String arananKitap = scanner.nextLine();
                    boolean bulundu = false;
                    for (Kitap kitap : kitaplar) {
                        if (kitap.getAd().equalsIgnoreCase(arananKitap)) {
                            kitap.kitapBilgisi();
                            bulundu = true;
                            break;
                        }
                    }
                    if (!bulundu) {
                        System.out.println("projeler.Kitap bulunamadı.");
                    }
                    break;

                case 4:

                    System.out.print("Silmek istediğiniz kitabın adını girin: ");
                    String silinecekKitap = scanner.nextLine();
                    boolean silindi = false;
                    for (Kitap kitap : kitaplar) {
                        if (kitap.getAd().equalsIgnoreCase(silinecekKitap)) {
                            kitaplar.remove(kitap);
                            System.out.println("projeler.Kitap silindi.");
                            silindi = true;
                            break;
                        }
                    }
                    if (!silindi) {
                        System.out.println("projeler.Kitap bulunamadı.");
                    }
                    break;

                case 5:

                    System.out.println("\n--- projeler.Kitap Türleri ---");
                    for (Kitap kitap : kitaplar) {
                        kitap.kitapBilgisi();
                    }
                    break;

                case 6:
                    System.out.println("Sistemden çıkılıyor. Hoşça kalın!");
                    break;

                default:
                    System.out.println("Geçersiz seçenek, lütfen tekrar deneyin.");
            }
        } while (secim != 6);

        scanner.close();
    }
}
