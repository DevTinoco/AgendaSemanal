package main;

import java.util.Scanner;

import entities.Conteudo;
import program.Agenda;
import programa.Tarefa;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Agenda agenda = new Agenda();

        while (true) {
            System.out.println("1. Adicionar Tarefa");
            System.out.println("2. Remover Tarefa");
            System.out.println("3. Listar Tarefas");
            System.out.println("4. Listar Conteúdos de Estudo");
            System.out.println("5. Adicionar Conteúdo de Estudo à Tarefa");
            System.out.println("6. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();  // Consumir a nova linha

            switch (opcao) {
                case 1:
                    System.out.print("Nome da Tarefa: ");
                    String nomeTarefa = scanner.nextLine();
                    System.out.print("Descrição: ");
                    String descricaoTarefa = scanner.nextLine();
                    System.out.print("Data (dd/mm/aaaa): ");
                    String dataTarefa = scanner.nextLine();
                    Tarefa tarefa = new Tarefa(nomeTarefa, descricaoTarefa, dataTarefa);
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
                    agenda.listarConteudos();
                    break;
                case 5:
                    agenda.listarConteudos();
                    System.out.print("Escolha um conteúdo pelo nome: ");
                    String nomeConteudo = scanner.nextLine();
                    Conteudo conteudo = agenda.getConteudoPorNome(nomeConteudo);
                    if (conteudo != null) {
                        System.out.print("Nome da Tarefa: ");
                        String nomeTarefaConteudo = scanner.nextLine();
                        System.out.print("Data (dd/mm/aaaa): ");
                        String dataTarefaConteudo = scanner.nextLine();
                        Tarefa tarefaConteudo = new Tarefa(nomeTarefaConteudo, conteudo.getDescricao(), dataTarefaConteudo);
                        agenda.adicionarTarefa(tarefaConteudo);
                    } else {
                        System.out.println("Conteúdo não encontrado.");
                    }
                    break;
                case 6:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
