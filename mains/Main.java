package mains;

import java.util.Scanner;

import entities.Tarefa;
import program.Agenda;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Agenda agenda = new Agenda();

        while (true) {
            System.out.println("1. Adicionar Tarefa");
            System.out.println("2. Remover Tarefa");
            System.out.println("3. Listar Tarefas");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();  // Consumir a nova linha

            switch (opcao) {
                case 1:
                    System.out.print("Nome da Tarefa: ");
                    String nome = scanner.nextLine();
                    System.out.print("Descrição: ");
                    String descricao = scanner.nextLine();
                    System.out.print("Data (dd/mm/aaaa): ");
                    String data = scanner.nextLine();
                    Tarefa tarefa = new Tarefa(nome, descricao, data);
                    agenda.adicionarTarefa(tarefa);
                    break;
                case 2:
                    System.out.print("Nome da Tarefa a ser removida: ");
                    String nomeParaRemover = scanner.nextLine();
                    agenda.removerTarefa(nomeParaRemover);
                    break;
                case 3:
                    agenda.listarTarefas();
                    break;
                case 4:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
