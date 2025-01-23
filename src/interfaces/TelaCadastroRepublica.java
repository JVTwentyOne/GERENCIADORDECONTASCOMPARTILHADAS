package interfaces;
import java.util.Scanner;
import entities.*;

public class TelaCadastroRepublica {
    private final Gerenciador gerenciador;

    public TelaCadastroRepublica(Gerenciador gerenciador) {
        this.gerenciador = gerenciador;
    }

    public void exibir() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Tela de Cadastro de República ===");

        System.out.print("Digite o nome da República: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o endereço da República: ");
        String endereco = scanner.nextLine();

        if (nome.isEmpty() || endereco.isEmpty()) {
            System.out.println("Erro: Todos os campos são obrigatórios e válidos!");
        } else {
            gerenciador.cadastrarRepublica(nome, endereco);
            System.out.println("República cadastrada com sucesso!");
            TelaRepublicas telaRepublica = new TelaRepublicas(gerenciador);
            telaRepublica.exibir();
        }
    }
}