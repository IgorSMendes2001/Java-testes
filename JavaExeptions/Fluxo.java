package JavaExeptions;
//Utiliza da ED de pilhas LiFo, com o estilo de método estático, chamando cada método posterior antes de finalizar o método main
public class Fluxo {
    public static void main(String[] args) {
        System.out.println("Ini do main");
        try{
        metodo1();
        }catch(ArithmeticException | NullPointerException|MinhaExcecao ex ){
        String msg=ex.getMessage();
        System.out.println("Exception " + msg);
        ex.printStackTrace();//pega os rastros da exceção e imprime no terminal sem deixar de executar o programa;
        }
        System.out.println("Fim do main");
    }

    private static void metodo1() throws MinhaExcecao {
        System.out.println("Ini do metodo1");
        metodo2();
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() throws MinhaExcecao {
        System.out.println("Ini do metodo2");
        
        throw new MinhaExcecao("Erro");
      //serve para lançar exceções
        // System.out.println("Fim do metodo2");
        //Exceções do tipo Checked: Quando uma exceção extende diretamente da classe exception, na qual o compilador verifica
//Unchecked: Quando uma exceção precisa extender de uma outra subcategoria posterior da classe exception,na qual o compilador não verifica
    }
}
