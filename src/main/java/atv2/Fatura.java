package atv2;

public class Fatura implements Pagamento {

    private String numero;
    private String descricao;
    private int quantidade;
    private double preco;

    public Fatura(String numero, String descricao, int quantidade, double preco) {
        this.numero = numero;
        this.descricao = descricao;
        setQuantidade(quantidade);
        setPreco(preco);
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade > 0 ? quantidade : 0;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco > 0 ? preco : 0;
    }

    @Override
    public double getPagamento() {
        return quantidade * preco;
    }

    @Override
    public String toString() {
        return "Número: " + getNumero()
                + "\nDescrição: " + getDescricao()
                + "\nQuantidade: " + getQuantidade()
                + "\nPreço por item: R$ " + String.format("%.2f", getPreco());
    }
}
