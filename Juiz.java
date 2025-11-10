public class Juiz extends PessoaFisica {
    private String matricula;
    private String vara;

    public Juiz(String nome, String telefone, String email, String endereco, 
               String cpf, String rg, String matricula, String vara) {
        super(nome, telefone, email, endereco, cpf, rg);
        this.matricula = matricula;
        this.vara = vara;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getVara() {
        return vara;
    }

    public void setVara(String vara) {
        this.vara = vara;
    }

    @Override
    public String toString() {
        return "Juiz{" +
                "nome='" + getNome() + '\'' +
                ", matricula='" + matricula + '\'' +
                ", vara='" + vara + '\'' +
                ", cpf='" + getCpf() + '\'' +
                ", telefone='" + getTelefone() + '\'' +
                '}';
    }
}
