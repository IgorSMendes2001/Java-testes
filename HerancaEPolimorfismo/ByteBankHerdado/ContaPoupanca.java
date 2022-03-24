package HerancaEPolimorfismo.ByteBankHerdado;

public class ContaPoupanca extends Conta{
    public ContaPoupanca(int agencia,int numero) {
        super(agencia,numero);//Ao passar os parâmetros do constutor específico da classe mãe, logo você cria uma referência de construtor na classse filha
    }
    @Override
    public boolean saca(double valor) {
        // TODO Auto-generated method stub
        return super.saca(valor);
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
