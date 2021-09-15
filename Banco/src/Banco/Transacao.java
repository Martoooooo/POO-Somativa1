package banco;


public class Transacao {

    private String descricao;
    private int data;
    private Float valor;


    public Transacao(String descricao, int data, Float valor) {
        this.descricao = descricao;
        this.data = data;
        this.valor = valor;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getData() {
        return this.data;
    }

    public void setData(int data) {
        this.data = data;
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
