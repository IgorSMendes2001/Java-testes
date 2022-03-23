package HerancaEPolimorfismo.ByteBankHerdado;

public class ContaPoupanca extends Conta{
    public ContaPoupanca(int agencia,int numero) {
        super(agencia,numero);//Ao passar os parâmetros do constutor específico da classe mãe, logo você cria uma referência de construtor na classse filha
    }
}
