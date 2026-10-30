package atv1;

public class VendaNacional extends Produto implements Venda{

    private double imposto;
    private int quantidade;
    public VendaNacional(String nome, String categoria, double preco, int estoque, double imposto, int quantidade){
        super(nome, categoria, preco, estoque);
        this.imposto = imposto;
        this.quantidade = quantidade;
    }

    public double getImposto() {
        return imposto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    private double totalVenda(){
        return getPreco() * quantidade;
    }

    @Override
    public double calcularDesconto() {
        return totalVenda() * 0.1;
    }

    @Override
    public double calcularTotal() {
        return totalVenda() + imposto - calcularDesconto();
    }

    @Override
    public String toString(){
        return super.toString() + "\nImposto: R$" + String.format("%.2f", imposto)
                + "\nQuantidade: " + quantidade;
    }
}
