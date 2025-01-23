package interfaces;

import java.util.Scanner;
import entities.User;
import entities.Gerenciador;

public class TelaCadastro {

    private final Gerenciador gerenciador;

    public TelaCadastro(Gerenciador gerenciador) {
        this.gerenciador = gerenciador;
    }

    public void exibir() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo à Tela de Cadastro!");
        System.out.println("Por favor, preencha os seguintes dados:");

        System.out.print("Nome de usuário: ");
        String userName = scanner.nextLine();

        System.out.print("E-mail: ");
        String email = scanner.nextLine();

        System.out.print("Senha: ");
        String password = scanner.nextLine();

        System.out.print("Telefone (opcional): ");
        String phone = scanner.nextLine();

        // Valida se o usuário ou e-mail já está cadastrado
        if (gerenciador.isUserExists(userName, email)) {
            System.out.println("Erro: Nome de usuário ou e-mail já cadastrado.");
            return;
        }

        // Registra o usuário no sistema
        User newUser = new User(userName, email, password, phone);
        gerenciador.registerUser(newUser);

        System.out.println("Cadastro realizado com sucesso!");
    }
}
