class Conta{
        int numero;
        int agencia;
        Cliente titular;
        double saldo;
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
    }
    class Cliente{
        String nome;
        String sobrenome;
        String cpf;
        String endereco;
    }
   
    public class Teste {
    public static void main(String[]args) {
      Conta minhaConta=new Conta();
      Conta c1=new Conta();
      Cliente c=new Cliente();
      Cliente c2=new Cliente();
      c2.endereco="Rua Padre Alaor";
      System.out.println("Seu endereço é:" + c2.endereco);
      c1.titular=c2;
      minhaConta.titular=c;
      c1.titular.nome="José";
      c1.saldo=115.0;
      minhaConta.titular.nome="Igor";
      System.out.println(c.nome);
      minhaConta.saldo=1306.0;
      minhaConta.saca(115);
      minhaConta.deposita(350);
      System.out.println("Saldo atual: " + minhaConta.saldo);
      System.out.println("Nome do titular: " + minhaConta.titular.nome);
      minhaConta.transfere(c1, 1115.0);
      c1.transfere(minhaConta, 114.2);
      System.out.println("Bem vindo à conta 2,seu saldo atual é de: " +c1.saldo + " E o nome do titular é: "+ c1.titular.nome);
      c1.transfere(minhaConta, 1200.00);
    //   int i =0;
    //   Scanner sc1=new Scanner(System.in);
    //   System.out.println("Digite um texto");
    //   while(sc1.hasNext()){
    //         i++;
    //         System.out.println("Token: "+sc1.next());
    //   }
    //   sc1.close();

      
    
    }
}
