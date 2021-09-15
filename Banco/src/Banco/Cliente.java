package banco;

import java.util.ArrayList;

public class Cliente {

    private String nome;
    private ArrayList<ContaCorrente> contaCorrentes;


    public Cliente(String nome) {
        this.nome = nome;
        this.contaCorrentes = new ArrayList<ContaCorrente>();

    }

    public void operar(ContaCorrente conta){
        
        conta.depositar(100f);
        conta.retirar(-10f);
        conta.retirar(-10f);
        conta.retirar(-10f);
        conta.retirar(-10f);
        conta.retornar();
        conta.extrato();

    }

    public void saldoTotal(ContaCorrente conta){

    }

    public void Imprimir(){

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
