package banco;
import java.util.Random;
import java.util.ArrayList;

public class Cliente {

    private String nome;
    private ArrayList<ContaCorrente> contaCorrentes;


    public Cliente(String nome) {
        this.nome = nome;
        this.contaCorrentes = new ArrayList<ContaCorrente>();

    }

    public void addConta(ContaCorrente conta){
        contaCorrentes.add(conta);
    }

    public void operar(){
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
        contaCorrentes.get(0).depositar(20);
        contaCorrentes.get(0).depositar(-40);

    }

    public void saldoTotal(){

        float verificarSaldo = 0; 
        for(int i = 0; i < contaCorrentes.size(); i++){
            verificarSaldo += contaCorrentes.get(i).retornar();
            
        }
        System.out.println(verificarSaldo);
    }

    public void Imprimir(){
        System.out.println("Cliente: " + this.nome);
        for (int i = 0; i < contaCorrentes.size(); i++) {
            contaCorrentes.get(i).imprimirConta();

            System.out.println("---------------------------");

        }




}


















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
