package main.java.list.OperacoesBasicas;

public class Tarefa {
    //atributo
    private String descricao;

    public Tarefa(String descricao) {
        // Corrigindo a atribuição direta ao atributo
        this.descricao = descricao;
    }

    public String getDescricao() {

        return descricao;
    }

    @Override
    public String toString() {
        return descricao;
    }
}