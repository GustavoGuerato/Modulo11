package Exercicio;

import java.util.*;

public class Programar {

    public static void main(String[] args) {

        cadastroPessoa();

    }

    public static void cadastroPessoa() {

        Deque<NovaPessoa> F = new ArrayDeque<NovaPessoa>();


        System.out.println("*****Cadastro de Pessoa*****");
        System.out.println("****************************");

        NovaPessoa f1 = new NovaPessoa("Lorenna Beatriz ", "Feminino");
        NovaPessoa f2 = new NovaPessoa("Maria Imaculada", "Feminino");
        NovaPessoa f3 = new NovaPessoa("Shirley Lane", "Feminino");

        F.add(f1);
        F.add(f2);
        F.add(f3);

        Deque<NovaPessoa> M = new ArrayDeque<NovaPessoa>();

        NovaPessoa m1 = new NovaPessoa("Wendell Marcos ", "Masculino");
        NovaPessoa m2 = new NovaPessoa("Shake", "Masculino");
        NovaPessoa m3 = new NovaPessoa("Noah Kaleb", "Masculino");

        M.add(m1);
        M.add(m2);
        M.add(m3);


        System.out.println("******   Feminino   ********");
        System.out.println("****************************");
        System.out.println("****************************");
        System.out.println(F);
        System.out.println();
        System.out.println("****************************");
        System.out.println("******   Masculino   *******");
        System.out.println("****************************");
        System.out.println(M);


    }
}