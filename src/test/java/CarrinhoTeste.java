import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import entities.Produto;
import entities.Carrinho;
import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

public class CarrinhoTeste {
    private Produto p1;
    private Produto p2;
    private Carrinho c;

    @Before
    public void setUp() {
        c = new Carrinho();
        p1 = mock(Produto.class);
        p2 = mock(Produto.class);
        when(p1.getId()).thenReturn(1);
        when(p1.getQtd()).thenReturn(5);
        when(p1.getNome()).thenReturn("TV");
        when(p1.getValor()).thenReturn(1200.00);
        when(p1.getDescricao()).thenReturn("TV 30 polegadas samsung");

        when(p2.getId()).thenReturn(2);
        when(p2.getQtd()).thenReturn(10);
        when(p2.getNome()).thenReturn("Iphone");
        when(p2.getValor()).thenReturn(5000.00);
        when(p2.getDescricao()).thenReturn("Iphone 15 novo");
    }

    @Test
    public void testAddProduto() {
        c.addProduto(p1);
        List<Produto> produtos = c.getProdutos();
        assertEquals(Arrays.asList(p1), produtos);
    }

    @Test
    public void testRemoverProduto(){
        c.addProduto(p1);
        c.removerProduto(p1);
        List<Produto> produtos = c.getProdutos();
        assertEquals(Arrays.asList(), produtos);
    }

    @Test
    public void testCalcularTotal(){
        c.addProduto(p1);
        c.addProduto(p2);
        c.calcularTotal();
        assertEquals(6200.00, c.getTotal(),0);
    }
}
