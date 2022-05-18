package OrientacaoAObjetosBasica.NewProject;
public class TestaGetESet {
    public static void main(String[] args) {
        Conta conta = new Conta(157,35);
        conta.setNumero(1337);
        System.out.println(conta.getNumero());

        Cliente paulo=new Cliente();
        paulo.setNome("Paulo Silveira");
        conta.setTitular(paulo);
        System.out.println(conta.getTitular().getNome());
        conta.getTitular().setEndereco("Rua dos Alfeneiros");
        System.out.println(conta.getTitular().getEndereco());
    }
    
}
