package atv1;

public class AplicacaoVendas {
    public static void main(String[] args) {
        VendaNacional nacional = new VendaNacional("Notebook", "Informática", 3500.00, 20, 150.00, 2);
        VendaInternacional internacional = new VendaInternacional("Smartphone", "Eletrônicos", 2800.00, 15, 400.00, 120.00, 3);

        System.out.println("=== Venda Nacional ===");
        System.out.printf("Desconto: R$ %.2f%n", nacional.calcularDesconto());
        System.out.printf("Total: R$ %.2f%n", nacional.calcularTotal());

        System.out.println("\n=== Venda Internacional ===");
        System.out.printf("Desconto: R$ %.2f%n", internacional.calcularDesconto());
        System.out.printf("Total: R$ %.2f%n", internacional.calcularTotal());

        System.out.println("\n=== Atributos (toString) ===");
        System.out.println(nacional.toString());
        System.out.println();
        System.out.println(internacional.toString());
    }
}

