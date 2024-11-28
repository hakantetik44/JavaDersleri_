public class ForLoop {
    public static void main(String[] args) {
/*
        for (int i = 0; i < 5; i++) {
            System.out.println("Sayi : " + i);
        }

        int [] sayilar = {1, 2, 3, 4, 5};
        for(int i = 0; i < sayilar.length; i++) {
            System.out.println("Dizi elemani : " + sayilar[i]);
        }

        for(int sayi: sayilar) {
            System.out.println("for-each ile : " + sayi);
        }


        */
        for(int i = 1; i <= 5; i++) {
            for(int j = 1; j <= 5; j++) {
              //  System.out.println("i: " + i + ", j: " + j);
                System.out.println(i + " x " + j + " = " + (i * j));
            }
        }


    }
}
