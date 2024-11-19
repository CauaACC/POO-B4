package Ifuncionario_atividade;

public interface Ifuncionario {
    public default double calcularSalario() {
        return 1000;
    }
    public default String descreverResponsabilidades() {
        return "";
    }
}
