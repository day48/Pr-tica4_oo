import br.com.contabguiada.Conta;
import br.com.contabguiada.ContaPoupanca;

public class Main {
    public static void main(String[] args) {
        Conta cp = new ContaPoupanca();
        cp.setSaldo(2021);
        cp.imprimeExtrato();
    }
}