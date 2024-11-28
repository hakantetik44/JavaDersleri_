package oop.Inheritance;

public class InheritanceTest {
    public static void main(String[] args) {

        Motorsiklet motorSiklet1 = new Motorsiklet("Bmw", "Mustang", 2025, 8);


        motorSiklet1.AracinKısaBilgileri();
        motorSiklet1.surusDeneyimi();

        motorSiklet1.setMarka("Honda");
        motorSiklet1.setModel("CBR500R");
        motorSiklet1.AracinKısaBilgileri();
        motorSiklet1.surusDeneyimi();

    }
}
