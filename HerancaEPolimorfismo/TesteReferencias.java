package HerancaEPolimorfismo;

public class TesteReferencias {
    public static void main(String[] args) {
        Gerente g2=new Gerente();
        g2.setNome("Igor");
        String nome=g2.getNome();
        System.out.println(nome);
        g2.setSalario(5000.0);
        Funcionario f=new Funcionario();
        f.setSalario(2000.00);
        EditorDeVideo edv=new EditorDeVideo();
        edv.setSalario(4000.0);
        ControleDeBonificacao controle= new ControleDeBonificacao();
        controle.registra(g2);
        controle.registra(f);
        controle.registra(edv);
        System.out.println(controle.getSoma());
    } 
}
