package OrientacaoAObjetosBasica;

public class Teste {
    public static void main(String[]args) {
      Conta minhaConta=new Conta();
      Conta c1=new Conta();
      Cliente c=new Cliente();
      Cliente c2=new Cliente();
      c.endereco="Rua da padaria";
      c2.endereco="Rua Padre Alaor";
      System.out.println("Seu endereço é:" + c2.endereco);
      c1.titular=c2;
      minhaConta.titular=c;
      System.out.println("O endereço do seu amigo é: " + minhaConta.titular.endereco);
      c1.titular.nome="José";
      c1.deposita(115.0);
      minhaConta.titular.nome="Igor";
      System.out.println(c.nome);
      minhaConta.deposita(1306.0);
      minhaConta.saca(115);
      minhaConta.deposita(350);
      System.out.println("Saldo atual: " + minhaConta.pegaSaldo());
      System.out.println("Nome do titular: " + minhaConta.titular.nome);
      minhaConta.transfere(c1, 1115.0);
      c1.transfere(minhaConta, 114.2);
      System.out.println("Bem vindo à conta 2,seu saldo atual é de: " +c1.pegaSaldo() + " E o nome do titular é: "+ c1.titular.nome);
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
