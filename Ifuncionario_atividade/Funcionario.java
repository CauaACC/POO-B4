package Ifuncionario_atividade;

abstract class Funcionario implements Ifuncionario {
    String nome;

    public Funcionario(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}