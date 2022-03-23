package HerancaEPolimorfismo;

public class TesteGerente {
    public static void main(String[] args) {
        Gerente g1=new Gerente();
        g1.setNome("Marcos");
        g1.setCpf("33242256");
        g1.setSalario(5899.0);

        System.out.println(g1.getNome());
        System.out.println(g1.getCpf());
        System.out.println(g1.getSalario());
        System.out.println(g1.getBonificacao());
        g1.setSenha(33443);
        boolean autenticou=g1.autentica(33443);
        System.out.println(autenticou);
    }
}
