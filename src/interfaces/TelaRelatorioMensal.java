package interfaces;

import java.util.Scanner;

public class TelaRelatorioMensal {

    public void exibir() {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Informe o ano (4 dígitos):");
            int ano = scanner.nextInt();

            System.out.println("Informe o mês (2 dígitos):");
            int mes = scanner.nextInt();

            if (mes < 1 || mes > 12) {
                System.out.println("Mês inválido! Por favor, insira um valor entre 1 e 12.");
                exibir(); /
                return;
            }

            System.out.println("Gerando o relatório mensal para " + mes + "/" + ano + "...");

            System.out.println("Função para exibir o relatório mensal ainda não implementada.");

        } catch (Exception e) {
            System.out.println("Entrada inválida! Por favor, tente novamente.");
            scanner.nextLine(); 
            exibir(); 
        } finally {
            System.out.println("Retornando ao menu de relatórios...");
            TelaRelatorios telaRelatorios = new TelaRelatorios();
            telaRelatorios.exibir();
        }
    }
}
