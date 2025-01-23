package interfaces;

import java.util.Scanner;

public class TelaInicial {

    private final Gerenciador gerenciador;

    public TelaInicial(Gerenciador gerenciador) {
        this.gerenciador = gerenciador;
    }

    public void exibir() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Bem-vindo ao Gerenciador de Contas Compartilhadas!");
            System.out.println("Deseja logar ou realizar seu cadastro? Selecione a opção de sua preferência:");
            System.out.println("1- Logar");
            System.out.println("2- Me cadastrar");
            System.out.println("3- Fechar programa");

            try {
                int opcao = scanner.nextInt();
                scanner.nextLine(); // Limpa o buffer

                switch (opcao) {
                    case 1:
                        TelaLogin telaLogin = new TelaLogin(gerenciador);
                        telaLogin.exibir();
                        return; // Retorna ao chamar TelaLogin para sair do loop
                    case 2:
                        TelaCadastro telaCadastro = new TelaCadastro(gerenciador);
                        telaCadastro.exibir();
                        break;
                    case 3:
                        System.out.println("Encerrando o programa.");
                        scanner.close();
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Opção inválida! Por favor, selecione uma opção entre 1 e 3.");
                }
            } catch (Exception e) {
                System.out.println("Entrada inválida! Por favor, insira um número.");
                scanner.nextLine(); // Limpa o buffer para evitar loops infinitos
            }
        }
    }
}
