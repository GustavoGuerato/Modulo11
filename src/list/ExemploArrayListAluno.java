package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExemploArrayListAluno {

    public static void main(String[] args){
        exemploListaSimplesOrdenadaClasseExterna();
        exemploListaSimplesOrdenadaComparatorAluno();
    }

    private static void exemploListaSimplesOrdenadaClasseExterna(){
        System.out.println("**** exemploListaSimplesOrdenadaClasseExterna ****");
        List<Aluno> lista = new ArrayList<>();

        Aluno a = new Aluno("João da silva", "Linux basico", 0);
        Aluno b = new Aluno("Antonio Sousa", "OpenOffice", 30);
        Aluno c = new Aluno("Lucia Ferreira","Internet", 20);
        lista.add(a);
        lista.add(b);
        lista.add(c);
        System.out.println("Lista desordenada: " + lista);
        Collections.sort(lista);
        System.out.println("Lista ordenada: ");
        System.out.println("");
    }
    private static void exemploListaSimplesOrdenadaComparatorAluno(){
        System.out.println("**** exemploListaSimplesOrdenadaComparatorAluno ****");
        List<Aluno> lista = new ArrayList<>();

        Aluno a = new Aluno("João da silva", "Linux basico", 0);
        Aluno b = new Aluno("Antonio Sousa", "OpenOffice", 30);
        Aluno c = new Aluno("Lucia Ferreira","Internet", 20);
        lista.add(a);
        lista.add(b);
        lista.add(c);
        System.out.println("Lista desordenada: " + lista);
        Collections.sort(lista);
        System.out.println("Lista ordenada: ");
        System.out.println("");

        ComparaNotaAluno comparaNotaAluno=new ComparaNotaAluno();
        Collections.sort(lista,comparaNotaAluno);
        System.out.println("Lista com ordenação por nota" +lista);

    }

}
