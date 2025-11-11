import java.util.Date;

public class Processo {
    private String numeroProcesso;
    private String descricao;
    private Date dataAbertura;
    private String status;
    private PessoaFisica autor;
    private Pessoa reu;
    private Advogado advogadoResponsavel;

    public Processo(String numeroProcesso, String descricao, Date dataAbertura, 
                    PessoaFisica autor, Pessoa reu, Advogado advogadoResponsavel) {
        this.numeroProcesso = numeroProcesso;
        this.descricao = descricao;
        this.dataAbertura = dataAbertura;
        this.status = "Em andamento";
        this.autor = autor;
        this.reu = reu;
        this.advogadoResponsavel = advogadoResponsavel;
    }

    // Getters e Setters
    public String getNumeroProcesso() {
        return numeroProcesso;
    }

    public void setNumeroProcesso(String numeroProcesso) {
        this.numeroProcesso = numeroProcesso;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(Date dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public PessoaFisica getAutor() {
        return autor;
    }

    public void setAutor(PessoaFisica autor) {
        this.autor = autor;
    }

    public Pessoa getReu() {
        return reu;
    }

    public void setReu(Pessoa reu) {
        this.reu = reu;
    }

    public Advogado getAdvogadoResponsavel() {
        return advogadoResponsavel;
    }

    public void setAdvogadoResponsavel(Advogado advogadoResponsavel) {
        this.advogadoResponsavel = advogadoResponsavel;
    }

    @Override
    public String toString() {
        return "Processo{" +
                "numeroProcesso='" + numeroProcesso + '\'' +
                ", descricao='" + descricao + '\'' +
                ", dataAbertura=" + dataAbertura +
                ", status='" + status + '\'' +
                ", autor=" + autor.getNome() +
                ", reu=" + reu.getNome() +
                ", advogadoResponsavel=" + (advogadoResponsavel != null ? advogadoResponsavel.getNome() : "Nenhum") +
                '}';
    }
}
