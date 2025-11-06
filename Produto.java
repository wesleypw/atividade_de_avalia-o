public class Produto {
     private String nomeProduto;
     private double valorUnitario;
     private int quantidade;

     public Produto(String nomeProduto, double valorUnitario, int quantidade){
         this.nomeProduto = nomeProduto;
         this.valorUnitario = valorUnitario;
         this.quantidade = quantidade;
     }
     
     public String getNomeProduto(){
         return nomeProduto;
     }
     public void setNomeProduto(String nomeProduto){
         this.nomeProduto = nomeProduto;
     }
     
     public double getValorUnitario(){
         return valorUnitario;
     }
     public void setValorUnitario(double valorUnitario){
         this.valorUnitario = valorUnitario;
     }
     
     public int getQuantidade(){
         return quantidade;
     }
     public void setQuantidade(int quantidade){
         this.quantidade = quantidade;
     }
     
     public double calcularValorTotal(){
         return valorUnitario * quantidade;
     }
     
     @Override
     public String toString(){
         return "Produto [nomeProduto=" + nomeProduto + ", valorUnitario=" + valorUnitario + ", quantidade=" + quantidade + "]";
     }
}
