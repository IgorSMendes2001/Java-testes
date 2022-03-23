package HerancaEPolimorfismo;
//Gerente herda da classe Funcionário
public class Gerente extends Funcionario{
    private int senha;

    public Gerente(){
        
    }
    public void setSenha(int senha) {
        this.senha = senha;
    }
    public boolean autentica(int senha){
        if(this.senha==senha){
            return true;
        }else{
            return false;
        }
    }
    public double getBonificacao(){ // serve como reescrita do método existente na classe mãe ou super-classe.
        System.out.println("Chamando o método de bonificação do Gerente");
        return  super.getBonificacao()+super.getSalario();// puxa os metodos da classe mãe
    }
}
