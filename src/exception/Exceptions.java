package exception;

public class Exceptions {
    public static void main(String[] args) {
        try {
            yasKontrol(-5);
        }
        catch (YasHatasi e) {
            System.out.println(e.getMessage());
        }
    }

    public static void yasKontrol(int yas) throws YasHatasi {
        if(yas < 0) {
            throw new YasHatasi("Yas negatif olamaz!");

        }
    }

    static class YasHatasi extends Exception {
        public YasHatasi(String message) {
            super(message);
        }
    }
}
