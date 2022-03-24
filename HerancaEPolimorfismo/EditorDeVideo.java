package HerancaEPolimorfismo;

public class EditorDeVideo extends Funcionario {
    public double getBonificacao(){ // serve como reescrita do método existente na classe mãe ou super-classe.
        System.out.println("Chamando o método de bonificação do editor de video");
        return  150;// puxa os metodos da classe mãe
    }
}
