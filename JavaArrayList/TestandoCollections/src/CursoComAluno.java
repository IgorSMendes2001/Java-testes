import java.util.Iterator;
import java.util.Set;

public class CursoComAluno {
    public static void main(String[] args) {
        Curso javaColecoes=new Curso("Dominando Coleções do Java", "Paulo Silveira");
        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 19));
        javaColecoes.adiciona(new Aula("Criando uma aula", 20));
        javaColecoes.adiciona(new Aula("Modelando com coleções", 21));

        Aluno a1=new Aluno("Rodrigo Turini", 34672);
        Aluno a2=new Aluno("Guilherme Silveira",5617);
        Aluno a3=new Aluno("Mauricio Aniche",17645);

        javaColecoes.matricula(a1);
        javaColecoes.matricula(a2);
        javaColecoes.matricula(a3);
        System.out.println("Todos os alunos matriculados: ");
        javaColecoes.getAlunos().forEach(a->{
            System.out.println(a);
        });
        System.out.println("O aluno " + a1+ " está matriculado?");
        System.out.println(javaColecoes.estaMatriculado(a1));
        Aluno igor=new Aluno("Igor", 7600);
        javaColecoes.matricula(igor);
        System.out.println("O aluno " + igor+ " está matriculado?");
        System.out.println(javaColecoes.estaMatriculado(igor));
        Aluno igor2=new Aluno("Igor",7600);
        System.out.println("O aluno " + igor2+ " está matriculado?");
        System.out.println(javaColecoes.estaMatriculado(igor2));
        System.out.println("O igor1 é equals ao Igor2?");
        System.out.println(igor.equals(igor2));
        //obrigatoriamente o seguinte é true: Pois o código de espalhamento tem de ser o mesmo
        System.out.println(igor.hashCode()==igor2.hashCode());
        System.out.println("Todos os alunos matriculados: ");
        Set<Aluno> alunos = javaColecoes.getAlunos();
        //for legado
        Iterator <Aluno> iterator=alunos.iterator();
        while(iterator.hasNext()){
        Aluno proximo=iterator.next();
        System.out.println(proximo);
        }
    }
}
