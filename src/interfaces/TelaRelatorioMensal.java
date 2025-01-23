package interfaces;

import java.util.Scanner;

public class TelaRelatorioMensal {

    public void exibir() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o ano: (4 dígitos)");
        int ano = scanner.nextInt();
        System.out.println("Informe o mês: (2 dígitos)");
        int mes = scanner.nextInt();

        System.out.println("Função para exibir o relatório mensal do mês " + mes + " de " + ano + " ainda não implementada.");

        TelaRelatorios telaRelatorios = new TelaRelatorios();
        scanner.close();
        telaRelatorios.exibir();
    }
}
