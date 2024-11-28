package oop.Abstract;

abstract class DenizHayvani {

    public abstract void yuzme();

    public void beslenme() {
        System.out.println("Deniz hayvanı besleniyor.");
    }
}

class Ahtapot extends DenizHayvani {
    @Override
    public void yuzme() {
        System.out.println("Ahtapot hizli yuzuyor.");
    }
}

class Balina extends DenizHayvani {
    @Override
    public void yuzme() {
        System.out.println("Balina yavasça yuzuyor.");
    }
}

public class DenizHayvanlariTest {

    public static void main(String[] args) {
        DenizHayvani ahtapot = new Ahtapot();
        DenizHayvani balina = new Balina();

        ahtapot.beslenme();
        balina.beslenme();

        ahtapot.yuzme();
        balina.yuzme();

    }



}