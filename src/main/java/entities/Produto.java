package entities;

public class Produto {
    private int id;
    private int qtd;
    private String nome;
    private double valor;
    private String descricao;

    public Produto(int id, int qtd, String nome, double valor, String descricao) {
        super();
        this.id = id;
        this.qtd = qtd;
        this.nome = nome;
        this.valor = valor;
        this.descricao = descricao;
    }

    public int getId() {
        return id;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
