package interfaces;

import java.util.Scanner;

public class TelaHome {

    private final Gerenciador gerenciador;
    private final String userName;

    public TelaHome(String userName, Gerenciador gerenciador) {
        this.userName = userName;
        this.gerenciador = gerenciador;
    }

    public void exibir() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println(userName + " logado, você está na Home! Selecione a opção de sua preferência:");
            System.out.println("1- Relatórios");
            System.out.println("2- Contas");
            System.out.println("3- Repúblicas");
            System.out.println("4- Sair");
            System.out.println("5- Fechar Programa");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    TelaRelatorios telaRelatorios = new TelaRelatorios(gerenciador);
                    telaRelatorios.exibir();
                    break;
                case 2:
                    TelaContas telaContas = new TelaContas(gerenciador);
                    telaContas.exibir();
                    break;
                case 3:
                    TelaRepublicas telaRepublicas = new TelaRepublicas(gerenciador);
                    telaRepublicas.exibir();
                    break;
                case 4:
                    TelaInicial telaInicial = new TelaInicial(gerenciador);
                    telaInicial.exibir();
                    return; // Voltar para a tela inicial
                case 5:
                    System.out.println("Encerrando o programa.");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida! Por favor, tente novamente.");
            }
        }
    }
}
