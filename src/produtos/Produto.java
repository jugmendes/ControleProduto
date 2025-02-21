package produtos;

public abstract class Produto {
    protected int id;
    protected String nome;
    protected double preco;

    public Produto(int id, String nome, double preco) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }
    public double calcularPrecoComImposto() {
        return preco * 1.08;
    }

    public String obterDados(){
        return String.format("ID: %d | Nome: %s | Preço Original: %.2f | Preço com Imposto: %.2f", this.id, this.nome, this.preco, this.calcularPrecoComImposto());
    }
}
