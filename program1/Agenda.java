package program1;

import java.util.ArrayList;

import entities.Tarefa;

public class Agenda {
    private ArrayList<Tarefa> tarefas;

    public Agenda() {
        this.tarefas = new ArrayList<>();
    }

    public void adicionarTarefa(Tarefa tarefa) {
        tarefas.add(tarefa);
    }

    public void removerTarefa(String nome) {
        Tarefa tarefaParaRemover = null;
        for (Tarefa tarefa : tarefas) {
            if (tarefa.getNome().equalsIgnoreCase(nome)) {
                tarefaParaRemover = tarefa;
                break;
            }
        }
        if (tarefaParaRemover != null) {
            tarefas.remove(tarefaParaRemover);
            System.out.println("Tarefa removida com sucesso!");
        } else {
            System.out.println("Tarefa não encontrada.");
        }
    }

    public void listarTarefas() {
        if (tarefas.isEmpty()) {
            System.out.println("Nenhuma tarefa agendada.");
        } else {
            for (Tarefa tarefa : tarefas) {
                System.out.println(tarefa);
                System.out.println("------------");
            }
        }
    }
}
