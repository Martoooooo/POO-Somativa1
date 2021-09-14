package Banco;

import java.util.ArrayList;

public class Cliente {

    private String nome;
    private ArrayList<ContaCorrente> contaCorrentes;


    public Cliente(String nome, ArrayList<ContaCorrente> contaCorrentes) {
        this.nome = nome;
        this.contaCorrentes = contaCorrentes;
    }

    public void operar(){

    }

    public void saldoTotal(){

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
