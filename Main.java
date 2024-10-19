public class Main {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Roberto");
        Desenvolvedor dev = new Desenvolvedor("Claudio");

        System.out.println("Informções do gerente:");
        System.out.println("nome: " + gerente.nome);
        System.out.println("Função: " + gerente.descreverResponsabilidades());
        System.out.println("Salário: " + gerente.calcularSalario());
        System.out.println("------------------------");
        System.out.println("Informações do desenvolvedor:");
        System.out.println("nome: " + dev.nome);
        System.out.println("Função: " + dev.descreverResponsabilidades());
        System.out.println("Salário: " + dev.calcularSalario());

    }
}