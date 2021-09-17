package banco;

import java.util.ArrayList;

public class ContaCorrente {

    private int agencia, numero;
    private ArrayList<Transacao> array; 
    private Cliente cliente;


    public ContaCorrente(int agencia, int numero, Cliente cliente) {
        assert(agencia > 0);
        this.agencia = agencia;

        assert(numero > 0);
        this.numero = numero;

        this.array = new ArrayList<Transacao>();
        this.cliente = cliente;
    }

    public void depositar(float valor){
        Transacao trans = new Transacao("Deposito", valor);
        assert(valor > 0);
        array.add(trans);
    }

    public void retirar (float valor){
        Transacao trans = new Transacao("Saque", valor);
        assert(valor < 0);
        if((valor * (-1)) > retornar()){
            float valorRetirado = retornar() * -1;
            trans.setValor(valorRetirado);
        }
        array.add(trans);
    }

    public float retornar(){
        float saldo = 0;
        for(int i = 0; i < array.size(); i++){
            saldo += array.get(i).getValor();
        }
        return saldo;
    }

    public void extrato(){
        System.out.println("Extrato do(a) cliente: "+ cliente.getNome() + ", conta: " + this.numero + ", agência: " + this.agencia);
        System.out.println("--------------------------------------------");
        for(int i = 0; i < array.size(); i++){
            array.get(i).imprimir();
        }
        
        System.out.println("Saldo da conta: "+ retornar());
        System.out.println("-----------------------------");
            
    }

    public void imprimirConta() {
        System.out.println("Agencia: "+getAgencia());
        System.out.println("Numero da conta: " + getNumero());
    }

    
    
    
    
    
    
    
    
    
    
    public int getAgencia() {
        return agencia;
    }
    
    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public ArrayList<Transacao> getArray() {
        return array;
    }

    public void setArray(ArrayList<Transacao> array) {
        this.array = array;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
