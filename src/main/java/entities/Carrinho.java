package entities;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {
    private List<Produto> produtos;
    private double total;

    public Carrinho() {
        this.produtos = new ArrayList<>();
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public double getTotal() {
        return total;
    }

    public void addProduto(Produto p) {
        produtos.add(p);
    }

    public void removerProduto(Produto p) {
        produtos.remove(p);
    }

    public void calcularTotal() {
        double soma = 0;
        for(Produto p : produtos) {
            soma += p.getValor();
        }
        this.total = soma;
    }
}