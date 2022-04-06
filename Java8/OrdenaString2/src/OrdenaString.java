package src;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

import javax.xml.crypto.dsig.keyinfo.RetrievalMethod;



public class OrdenaString {
    public static void main(String[] args) throws Exception {
        List<String> palavras=new ArrayList<String>();
        palavras.add("Alura online");
        palavras.add("editora casa do código");
        palavras.add("Caelum");
        // Comparator<String>comparador=new ComparadorPorTamanho();//Instancia um comparator 
        //Até o Java 7 era assim que tinhamos que fazer para ordenar as Strings:
        //Collections.sort(palavras,comparador);//Utiliza da referência do novo comparator para ordenar as palavras
        //A partir do Java 8 ficou assim:
        // palavras.sort((String s1, String s2)-> {
        //         if(s1.length() < s2.length())
        //         return -1;
        //         if(s1.length()>s2.length())
        //             return 1;
        //         return 0;
        //     });
        // palavras.sort((s1,s2)->  Integer.compare(s1.length(), s2.length()));
        palavras.sort(Comparator.comparing(s->s.length()));
        palavras.sort(Comparator.comparing(String::length));
        Function<String,Integer> funcao = String::length; //tipo de lambda com method references serve para invocar somente um método
        Function<String,Integer> funcao2 =s->s.length();//tipo comum de lambda

        System.out.println(palavras);
        //For Each antes do Java 8
        // for (String p : palavras) {
        //     System.out.println(p);
        // }
        //For Each do Java 8
        Consumer<String> impressor=s->System.out.println(s); // Lambdas servem para simplificar funções e evitar códigos complexos para classes com poucos métodos porém necessita ser ligado a uma interface funcional
        palavras.forEach(impressor);
        
        // palavras.forEach((String t)-> {
        //         System.out.println(t);                
        //     }
            
        // );//Nova forma de iterar elementos

        new Consumer<String>() {

            @Override
            public void accept(String t) {
                System.out.println(t);                
            }
            
        };
    }
}
// class ImprimiNaLinha implements Consumer <String>{

//     @Override
//     public void accept(String t) {
//        System.out.println(t);
        
//     }
    
// }

// class ComparadorPorTamanho implements Comparator <String>{ //Implementa a Interface Comparator que serve para comparar duas Strings originalmente

//     @Override
//     public int compare(String s1,String s2){//Sobrescrita do método compare,que inicialmente retornava os valores em ordem alfabética,para retornar por tamanho.
      
//     }
// }
