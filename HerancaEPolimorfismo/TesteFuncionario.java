package HerancaEPolimorfismo;

public class TesteFuncionario {
    public static void main(String[] args) {
       
        Gerente nico=new Gerente();
        nico.setNome("Nico Steppat");
        nico.setCpf("23131144-12");
        nico.setSalario(2590.20);
        System.out.println(nico.getNome());
        System.out.println(nico.getBonificacao());
      
    }
    
}