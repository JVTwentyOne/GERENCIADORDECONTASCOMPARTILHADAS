package interfaces;

import java.util.Scanner;
import entities.Gerenciador;

public class TelaRelatorios {

    private final Gerenciador gerenciador;

    public TelaRelatorios(Gerenciador gerenciador) {
        this.gerenciador = gerenciador;
    }

    public void exibir() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Você está na tela de relatórios. Selecione a opção de sua preferência:");
        System.out.println("1- Verificar contas pendentes");
        System.out.println("2- Visualizar relatório mensal");
        System.out.println("3- Voltar para a Home");
        System.out.println("4- Sair e fechar programa");

        int opcao = scanner.nextInt();
        switch (opcao) {
            case 1:
                System.out.println("Função para verificar contas pendentes ainda não implementada.");
                scanner.close();
                exibir();
                break;
            case 2:
                TelaRelatorioMensal telaRelatorioMensal = new TelaRelatorioMensal();
                scanner.close();
                telaRelatorioMensal.exibir();
                break;
            case 3:
                TelaHome telaHome = new TelaHome("Usuário"); // Passar nome do usuário real
                scanner.close();
                telaHome.exibir();
                break;
            case 4:
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
