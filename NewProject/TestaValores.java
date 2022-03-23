package NewProject;

public class TestaValores {
    public static void main(String[] args) {
        Conta conta=new Conta(-59,-34);
        conta.setAgencia(55);
        conta.setNumero(39);
        System.out.println(conta.getAgencia());
        
        // Conta conta2=new Conta(1345, 56773);
        System.out.println(Conta.getTotal());
    }
}
