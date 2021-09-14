package Banco;

import java.util.ArrayList;

public class ContaCorrente {

    private int agencia, numero;
    private ArrayList<Transacao> array;
    private Cliente cliente;

    public ContaCorrente(int agencia, int numero, ArrayList<Transacao> array, Cliente cliente) {
        this.agencia = agencia;
        this.numero = numero;
        this.array = array;
        this.cliente = cliente;
    }

    public static void depositar(ArrayList<Transacao> array){

    }

    public static void retirar (ArrayList<Transacao> array){

    }

    public String retornar(){

    }

    public static void extrato(){}

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
