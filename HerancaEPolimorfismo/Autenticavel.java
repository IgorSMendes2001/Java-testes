package HerancaEPolimorfismo;
//interface são classes com todos os métodos abstratos
//quem assinar este contrato,precisa implementar // metodo senha e metodo autentica
public abstract interface Autenticavel {

    public abstract void setSenha(int senha) ;
    public abstract boolean autentica(int senha);
    
}
