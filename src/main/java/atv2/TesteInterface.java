package atv2;

public class TesteInterface {
    public static void main(String[] args) {
        Pagamento[] pagamentos = new Pagamento[4];

        pagamentos[0] = new Fatura("001", "Parafuso", 100, 0.50);
        pagamentos[1] = new Fatura("002", "Martelo", 5, 35.90);
        pagamentos[2] = new FuncionarioMensalista("Maria", "Silva", "123.456.789-00", 3200.00);
        pagamentos[3] = new FuncionarioMensalista("João", "Souza", "987.654.321-00", 4500.00);

        for (Pagamento p : pagamentos) {
            System.out.println(p.toString());
            System.out.printf("Valor do pagamento: R$ %.2f%n", p.getPagamento());
            System.out.println("------------------------------");
        }
    }
}
