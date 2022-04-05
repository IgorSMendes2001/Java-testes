import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.TitlePaneLayout;

public class Curso {
    private String nome;
    private String instrutor;
    private List<Aula> aulas=new ArrayList<Aula>();
    private Set<Aluno>alunos=new LinkedHashSet<>();//Garante ordem para a Set //TreeSet utiliza um comparator para definir ordem dos hashes
    private Map<Integer,Aluno> matriculaParaAluno=new LinkedHashMap<>();//Garante a ordem do map
    public Curso(String nome,String instrutor){
        this.nome=nome;
        this.instrutor=instrutor;
    }
    public String getNome() {
        return nome;
    }
    public String getInstrutor() {
        return instrutor;
    }

    public List<Aula> getAulas(){
        return Collections.unmodifiableList(aulas);
    }

    public void adiciona(Aula aula){
        this.aulas.add(aula);
    }
    public int getTempoTotal(){
        int tempoTotal=0;
        for(Aula aula:aulas){
            tempoTotal+=aula.getTempo();
        }
        return tempoTotal;
    }
    @Override
    public String toString() {
        return "Curso: " + nome + ", tempo total:" + this.getTempoTotal() + "," + "aulas: " + this.aulas;
    }
    public void matricula(Aluno aluno) {
        this.alunos.add(aluno);
        this.matriculaParaAluno.put(aluno.getNumeroMatricula(), aluno);
    }
    public Set<Aluno> getAlunos() {
        return Collections.unmodifiableSet(alunos);
    }
    public boolean estaMatriculado(Aluno aluno) {
        return this.alunos.contains(aluno);
    }
    public Aluno buscaMatriculado(int numero) {
        // for (Aluno aluno : alunos) {
        //     if(aluno.getNumeroMatricula()==numero)
        //         return aluno;
        //     }throw new NoSuchElementException("Matrícula não encontrada " + numero);
        if(!matriculaParaAluno.containsKey(numero))
            throw new NoSuchElementException("Matrícula não encontrada " + numero);
            return matriculaParaAluno.get(numero);
    }
}