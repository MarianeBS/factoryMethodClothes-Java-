package factory;

// Importação de outra classe:
import roupas.Camiseta;
// Importação da interface:
import roupas.Roupa;

// Fábrica concreta
// Cada fábrica sabe qual roupa ela cria.
// Elas sobrescrevem o método criarRoupa() da classe abstrata.
// Assim, encapsulam a lógica de criação da roupa específica.

public class FabricaCamiseta extends FabricaRoupa {
    //Sobrescrevendo o método criarRoupa, tornando-se um criador de camiseta.
    @Override
    public Roupa criarRoupa() {
        return new Camiseta();
    }
}
