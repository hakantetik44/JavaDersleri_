package projeler;

import java.util.HashMap;
import java.util.Scanner;

public class KitapTakip {
    public static void main(String[] args) {
        HashMap<String, String> kitaplar = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        int secim;

        do {
            System.out.println("\n--- projeler.Kitap Takip Sistemi ---");
            System.out.println("1. projeler.Kitap Ekle");
            System.out.println("2. Kitapları Listele");
            System.out.println("3. projeler.Kitap Ara");
            System.out.println("4. projeler.Kitap Sil");
            System.out.println("5. Çıkış");
            System.out.print("Bir seçenek seçin: ");
            secim = scanner.nextInt();
            scanner.nextLine();

            switch (secim) {
                case 1:
                    System.out.print("projeler.Kitap adı: ");
                    String kitapAdi = scanner.nextLine();
                    System.out.print("Yazar adı: ");
                    String yazarAdi = scanner.nextLine();
                    kitaplar.put(kitapAdi, yazarAdi);
                    System.out.println("projeler.Kitap eklendi!");
                    break;

                case 2:
                    if (kitaplar.isEmpty()) {
                        System.out.println("Henüz hiçbir kitap eklenmedi.");
                    } else {
                        System.out.println("\n--- Tüm Kitaplar ---");
                        for (String kitap : kitaplar.keySet()) {
                            System.out.println("projeler.Kitap: " + kitap + " | Yazar: " + kitaplar.get(kitap));
                        }
                    }
                    break;

                case 3:
                    System.out.print("Aramak istediğiniz kitabın adını girin: ");
                    String arananKitap = scanner.nextLine();
                    if (kitaplar.containsKey(arananKitap)) {
                        System.out.println("projeler.Kitap bulundu: " + arananKitap + " | Yazar: " + kitaplar.get(arananKitap));
                    } else {
                        System.out.println("projeler.Kitap bulunamadı.");
                    }
                    break;

                case 4:
                    System.out.print("Silmek istediğiniz kitabın adını girin: ");
                    String silinecekKitap = scanner.nextLine();
                    if (kitaplar.containsKey(silinecekKitap)) {
                        kitaplar.remove(silinecekKitap);
                        System.out.println("projeler.Kitap silindi.");
                    } else {
                        System.out.println("projeler.Kitap bulunamadı.");
                    }
                    break;

                case 5:
                    System.out.println("Sistemden çıkılıyor. Hoşça kalın!");
                    break;

                default:
                    System.out.println("Geçersiz seçenek, lütfen tekrar deneyin.");
            }
        } while (secim != 5);

        scanner.close();
    }
}
