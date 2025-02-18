package interfaces;

import entities.Gerenciador;
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
        scanner.nextLine(); // Consumir a quebra de linha após a entrada

        switch (opcao) {
            case 1:
                // Aqui você precisa passar o Gerenciador e o nome do usuário para o construtor
                String userName = "Usuário"; // Este valor deve vir de algum lugar no seu sistema
                TelaPagarConta telaPagarConta = new TelaPagarConta(userName, gerenciador);
                telaPagarConta.exibir();
                break;

            case 2:
                System.out.println("Função de criar nova conta ainda não implementada.");
                break;

            case 3:
                System.out.println("Função de excluir conta ainda não implementada.");
                break;

            case 4:
                System.out.println("Função de adicionar novo morador ainda não implementada.");
                break;

            case 5:
                System.out.println("Função de excluir morador ainda não implementada.");
                break;

            case 6:
                TelaHome telaHome = new TelaHome("Usuário", gerenciador);
                telaHome.exibir();
                break;

            case 7:
                System.out.println("Encerrando o programa.");
                System.exit(0);
                break;

            default:
                System.out.println("Opção inválida! Tente novamente.");
        }

        scanner.close();
    }
}
