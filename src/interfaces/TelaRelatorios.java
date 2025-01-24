package interfaces;

import java.util.Scanner;
import entities.Gerenciador;
import entities.House;

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
                exibir();
                break;
            case 2:
                TelaRelatorioMensal telaRelatorioMensal = new TelaRelatorioMensal(gerenciador);
                telaRelatorioMensal.exibir();
                break;
            case 3:
                TelaHome telaHome = new TelaHome("Usuário", gerenciador); // Passar nome do usuário real
                telaHome.exibir();
                break;
            case 4:
                System.out.println("Encerrando o programa.");
                System.exit(0);
                break;
            default:
                System.out.println("Opção inválida!");
                exibir();
        }
    }
}
