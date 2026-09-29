package aulas.abstract_factory;

public class cliente {
    public static void main(String[] args) {
        // preciso de um produto A1
        iProductA pA = new Factory1().createProductA();

        // preciso de um produto B2
        iProductB pB = new Factory2().createProductB();
    }
}