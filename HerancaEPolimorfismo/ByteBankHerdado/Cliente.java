package HerancaEPolimorfismo.ByteBankHerdado;
public class Cliente{
    //atributos privado no qual não podem ser alterados pelo usuário a não ser através do set
    private String nome;
    private String sobrenome;
    private String cpf;
    private String endereco;

    //getters e setters
    public String getNome(){
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public String getSobrenome() {
        return sobrenome;
    }
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
}

