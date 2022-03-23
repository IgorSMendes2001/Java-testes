package OrientacaoAObjetosBasica;
public class Conta {
        int numero;
        int agencia;
        Cliente titular;
        private double saldo;
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
        public double pegaSaldo(){
            return this.saldo;
        }
    }

