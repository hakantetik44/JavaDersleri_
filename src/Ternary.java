public class Ternary {
    public static void main(String[] args) {
        int yas =10;
        String durum = (yas >= 18) ? "Yetişkin" : "Çocuk";
        System.out.println("Durum = " + durum);
        

        if (yas >= 18) {
            durum = "Yetişkin";
        } else {
            durum = "Çocuk";
        }

        System.out.println("durum = " + durum);
    

    }
    
    
    
}
