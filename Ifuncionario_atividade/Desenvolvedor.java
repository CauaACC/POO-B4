package Ifuncionario_atividade;

public class Desenvolvedor extends Funcionario {

    public Desenvolvedor (String nome) {
        super(nome);
    }

    @Override
    public double calcularSalario() {
        return 1500;
    }

    @Override
    public String descreverResponsabilidades() {
        return "Desenvolver";
    }

}