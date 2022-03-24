package HerancaEPolimorfismo.ByteBankHerdado;
//new ContaCorrente()
public class ContaCorrente extends Conta{//Herda atributos e métodos mas nunca os construtores
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
        // TODO Auto-generated method stub
        return super.transfere(destino, valor);
    }
}
