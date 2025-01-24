package interfaces;
import entities.Gerenciador;
import entities.User;
import java.util.Scanner;

public class TelaCadastro {
    private final Gerenciador gerenciador;

    public TelaCadastro(Gerenciador gerenciador) {
        this.gerenciador = gerenciador;
    }
    public void exibir() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Tela de Cadastro ===");
        System.out.println("Digite os dados do novo usuário:");

        System.out.print("Digite o ID: ");
        String id = scanner.nextLine();

        System.out.print("Digite o nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o email: ");
        String email = scanner.nextLine();

        System.out.print("Digite a senha: ");
        String senha = scanner.nextLine();

        System.out.print("Digite o telefone: ");
        String phone = scanner.nextLine();

        if (nome.isEmpty() || email.isEmpty() || senha.isEmpty()) {
            System.out.println("Erro: Todos os campos são obrigatórios!");
        } else {
            User novoUsuario = new User(id,nome, email, senha,phone);
            Gerenciador.cadastrarUsuario(novoUsuario);
            System.out.println("Usuário cadastrado com sucesso!");
            TelaInicial telaInicial = new TelaInicial(gerenciador);
            telaInicial.exibir();
        }

        scanner.close();
    }

    
}