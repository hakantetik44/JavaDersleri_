package dosyaIslemleri;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Arrays;
import java.util.List;


public class DosyaIslemleri {
    public static void main(String[] args) {
  //yazma
        try (FileWriter yazici = new FileWriter("deneme.txt")) {
            yazici.write("Merhaba Dünya!\n");
            yazici.write("Java ile dosya işlemleri\n");
            yazici.write("Ben geldim");

        } catch (IOException e) {
            System.out.println("Dosya yazma hatası: " + e.getMessage());
        }

//okuma
        try (BufferedReader okuyucu = new BufferedReader(new FileReader("deneme.txt"))) {
            String satir;
            while ((satir = okuyucu.readLine()) != null) {
                System.out.println(satir);
            }
        } catch (IOException e) {
            System.out.println("Dosya okuma hatası: " + e.getMessage());
        }

//Files
        try {
            Path dosyaYolu = Paths.get("yeni.txt");


            List<String> satirlar = Arrays.asList("Satır 1", "Satır 2", "Satır 3" );
            Files.write(dosyaYolu, satirlar);


            List<String> okunanSatirlar = Files.readAllLines(dosyaYolu);
            okunanSatirlar.forEach(System.out::println);


            Files.copy(dosyaYolu, Paths.get("yedek.txt"), StandardCopyOption.REPLACE_EXISTING);


            Files.delete(dosyaYolu);

        } catch (IOException e) {
            System.out.println("Dosya işlem hatası: " + e.getMessage());
        }
    }
}



