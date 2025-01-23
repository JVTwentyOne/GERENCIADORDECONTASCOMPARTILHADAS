package interfaces;

import java.util.Scanner;

public class TelaPagarConta {

    private final Gerenciador gerenciador;
    private final String userName;

    public TelaPagarConta(String userName, Gerenciador gerenciador) {
        this.userName = userName;
        this.gerenciador = gerenciador;
    }

    public void exibir() {
        Scanner scanner = new Scanner(System.in);

        // Obtém informações dinamicamente (simulação por enquanto)
        boolean temRepublicas = gerenciador.getHouses().size() > 0; // Verifica se o usuário tem repúblicas
        boolean variasRepublicas = gerenciador.getHouses().size() > 1; // Verifica se o usuário tem mais de uma república

        if (!temRepublicas) {
            System.out.println("Você não está cadastrado em nenhuma república e por isso não tem nenhuma conta pendente. :)");
        } else if (variasRepublicas) {
            System.out.println("Você está associado a várias repúblicas. Informe o nome da república para pagar a conta:");
            String nomeRepublica = scanner.nextLine();

            // Lógica para buscar a república pelo nome
            boolean encontrou = false;
            for (House house : gerenciador.getHouses()) {
                if (house.getName().equalsIgnoreCase(nomeRepublica)) {
                    System.out.println("Função para pagar conta na república \"" + nomeRepublica + "\" ainda não implementada.");
                    encontrou = true;
                    break;
                }
            }
            if (!encontrou) {
                System.out.println("República \"" + nomeRepublica + "\" não encontrada.");
            }
        } else {
            System.out.println("Função para pagar conta em sua única república ainda não implementada.");
        }

        System.out.println("Retornando para a Home.");
        TelaHome telaHome = new TelaHome(userName, gerenciador);
        telaHome.exibir();
    }
}
