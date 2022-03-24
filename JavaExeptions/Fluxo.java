package JavaExeptions;
//Utiliza da ED de pilhas FiFo, com o estilo de método estático, chamando cada método posterior antes de finalizar o método main
public class Fluxo {
    public static void main(String[] args) {
        System.out.println("Ini do main");
        try{
        metodo1();
        }catch(ArithmeticException | NullPointerException ex ){
        // String msg=ex.getMessage();
        // System.out.println("ArithmeticException " + msg);
        ex.printStackTrace();//pega os rastros da exceção e imprime no terminal sem deixar de executar o programa;
        }
        System.out.println("Fim do main");
    }

    private static void metodo1() {
        System.out.println("Ini do metodo1");
        metodo2();
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() {
        System.out.println("Ini do metodo2");
        
        throw new ArithmeticException("Erro");
      //serve para lançar exceções
        // System.out.println("Fim do metodo2");
    }
}
