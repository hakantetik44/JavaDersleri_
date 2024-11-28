package exception;

public class IstisnaOrnekleri {
    public static void main(String[] args) {

        try {
            int [] sayilar = {1, 2, 3};
            System.out.println(sayilar[5]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Dizi sınırları dışına çıkıldı!");

        }catch (Exception e) {
            System.out.println("Bir hata oluştu: " + e.getMessage());
        }
        finally {
            System.out.println("Bu blok her durumda çalışır.");
        }
    }
}
