package oop.Inheritance;
// Alt sınıf
public class Motorsiklet extends Arac{
    private int vitesSayısı;


    public Motorsiklet(String marka, String model, int yıl,int vitesSayısı) {
        super(marka, model, yıl);// Üst sınıfın constructor'ını çağırır
        this.vitesSayısı = vitesSayısı;
    }

    public int getVitesSayısı() {
        return vitesSayısı;
    }

    public void setVitesSayısı(int vitesSayısı) {
        this.vitesSayısı = vitesSayısı;
    }


    public void surusDeneyimi(){
        System.out.println(getMarka() + " " + getModel() + " motoru " + vitesSayısı + " vitesli bir araçtir");
    }

    @Override
    public void AracinKısaBilgileri() {
        super.AracinKısaBilgileri();
        System.out.println("Vites Sayısı : " + vitesSayısı);
    }
}
