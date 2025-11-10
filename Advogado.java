public class Advogado extends PessoaFisica {
    private String oab;
    private String especialidade;

    public Advogado(String nome, String telefone, String email, String endereco, 
                   String cpf, String rg, String oab, String especialidade) {
        super(nome, telefone, email, endereco, cpf, rg);
        this.oab = oab;
        this.especialidade = especialidade;
    }

    public String getOab() {
        return oab;
    }

    public void setOab(String oab) {
        this.oab = oab;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    @Override
    public String toString() {
        return "Advogado{" +
                "nome='" + getNome() + '\'' +
                ", oab='" + oab + '\'' +
                ", especialidade='" + especialidade + '\'' +
                ", cpf='" + getCpf() + '\'' +
                ", telefone='" + getTelefone() + '\'' +
                ", email='" + getEmail() + '\'' +
                '}';
    }
}
