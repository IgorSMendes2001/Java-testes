import java.util.Collection;
import java.util.List;

public class OrdenaString{
    public static void main(String[] args) {
        List<String> palavras=new ArrayList<String>();
        palavras.add("Alura Online");
        palavras.add("Casa do Código");
        palavras.add("caelum");
        Collections.sort(palavras);
        System.out.println(palavras);
    }
}