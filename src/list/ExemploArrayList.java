package list;

import java.util.ArrayList;

import java.util.Collections;
import java.util.List;

public class ExemploArrayList {
    public static void main(String[] args){
        exemploListaSimples();
        exemploListaSimplesOrdemAscendente();
        exemploNumeros();
    }
    public  static void exemploNumeros(){
        System.out.println("**** exemploNumeros ****");
        List<Integer> numeros=new ArrayList<>();
        numeros.add(1);
        numeros.add(3);
        System.out.println(numeros);
    }


    public static void exemploListaSimples(){
        System.out.println("**** exemploListaSimples ****");
        List<String> lista=new ArrayList<>();
        lista.add("João da silva");
        lista.add("Antonio sousa");
        lista.add("Lucia ferreira");
        System.out.println(lista);
        System.out.println();

    }

    public  static void exemploListaSimplesOrdemAscendente(){
        System.out.println("**** exemploListaSimplesOrdemAscendente ****");
        List<String> lista = new ArrayList<>();
        lista.add("João da silva");
        lista.add("Antonio sousa");
        lista.add("Lucia ferreira");
        Collections.sort(lista);
        System.out.println(lista);
        System.out.println();
    }
}
