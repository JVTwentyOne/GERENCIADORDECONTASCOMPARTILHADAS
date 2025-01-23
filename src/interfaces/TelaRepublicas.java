package interfaces;

import java.util.Scanner;

public class TelaRepublicas {

    public void exibir() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Você está na tela de repúblicas. Selecione a opção de sua preferência:");
        System.out.println("1- Criar nova República");
        System.out.println("2- Excluir República");
        System.out.println("3- Adicionar novo morador ou entrar em uma nova República");
        System.out.println("4- Excluir um morador ou sair de uma República");
        System.out.println("5- Voltar para a Home");
        System.out.println("6- Sair e fechar programa");

        int opcao = scanner.nextInt();
        switch (opcao) {
            case 1:
                scanner.close();
            case 2:
                scanner.close();
            case 3:
                scanner.close();
            case 4:
                System.out.println("Função ainda não implementada.");
                scanner.close();
                exibir();
                break;
            case 5:
                TelaHome telaHome = new TelaHome("Usuário");
                scanner.close();
                telaHome.exibir();
                break;
            case 6:
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
