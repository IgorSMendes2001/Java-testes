package HerancaEPolimorfismo;
//não pode instanciar objetos da classe abstrata
public abstract class Funcionario {
    private String nome;
    private String cpf;
    private double salario; // protected:publico para as classes filhas mas privado para as demais classes

    //métodos abstratos não tem corpo
    //servem para forçar que as classes filhas implementem seus próprios métodos nesse caso o getBonificacao() 
    public abstract double getBonificacao();

    public String getNome() {
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
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
}
