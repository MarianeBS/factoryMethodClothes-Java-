import factory.FabricaCalca;
import factory.FabricaCamiseta;
import factory.FabricaJaqueta;
import factory.FabricaRoupa;

// Código cliente
public class Main {
    public static void main(String[] args) {
        FabricaRoupa fabrica;

        fabrica = new FabricaCamiseta();
        System.out.println(fabrica.vestirRoupa());

        fabrica = new FabricaCalca();
        System.out.println(fabrica.vestirRoupa());

        fabrica = new FabricaJaqueta();
        System.out.println(fabrica.vestirRoupa());
    }
}
