public class PessoaFisica extends Pessoa {
    private String cpf;
    private String rg;

    public PessoaFisica(String nome, String telefone, String email, String endereco, String cpf, String rg) {
        super(nome, telefone, email, endereco);
        this.cpf = cpf;
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    @Override
    public String toString() {
        return "PessoaFisica{" +
                "nome='" + getNome() + '\'' +
                ", cpf='" + cpf + '\'' +
                ", rg='" + rg + '\'' +
                ", telefone='" + getTelefone() + '\'' +
                ", email='" + getEmail() + '\'' +
                ", endereco='" + getEndereco() + '\'' +
                '}';
    }
}
