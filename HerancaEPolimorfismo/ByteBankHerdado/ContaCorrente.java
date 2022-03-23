package HerancaEPolimorfismo.ByteBankHerdado;
//new ContaCorrente()
public class ContaCorrente extends Conta{//Herda atributos e métodos mas nunca os construtores
    public ContaCorrente(int agencia,int numero){
       super(agencia,numero);
    }
    @Override
    public boolean saca(double valor) {
        // TODO Auto-generated method stub
        return super.saca(valor);
    }
}
