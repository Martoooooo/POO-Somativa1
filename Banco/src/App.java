import Banco.Transacao;

public class App {
    public static void main(String[] args) throws Exception {
        Transacao despesaUm = new Transacao("Comida da Marilene", 10, 100.00f);
        despesaUm.imprimir();
    }
}
