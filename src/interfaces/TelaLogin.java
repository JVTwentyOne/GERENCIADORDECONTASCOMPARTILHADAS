package interfaces;

import src.Gerenciador;
import java.util.Scanner;

public class TelaLogin {

    private final Gerenciador gerenciador;

    public TelaLogin(Gerenciador gerenciador) {
        this.gerenciador = gerenciador;
    }

    public void exibir() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe seu email ou nome de usuário:");
        String usuario = scanner.nextLine();
        System.out.println("Informe sua senha:");
        String senha = scanner.nextLine();

        String autUserName = gerenciador.authenticateUser(usuario, senha);

        // Chama authenticateUser para validar as credenciais
        if (autUserName != null) {
            TelaHome telaHome = new TelaHome(autUserName, gerenciador);
            telaHome.exibir();
        } else {
            System.out.println("Senha/Email ou nome de usuário inválidos.");
            TelaInicial telaInicial = new TelaInicial(gerenciador);
            telaInicial.exibir();
        }

        scanner.close(); // Fechar o Scanner ao final, após todas as interações
    }
}
