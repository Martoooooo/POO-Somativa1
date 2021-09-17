package banco;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Transacao {

    private String descricao;
    private LocalDate data= LocalDate.now();
    private Float valor;
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    String dataFormatado = this.data.format(formatter);

    public Transacao(String descricao, Float valor) {
        this.descricao = descricao;
        this.valor = valor;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getData() {
        return dataFormatado;
    }

    public void setData(int ano, int mes, int dia) {
        this.data = LocalDate.of(ano, mes, dia);
    }

    public Float getValor() {
        return this.valor;
    }

    public void setValor(Float valor) {
        this.valor = valor;
    }

    public void imprimir() {
        System.out.println("Data da transação: "+ getData());
        System.out.println("Descrição: "+ getDescricao());
        System.out.println("Valor: R$ "+ getValor());        
    }
}
