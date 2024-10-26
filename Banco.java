
public class Banco {

    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente("Alice", 1000);
        ContaPoupanca cp = new ContaPoupanca("Bob", 1500);

        cc.depositar(500);

        cc.sacar(200);

        cc.transferir(300, cp);

        cp.aplicarRendimento();

        System.out.println("Saldo final Conta Corrente (Alice): R$ " + cc.getSaldo());
        System.out.println("Saldo final Conta Poupança (Bob): R$ " + cp.getSaldo());
    }
}
