
public class Venda {
    private long notaFiscal;
    private double valorTotalVenda;
    
    public Venda(long notaFiscal, double valorTotalVenda){
        this.notaFiscal = notaFiscal;
        this.valorTotalVenda = valorTotalVenda;
    }   

    public long getNotaFiscal(){
        return notaFiscal;
    }
    
    public void setNotaFiscal(long notaFiscal){
        this.notaFiscal = notaFiscal;
    }
    
    public double getValorTotalVenda(){
        return valorTotalVenda;
    }
    
    public void setValorTotalVenda(double valorTotalVenda){
        this.valorTotalVenda = valorTotalVenda;
    }

    @Override
    public String toString(){
        return "Venda [notaFiscal=" + notaFiscal + ", valorTotalVenda=" + valorTotalVenda + "]";
    }



}
