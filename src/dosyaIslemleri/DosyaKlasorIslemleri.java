package dosyaIslemleri;

import java.io.File;
import java.io.IOException;

public class DosyaKlasorIslemleri {
    public static void main(String[] args) {

        File dosya = new File("test.txt");

        try {
            if (dosya.createNewFile()) {
                System.out.println("Dosya oluşturuldu");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


        System.out.println("Dosya adı: " + dosya.getName());
        System.out.println("Yol: " + dosya.getPath());
        System.out.println("Boyut: " + dosya.length());


        File klasor = new File("yeniKlasor");
        if (klasor.mkdir()) {
            System.out.println("Klasör oluşturuldu");
        }


        File[] dosyalar = klasor.listFiles();
        if (dosyalar != null) {
            for (File f : dosyalar) {
                System.out.println(f.getName());
            }
        }
    }
}