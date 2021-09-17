import banco.Cliente;
import banco.ContaCorrente;

public class Banco {
    public static void main(String[] args) throws Exception {
        Cliente vitor =  new Cliente("Vitor");
        ContaCorrente vitorCorrente = new ContaCorrente(101, 2, vitor);
        ContaCorrente vitorCorrente1 = new ContaCorrente(101, 2, vitor);
        ContaCorrente vitorCorrente2 = new ContaCorrente(101, 2, vitor);
        vitor.addConta(vitorCorrente);
        vitor.addConta(vitorCorrente1);
        vitor.addConta(vitorCorrente2);
        vitorCorrente.depositar(20);
        vitorCorrente.depositar(20);
        vitorCorrente.depositar(20);
        vitorCorrente.retirar(-20);
        // vitor.operar();
        // vitor.saldoTotal();

        vitor.Imprimir();

        // Método teste para verificar a resposta de quando o retirar é maior que o saldo existente.
        // vitor.operarSacarMaiorSaldo();
        
    }
}
