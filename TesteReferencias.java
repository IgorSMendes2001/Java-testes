public class TesteReferencias {
        public static void main(String[] args) {
            Conta primeiraConta=new Conta();
            primeiraConta.saldo=222.33;
            Conta segundaConta=primeiraConta;
            segundaConta.agencia=22;
            primeiraConta.deposita(1340.23);
            System.out.println(segundaConta.agencia);
            System.out.println(primeiraConta.agencia);
            System.out.println(primeiraConta.saldo);
        }  
}
