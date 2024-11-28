import java.util.ArrayList;
import java.util.Arrays;

public class ArraysDiziler {
    public static void main(String[] args) {
      /*  int[] sayilar = new int[5];
        int[] hazirDizi = {1, 2, 3, 4, 5};  // Başlangıç değerleriyle

        sayilar[0] =10;
        System.out.println("ilk eleman : " + sayilar[0]);
        sayilar[1] =20;
        sayilar[2] =30;

        System.out.println("Dizi uzunlugu:"+sayilar.length);


        int[]kopya =hazirDizi.clone();
//veya
        int[] kopya2 = Arrays.copyOf(hazirDizi, hazirDizi.length);


        Arrays.sort(hazirDizi);

        System.out.println(Arrays.toString(hazirDizi));

*/
        ArrayList<String> isimler = new ArrayList<>();
        isimler.add("Hakan");
        isimler.add("Emre");
        isimler.add("Mehmet");
        isimler.add("Ayşe");

        System.out.println("isimler = " + isimler);
        isimler.add(1,"Fatma");

        System.out.println("isimler = " + isimler);

        isimler.remove(2);

        System.out.println("isimler = " + isimler);


        isimler.set(0, "Selim");

        System.out.println("isimler = " + isimler);

        System.out.println("İlk isim: " + isimler.get(0));
        System.out.println("Bos mu = " + isimler.isEmpty());
        System.out.println("Boyut: " + isimler.size());

        
        
        for (String isim : isimler) {
            System.out.println("isim = " + isim);
        }



























    }
}
