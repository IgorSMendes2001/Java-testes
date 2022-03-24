package HerancaEPolimorfismo;

public class TesteSistema {
    public static void main(String[] args) {
        Gerente g=new Gerente();
        g.setSenha(7765);
        SistemaInterno si=new SistemaInterno();
        si.autentica(g);
        Administrador adm=new Administrador();
        adm.setSenha(2222);
        si.autentica(adm);
        Cliente cliente =new Cliente();
        cliente.setSenha(2345678);
        si.autentica(cliente);
    }
}
