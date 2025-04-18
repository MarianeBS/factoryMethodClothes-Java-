package factory;

// Importação de outra classe:
import roupas.Jaqueta;
// Importação da interface:
import roupas.Roupa;

// Fábrica concreta
// Cada fábrica sabe qual roupa ela cria.
// Elas sobrescrevem o método criarRoupa() da classe abstrata.
// Assim, encapsulam a lógica de criação da roupa específica.

public class FabricaJaqueta extends FabricaRoupa {
    //Sobrescrevendo o método criarRoupa, tornando-se um criador de jaqueta.
    @Override
    public Roupa criarRoupa() {
        return new Jaqueta();
    }
}

