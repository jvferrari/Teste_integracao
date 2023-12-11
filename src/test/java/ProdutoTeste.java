
import entities.Produto;

public class ProdutoTeste {
    public static void main(String[] args) {
        testeCriacaoDeProduto();
        testeAlteracaoQuantidadeProduto();
        testeAlteracaoNomeProduto();
        testeAlteracaoDescricaoProduto();
        testeObtencaoValorProduto();
    }

    public static void testeCriacaoDeProduto() {
        Produto produto = new Produto(1, 10, "Camisa", 29.99, "Camisa de algodão");
        assert produto.getId() == 1;
        assert produto.getQtd() == 10;
        assert produto.getNome().equals("Camisa");
        assert produto.getValor() == 29.99;
        assert produto.getDescricao().equals("Camisa de algodão");
    }

    public static void testeAlteracaoQuantidadeProduto() {
        Produto produto = new Produto(1, 10, "Camisa", 29.99, "Camisa de algodão");
        produto.setQtd(15);
        assert produto.getQtd() == 15;
    }

    public static void testeAlteracaoNomeProduto() {
        Produto produto = new Produto(1, 10, "Camisa", 29.99, "Camisa de algodão");
        produto.setNome("Camisa Nova");
        assert produto.getNome().equals("Camisa Nova");
    }

    public static void testeAlteracaoDescricaoProduto() {

        Produto produto = new Produto(1, 10, "Camisa", 29.99, "Camisa de algodão");
        produto.setDescricao("Nova descrição para a camisa");
        assert produto.getDescricao().equals("Nova descrição para a camisa");
    }

    public static void testeObtencaoValorProduto() {
        double valorEsperado = 29.99;
        Produto produto = new Produto(1, 10, "Camisa", valorEsperado, "Camisa de algodão");
        assert produto.getValor() == valorEsperado;
    }
}
