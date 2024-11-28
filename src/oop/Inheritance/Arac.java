package oop.Inheritance;

// Üst sınıf (Base Class)
public class Arac {
    private String marka;
    private String model;
    private int yıl;

    // Constructor (Yapıcı metot)
    public Arac(String marka, String model, int yıl) {
        this.marka = marka;
        this.model = model;
        this.yıl = yıl;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYıl() {
        return yıl;
    }

    public void setYıl(int yıl) {
        this.yıl = yıl;
    }

    public void AracinKısaBilgileri() {
        System.out.println("Marka : " +marka);
        System.out.println("Model : " + model);
        System.out.println("Yıl : " + yıl);
    }

}


