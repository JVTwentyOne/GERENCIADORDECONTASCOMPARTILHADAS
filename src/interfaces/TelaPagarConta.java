package interfaces;

import java.util.Scanner;

public class TelaPagarConta {

    public void exibir() {
        Scanner scanner = new Scanner(System.in);

        // Simulação de lógica para verificar repúblicas
        boolean temRepublicas = true; // Mude para false para testar o caso sem repúblicas
        boolean variasRepublicas = false; // Mude para true para testar o caso de múltiplas repúblicas

        if (!temRepublicas) {
            System.out.println("Você não está cadastrado em nenhuma república e por isso não tem nenhuma conta pendente. :)");
            TelaHome telaHome = new TelaHome("Usuário");
            scanner.close();
            telaHome.exibir();
        } else if (variasRepublicas) {
            System.out.println("Informe o nome da república da conta que você deseja pagar:");
            String nomeRepublica = scanner.nextLine();
            System.out.println("Função para pagar conta na república " + nomeRepublica + " ainda não implementada.");
            scanner.close();

        } else {
            System.out.println("Função para pagar conta em sua única república ainda não implementada.");
            scanner.close();
        }

        TelaHome telaHome = new TelaHome("Usuário");
        scanner.close();
        telaHome.exibir();
    }
}
