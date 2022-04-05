import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;



public class TestaAlunos {
    public static void main(String[] args) {
        Collection<String>alunos=new HashSet<>();//Desvantagem em relação ao List:Não é possível prever a ordem dos elementos
        alunos.add("Rodrigo Turini");
        alunos.add("Alberto Souza");
        alunos.add("Nico Steppat");
        alunos.add("Sergio Lopes");
        alunos.add("Renan Saggio");
        alunos.add("Mauricio Aniche");//Vantagem: Não aceita elementos repetidos,ações muito mais rápidas que na lista
        boolean pauloEstaMatriculado=alunos.contains("Paulo Ricardo da RPM");
        alunos.remove("Sergio Lopes");
        System.out.println(pauloEstaMatriculado);
        for (String aluno : alunos) {
            System.out.println(aluno);
        }
        // alunos.forEach(aluno->{
        //     System.out.println(aluno);
        // });
        System.out.println(alunos);

        List<String> alunosEmLista=new ArrayList<>(alunos);
        Collections.sort(alunosEmLista);
        System.out.println(alunosEmLista);
    }
}
