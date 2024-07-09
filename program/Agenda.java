package program;
import java.util.ArrayList;
import entities.Conteudo;
import programa.Tarefa;

public class Agenda {
    private ArrayList<Tarefa> tarefas;
    private ArrayList<Conteudo> conteudos;

    public Agenda() {
        this.tarefas = new ArrayList<>();
        this.conteudos = new ArrayList<>();
        inicializarConteudos();
    }

    private void inicializarConteudos() {
        conteudos.add(new Conteudo("Introdução ao Java", "Fundamentos da linguagem Java, história, sintaxe básica."));
        conteudos.add(new Conteudo("Programação Orientada a Objetos", "Conceitos de classes, objetos, herança, polimorfismo."));
        conteudos.add(new Conteudo("Estruturas de Dados", "Listas, pilhas, filas, árvores e grafos."));
        conteudos.add(new Conteudo("Coleções em Java", "Uso de ArrayList, HashSet, HashMap, entre outros."));
        conteudos.add(new Conteudo("Tratamento de Exceções", "Como lidar com exceções usando try, catch, finally."));
        conteudos.add(new Conteudo("Entrada e Saída", "Trabalhando com arquivos e fluxo de dados."));
        conteudos.add(new Conteudo("Threads e Concorrência", "Trabalhando com múltiplas threads e sincronização."));
        conteudos.add(new Conteudo("Bibliotecas e APIs", "Uso de bibliotecas padrão e externas."));
        conteudos.add(new Conteudo("Desenvolvimento de Aplicações Web", "Introdução ao desenvolvimento de aplicações web com Java."));
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

    public void listarConteudos() {
        if (conteudos.isEmpty()) {
            System.out.println("Nenhum conteúdo disponível.");
        } else {
            for (Conteudo conteudo : conteudos) {
                System.out.println(conteudo);
                System.out.println("------------");
            }
        }
    }

    public Conteudo getConteudoPorNome(String nome) {
        for (Conteudo conteudo : conteudos) {
            if (conteudo.getNome().equalsIgnoreCase(nome)) {
                return conteudo;
            }
        }
        return null;
    }

	public void adicionarTarefa(entities.Tarefa tarefa) {
		// TODO Auto-generated method stub
		
	}
}
