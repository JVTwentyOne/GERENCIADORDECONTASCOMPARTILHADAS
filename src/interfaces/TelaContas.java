package interfaces;

import java.util.Scanner;

public class TelaContas {

    private final Gerenciador gerenciador;

    public TelaContas(Gerenciador gerenciador) {
        this.gerenciador = gerenciador;
    }

    public void exibir() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Você está na tela de contas. Selecione a opção de sua preferência:");
        System.out.println("1- Pagar conta");
        System.out.println("2- Criar nova conta");
        System.out.println("3- Excluir conta");
        System.out.println("4- Adicionar novo morador ou entrar em uma nova conta");
        System.out.println("5- Excluir um morador ou sair de uma conta");
        System.out.println("6- Voltar para a Home");
        System.out.println("7- Sair e fechar programa");

        int opcao = scanner.nextInt();
        switch (opcao) {
            case 1:
                TelaPagarConta telaPagarConta = new TelaPagarConta();
                scanner.close();
                telaPagarConta.exibir();
                break;
            case 2:
                scanner.close();
            case 3:
                scanner.close();
            case 4:
                scanner.close();
            case 5:
                System.out.println("Função ainda não implementada.");
                scanner.close();
                exibir();
                break;
            case 6:
                TelaHome telaHome = new TelaHome("Usuário", gerenciador);
                scanner.close();
                telaHome.exibir();
                break;
            case 7:
                System.out.println("Encerrando o programa.");
                scanner.close();
                System.exit(0);
                break;
            default:
                System.out.println("Opção inválida!");
                scanner.close();
                exibir();
        }
    }
}
