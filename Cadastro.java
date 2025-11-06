import java.util.ArrayList;
import java.util.List;

public class Cadastro {
    private List<Produto> produtos = new ArrayList<>();
    private List<Pessoa> pessoas = new ArrayList<>();
    private List<Venda> vendas = new ArrayList<>();

    public void adicionarProduto(Produto produto){
        produtos.add(produto);
    }
    public void adicionarPessoa(Pessoa pessoa){
        pessoas.add(pessoa);
    }
    
    public void listarProdutos(){
        for(Produto produto : produtos){
            System.out.println(produto);
        }
    }
    public void listarPessoas(){
        for(Pessoa pessoa : pessoas){
            System.out.println(pessoa);
        }
    }
    
    public void adicionarVenda(Venda venda) {
        vendas.add(venda);
    }
    
    public double calcularTotalVendas() {
        double total = 0;
        System.out.println("Total de vendas: ");
        for (Venda venda : vendas) {
            total += venda.getValorTotalVenda();
            System.out.println(venda);
        }
        return total;
    }
}
