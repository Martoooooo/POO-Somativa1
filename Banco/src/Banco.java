import banco.Cliente;
import banco.ContaCorrente;

public class Banco {
    public static void main(String[] args) throws Exception {
        Cliente vitor =  new Cliente("Vitor");
        ContaCorrente vitorCorrente = new ContaCorrente(001, 2, vitor);
        vitor.operar(vitorCorrente);
    }
}
