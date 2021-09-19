package banco;
import java.util.Random;
import java.util.ArrayList;

public class Cliente {

    // Atributos

    private String nome;
    private ArrayList<ContaCorrente> contaCorrentes;

    // Construtor

    public Cliente(String nome) {
        this.nome = nome;
        this.contaCorrentes = new ArrayList<ContaCorrente>();

    }

    // Métodos
    
    public void addConta(ContaCorrente conta){
        contaCorrentes.add(conta);
    }

    public void operar(){
        assert(contaCorrentes.size() > 0);
        Random random = new Random();
        int numero = random. nextInt(10000); 
        int numero2 = random. nextInt(10000);

        for(int i = 0; i < contaCorrentes.size(); i++){
            contaCorrentes.get(i).depositar(numero);
            contaCorrentes.get(i).retirar(numero2 * -1);
            contaCorrentes.get(i).retornar();
            contaCorrentes.get(i).extrato();
            numero = random. nextInt(10000);
            numero2 = random. nextInt(10000);
        }

    }

    public void operarSacarMaiorSaldo(){
        assert(contaCorrentes.size() > 0);
        contaCorrentes.get(0).depositar(20);
        contaCorrentes.get(0).retirar(-40);
        contaCorrentes.get(0).extrato();

    }

    public void saldoTotal(){

        float verificarSaldo = 0; 
        for(int i = 0; i < contaCorrentes.size(); i++){
            verificarSaldo += contaCorrentes.get(i).retornar();
            
        }
        System.out.println(verificarSaldo);
    }

    public void imprimir(){
        System.out.println("Cliente: " + this.nome);
        for (int i = 0; i < contaCorrentes.size(); i++) {
            contaCorrentes.get(i).imprimirConta();

            System.out.println("---------------------------");

        }
    }

    // Gets e sets

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<ContaCorrente> getContaCorrentes() {
        return contaCorrentes;
    }

    public void setContaCorrentes(ArrayList<ContaCorrente> contaCorrentes) {
        this.contaCorrentes = contaCorrentes;
    }


}
