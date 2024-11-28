package exception;

public class NullPointerExceptionExample {
    public static void main(String[] args) {
        String str = null;
        try {
            System.out.println(str.length()); // Hata: str null
        } catch (NullPointerException e) {
            System.out.println("NullPointerException: Null bir nesneye erişilemez.");
        }
    }
}
