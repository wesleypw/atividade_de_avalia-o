import java.util.Date;

public class Resolucao {
    private Processo processo;
    private Juiz juizResponsavel;
    private Date dataResolucao;
    private String decisao;
    private String fundamentacao;

    public Resolucao(Processo processo, Juiz juizResponsavel, String decisao, String fundamentacao) {
        this.processo = processo;
        this.juizResponsavel = juizResponsavel;
        this.dataResolucao = new Date();
        this.decisao = decisao;
        this.fundamentacao = fundamentacao;
        
        // Atualiza o status do processo para encerrado
        processo.setStatus("Encerrado - " + decisao);
    }

    // Getters e Setters
    public Processo getProcesso() {
        return processo;
    }

    public void setProcesso(Processo processo) {
        this.processo = processo;
    }

    public Juiz getJuizResponsavel() {
        return juizResponsavel;
    }

    public void setJuizResponsavel(Juiz juizResponsavel) {
        this.juizResponsavel = juizResponsavel;
    }

    public Date getDataResolucao() {
        return dataResolucao;
    }

    public void setDataResolucao(Date dataResolucao) {
        this.dataResolucao = dataResolucao;
    }

    public String getDecisao() {
        return decisao;
    }

    public void setDecisao(String decisao) {
        this.decisao = decisao;
    }

    public String getFundamentacao() {
        return fundamentacao;
    }

    public void setFundamentacao(String fundamentacao) {
        this.fundamentacao = fundamentacao;
    }

    @Override
    public String toString() {
        return "Resolucao{" +
                "processo=" + processo.getNumeroProcesso() +
                ", juizResponsavel=" + juizResponsavel.getNome() +
                ", dataResolucao=" + dataResolucao +
                ", decisao='" + decisao + '\'' +
                ", fundamentacao='" + fundamentacao + '\'' +
                '}';
    }
}
