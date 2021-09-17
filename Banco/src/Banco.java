import banco.Cliente;
import banco.ContaCorrente;

public class Banco {
    public static void main(String[] args) throws Exception {
        Cliente vitor =  new Cliente("Vitor");
        Cliente martin = new Cliente("Martin");
        Cliente natan = new Cliente("Natan");

        ContaCorrente vitorCorrente = new ContaCorrente(101, 2, vitor);
        ContaCorrente vitorCorrente1 = new ContaCorrente(101, 3, vitor);
        ContaCorrente vitorCorrente2 = new ContaCorrente(101, 4, vitor);
        vitor.addConta(vitorCorrente);
        vitor.addConta(vitorCorrente1);
        vitor.addConta(vitorCorrente2);

        ContaCorrente martinCorrente = new ContaCorrente(102, 5, martin);
        ContaCorrente martinCorrente1 = new ContaCorrente(102, 6, martin);
        martin.addConta(martinCorrente);
        martin.addConta(martinCorrente1);

        ContaCorrente natanCorrente = new ContaCorrente(103, 7, natan);
        ContaCorrente natanCorrente1 = new ContaCorrente(103, 8, natan);
        natan.addConta(natanCorrente);
        natan.addConta(natanCorrente1);

        vitor.Imprimir();
        vitor.operar();
        martin.Imprimir();
        martin.operar();
        natan.Imprimir();
        natan.operar();

        // Método teste para verificar a resposta de quando o retirar é maior que o saldo existente.
        // vitor.operarSacarMaiorSaldo();

    }
}
