package HerancaEPolimorfismo;
//Gerente herda da classe FuncionárioAutenticavel,e assina o contrato Autenticavel
public class Gerente extends Funcionario implements Autenticavel{
    public double getBonificacao(){ // serve como reescrita do método existente na classe mãe ou super-classe.
        System.out.println("Chamando o método de bonificação do Gerente");
        return  super.getSalario();// puxa os metodos da classe mãe
    }
    private AutenticacaoUtil autenticador;
    public Gerente(){
        this.autenticador=new AutenticacaoUtil();
    }
    
    @Override
    public void setSenha(int senha) {
        this.autenticador.setSenha(senha);
    }
    @Override
    public boolean autentica(int senha) {
        return this.autenticador.autentica(senha);
    }
    
}
