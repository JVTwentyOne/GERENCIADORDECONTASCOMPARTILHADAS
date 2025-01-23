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

        while (true) { // Loop para permitir novas tentativas de login em caso de falha
            System.out.println("=== Tela de Login ===");
            System.out.println("Informe seu email ou nome de usuário:");
            String usuario = scanner.nextLine();
            System.out.println("Informe sua senha:");
            String senha = scanner.nextLine();

            // Autenticação
            String autUserName = gerenciador.authenticateUser(usuario, senha);

            if (autUserName != null) {
                System.out.println("Login bem-sucedido! Bem-vindo, " + autUserName + "!");
                TelaHome telaHome = new TelaHome(autUserName, gerenciador);
                telaHome.exibir();
                break; // Sai do loop ao fazer login com sucesso
            } else {
                System.out.println("Senha/Email ou nome de usuário inválidos. Tente novamente.");
                System.out.println("1- Tentar novamente");
                System.out.println("2- Voltar ao menu inicial");

                int opcao;
                try {
                    opcao = Integer.parseInt(scanner.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println("Opção inválida! Retornando ao menu inicial.");
                    TelaInicial telaInicial = new TelaInicial(gerenciador);
                    telaInicial.exibir();
                    break;
                }

                if (opcao == 2) {
                    TelaInicial telaInicial = new TelaInicial(gerenciador);
                    telaInicial.exibir();
                    break; // Sai do loop para voltar ao menu inicial
                }
            }
        }
    }
}
