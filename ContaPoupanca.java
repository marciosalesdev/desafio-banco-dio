
public class ContaPoupanca extends Conta {

    @SuppressWarnings("FieldMayBeFinal")
    private double rendimento = 0.02; // 2% de rendimento

    public ContaPoupanca(String titular, double saldoInicial) {
        super(titular, saldoInicial);
    }

    public void aplicarRendimento() {
        double rendimentoAplicado = getSaldo() * rendimento;
        depositar(rendimentoAplicado);
        System.out.println("Rendimento de R$ " + rendimentoAplicado + " aplicado com sucesso!");
    }
}
