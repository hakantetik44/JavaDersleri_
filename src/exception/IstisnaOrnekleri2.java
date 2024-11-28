package exception;

public class IstisnaOrnekleri2 {
    public static void main(String[] args) {

        try {
            String sayi = "abc";
            int x = Integer.parseInt(sayi);
        }
        catch (NumberFormatException e) {
            System.out.println("Sayı dönüşümü hatası!");
        } catch (Exception e) {
            System.out.println("Genel hata !");
        }
    }
}
