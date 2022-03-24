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
        for(int i = 1; i <= 5; i++) {
            System.out.println(i);
           Conta c=null;
           c.deposita();
            // try{
            // int a = i / 0;
            // }catch(ArithmeticException ex){
            //     System.out.println("Arithmetic Exception");//Serve para capturar o possível erro e continuar o funcionamento normal do método;
            // }
        }
        System.out.println("Fim do metodo2");
    }
}
