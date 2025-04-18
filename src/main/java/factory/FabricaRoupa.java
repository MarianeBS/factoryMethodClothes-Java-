package factory;

// Importação da interface:
import roupas.Roupa;

// Criador abstrato
// Essa é a fábrica base.
// O método criarRoupa() é abstrato: ele é o Factory Method.
// O método vestirRoupa() usa esse factory method para obter uma instância da roupa e chamar vestir().
// A fábrica não sabe qual roupa vai ser criada — isso fica a cargo das subclasses.

public abstract class FabricaRoupa {
    public abstract Roupa criarRoupa();

    public String vestirRoupa() {
        Roupa roupa = criarRoupa();
        return roupa.vestir();
    }
}

