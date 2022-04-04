package HerancaEPolimorfismo.ByteBankHerdado;
import HerancaEPolimorfismo.ByteBankHerdado.Conta;
import HerancaEPolimorfismo.ByteBankHerdado.Tributavel;
//new ContaCorrente()
public class ContaCorrente extends Conta implements Tributavel{//Herda atributos e métodos mas nunca os construtores
    public ContaCorrente(int agencia,int numero){
       super(agencia,numero);
    }
    @Override //o método override serve para sobreescrever algum método da classe mãe podendo alterar o seu funcionamento
    public boolean saca(double valor) {
        double valorASacar=valor + 0.2;
        return super.saca(valorASacar);
    }
    @Override 
    public void deposita(double valor) {
        super.saldo+=valor;
        System.out.println("Depósito realizado com sucesso!"); 
    }
    @Override
    public boolean transfere(Conta destino, double valor) {
        return super.transfere(destino, valor);
    }
    @Override
	public double getValorImposto() {	
		return super.saldo * 0.01;
	}
	
}
