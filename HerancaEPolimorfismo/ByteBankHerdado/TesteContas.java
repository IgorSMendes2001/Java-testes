package HerancaEPolimorfismo.ByteBankHerdado;

public class TesteContas {
    public static void main(String[] args) {
        ContaCorrente cc=new ContaCorrente(111, 2356);
        cc.deposita(222.00);
        ContaPoupanca cp=new ContaPoupanca(211, 2345);
        cp.deposita(2465.00);
    }
}
