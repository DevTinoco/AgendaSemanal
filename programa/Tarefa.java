package programa;
public class Tarefa {
    private String nome;
    private String descricao;
    private String data;
    
    public Tarefa(String nome, String descricao, String data) {
        this.nome = nome;
        this.descricao = descricao;
        this.data = data;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getData() {
        return data;
    }

    @Override
    public String toString() {
        return "Tarefa: " + nome + "\nDescrição: " + descricao + "\nData: " + data;
    }
}
