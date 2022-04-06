package src;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

class Curso {
    private String nome;
    private int alunos;

    public Curso(String nome, int alunos) {
        this.nome = nome;
        this.alunos = alunos;
    }

    public String getNome() {
        return nome;
    }

    public int getAlunos() {
        return alunos;
    }
    
}


public class ExemploCursos {
 public static void main(String[] args) {
    List<Curso> cursos = new ArrayList<Curso>();
    cursos.add(new Curso("Python", 45));
    cursos.add(new Curso("JavaScript", 150));
    cursos.add(new Curso("Java 8", 113));
    cursos.add(new Curso("C", 55));
    
    cursos.sort(Comparator.comparing(Curso::getAlunos));
    
    cursos.stream()
    .filter(c->c.getAlunos()>=100)
    .findFirst()
    .ifPresent(c->System.out.println(c.getNome()));
    // .map(c->c.getAlunos())//.map(Curso::getAlunos)
    // .forEach(total->System.out.println(total));//.forEach(System.out::println)
    System.out.println( cursos.stream()
    .mapToInt(c->c.getAlunos())
    .average());
    List<Curso> cursosFiltrados = cursos.stream()
   .filter(c -> c.getAlunos() > 50)
   .collect(Collectors.toList());
}   
    
}
