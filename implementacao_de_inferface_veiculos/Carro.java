package implementacao_de_inferface_veiculos;

class Carro implements Veiculo {
    @Override
    public void acelerar() {
        System.out.println("O carro está acelerando.");
    }
    
    @Override
    public void frear() {
        System.out.println("O carro está freando.");
    }
}
