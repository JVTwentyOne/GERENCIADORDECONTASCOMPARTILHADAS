import interfaces.TelaInicial;
import entities.Gerenciador;

public class App {

    public static void main(String[] args) {
        Gerenciador gerenciador = new Gerenciador(); // Cria uma instância de Gerenciador
        TelaInicial telaInicial = new TelaInicial(gerenciador);
        telaInicial.exibir();
    }
}
