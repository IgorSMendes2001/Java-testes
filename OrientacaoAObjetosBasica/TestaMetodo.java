package OrientacaoAObjetosBasica;

public class TestaMetodo {
    public static void main(String[] args) {
        Conta conta=new Conta();
        conta.deposita(500);
        System.out.println(conta.pegaSaldo());
    }
}
