package OrientacaoAObjetosBasica.NewProject;

public class Conta {
    private int numero;
    private int agencia;
    private Cliente titular;
    private double saldo;
    private static int total;//método estático usado como variável global de objeto
   //método construtor que recebe duas variávei na qual ele tem que pedir do usuário antes de instanciar o objeto
    public Conta(int agencia,int numero){
        System.out.println("Estou criando uma conta!");
        Conta.total++;
        // System.out.println("O total de contas é: " + Conta.total);
        if(agencia>0&&agencia<10000){
            this.agencia=agencia;
            System.out.println("Agência alterada! Sua agência agora é: " + agencia);
        }else{
            System.err.println("Agência inválido!");
        }
        if(numero>0&&numero<100000){
            this.numero=numero;
            System.out.println("Número alterado! Seu número agora é: " + numero);
        }else{
            System.err.println("Número inválido!");
        }

    }
    //métodos de sacar,depositar e transferir
    public boolean saca(double valor){
        if(this.saldo<valor){
            System.out.println("Saldo insuficiente,tente novamente mais tarde");
            return false;
        }
        else{
            this.saldo-=valor;
            System.out.println("Valor sacado com sucesso!");
            return true;
        }
    }
   
    public void deposita(double valor){
        this.saldo+=valor;
        System.out.println("Depósito realizado com sucesso!");
    }
     // void transfere(Conta destino,double valor){
    //     this.saldo=this.saldo-valor;
    //     destino.saldo=destino.saldo+valor;
    // }
   
    public boolean transfere(Conta destino,double valor){
        boolean retirou =this.saca(valor);
        if(retirou==false){
            System.out.println("Não foi possível realizar a transação!");
            return false;
        }
        else{
            destino.deposita(valor);
            System.out.println("Transferência realizada com sucesso!");
            return true;
        }
    }
    //getters e setters da classe Conta que serve para puxar e modificar os atributos.
    public double getSaldo(){
        return this.saldo;
    }
    public int getNumero(){
        return this.numero;
    }
    public void setNumero(int numero){
        if(numero>0&&numero<100000){
            this.numero=numero;
            System.out.println("Número alterado! Seu número agora é: " + numero);
        }else{
            System.err.println("Número inválido!");
        }
    }
    public int getAgencia() {
        return this.agencia;
    }
    public void setAgencia(int agencia) {
        if(agencia>0&&agencia<10000){
            this.agencia=agencia;
            System.out.println("Agência alterada! Sua agência agora é: " + agencia);
        }else{
            System.err.println("Agência inválido!");
        }
    }
    public void setTitular(Cliente titular) {
        this.titular = titular;
    }
    public Cliente getTitular() {
        return titular;
    }
    public static int getTotal() {
        System.out.println("O total de contas é: ");
        return Conta.total;
    }
}

