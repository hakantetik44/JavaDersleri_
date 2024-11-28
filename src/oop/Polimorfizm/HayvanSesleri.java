package oop.Polimorfizm;

public class HayvanSesleri {

    // Ana sınıf
    public class Hayvan {
        public void sesCikar() {
            System.out.println("Hayvan bir ses çıkarıyor.");
        }
    }

    // Alt sınıf: Kedi
    public class Kedi extends Hayvan {
        @Override
        public void sesCikar() {
            System.out.println("Kedi: Miyav!");
        }
    }

    // Alt sınıf: Köpek
    public class Kopek extends Hayvan {
        @Override
        public void sesCikar() {
            System.out.println("Köpek: Hav hav!");
        }
    }

    // Polymorphic kullanım
    public static void main(String[] args) {
        HayvanSesleri hs = new HayvanSesleri();

        // Hayvan türlerini tanımlıyoruz
        Hayvan[] hayvanlar = new Hayvan[2];
        hayvanlar[0] = hs.new Kedi(); // Kedi nesnesi
        hayvanlar[1] = hs.new Kopek(); // Köpek nesnesi

        // Tüm hayvanlar ses çıkarıyor
        for (Hayvan hayvan : hayvanlar) {
            hayvan.sesCikar();
        }
    }
}

