package atv1;

class VendaInternacional extends Produto implements Venda {
    private double taxaImportacao;
    private double frete;
    private int quantidade;

    public VendaInternacional(String nome, String categoria, double preco, int estoque,
                              double taxaImportacao, double frete, int quantidade) {
        super(nome, categoria, preco, estoque);
        this.taxaImportacao = taxaImportacao;
        this.frete = frete;
        this.quantidade = quantidade;
    }

    public double getTaxaImportacao() { return taxaImportacao; }
    public double getFrete() { return frete; }
    public int getQuantidade() { return quantidade; }

    private double totalVenda() {
        return getPreco() * quantidade;
    }

    @Override
    public double calcularDesconto() {
        return totalVenda() * 0.05; // 5% do total da venda
    }

    @Override
    public double calcularTotal() {
        return totalVenda() + taxaImportacao + frete - calcularDesconto();
    }

    @Override
    public String toString() {
        return super.toString()
                + "\nTaxa de importação: R$ " + String.format("%.2f", taxaImportacao)
                + "\nFrete: R$ " + String.format("%.2f", frete)
                + "\nQuantidade: " + quantidade;
    }
}