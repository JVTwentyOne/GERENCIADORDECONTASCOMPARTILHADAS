package interfaces;
import entities.Gerenciador;

import java.util.Scanner;

public class TelaInicial {

    private final Gerenciador gerenciador;

    public TelaInicial(Gerenciador gerenciador) {
        this.gerenciador = gerenciador;
    }

    public void exibir() {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("Bem-vindo ao Gerenciador de Contas compartilhadas!");
            System.out.println("Deseja logar ou realizar seu cadastro? Selecione a opção de sua preferência:");
            System.out.println("1- Logar");
            System.out.println("2- Me cadastrar");
            System.out.println("3- Fechar programa");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer

            switch (opcao) {
                case 1:
                    TelaLogin telaLogin = new TelaLogin(gerenciador);
                    telaLogin.exibir();
                    continuar = false; // Após o login, o menu é encerrado
                    break;
                case 2:
                    TelaCadastro telaCadastro = new TelaCadastro(gerenciador);
                    telaCadastro.exibir();
                    continuar = false; // Após o login, o menu é encerrado
                    break;
                case 3:
                    System.out.println("Encerrando o programa.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }
    scanner.close();
    }
}
