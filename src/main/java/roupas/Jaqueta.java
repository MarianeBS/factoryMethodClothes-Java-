package roupas;

// Produto concreto
//Cada uma implementa a interface Roupa.
//Elas definem o comportamento específico de cada tipo de roupa.

public class Jaqueta implements Roupa {
    @Override
    public String vestir() {
        return "Vestindo uma jaqueta.";
    }
}

