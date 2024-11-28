import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class HashSetAndHashMap {
    public static void main(String[] args) {
        /*HashSet<Integer>sayilar = new HashSet<>();
        sayilar.add(10);
        sayilar.add(20);
        sayilar.add(10);
        System.out.println("sayilar = " + sayilar);

        System.out.println("20 mi var mi ? " + sayilar.contains(20));

        sayilar.remove(10);
        System.out.println("10 mi var mi? " + sayilar.contains(10));
        System.out.println("sayilar = " + sayilar);
        sayilar.clear();
        System.out.println("sayilar = " + sayilar);*/


        HashMap<String, Integer> yaslar= new HashMap<>();
        yaslar.put("Hakan", 35);
        yaslar.put("Emre", 30);
        yaslar.put("Mehmet", 40);
        yaslar.put("Ayşe", 25);

        System.out.println("Hakanin yasi = " + yaslar.get("Hakan"));
        if(yaslar.containsKey("Mehmet")) {
            System.out.println("Mehmet listede var");
        }

        if(yaslar.containsValue(35)) {
            System.out.println("35 yaşında bir kişi var");
        }


  for(String isim : yaslar.keySet()) {
      System.out.println("isim = " + isim);
  }

  for(Integer yas : yaslar.values()) {
      System.out.println("yasi = " + yas);
  }



for(Map.Entry<String, Integer> entry : yaslar.entrySet()) {
    System.out.println("isim = " + entry.getKey() + ", yasi = " + entry.getValue());
}

















    }
}
