
public class ContaCorrente extends Conta {

    @SuppressWarnings("FieldMayBeFinal")
    private double taxaOperacao = 0.05;

    public ContaCorrente(String titular, double saldoInicial) {
        super(titular, saldoInicial);
    }

    @Override
    public boolean sacar(double valor) {
        double valorComTaxa = valor + (valor * taxaOperacao);
        return super.sacar(valorComTaxa);
    }

    @Override
    public boolean transferir(double valor, Conta destino) {
        double valorComTaxa = valor + (valor * taxaOperacao);
        return super.transferir(valorComTaxa, destino);
    }
}
