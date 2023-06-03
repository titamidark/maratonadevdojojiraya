package br.com.altsystem.maratonajavajiraya.introducao;

import java.security.spec.RSAOtherPrimeInfo;

public class Aula10TiposPrimitivos {
    public static void main(String[] args) {

        // int, double, float, char, byte, short, long, boolean
        int idade = 10;
        long numeroGrande = 100000;
        double salarioDouble = 2000;
        float salarioFloat = 2500;
        byte idadeByte = 10;
        short idadeShort = 10;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = '\u0041';

        //Não é do tipo Primitivo e sim uma clase do Java
        String nome = "titamidark";

        //var nome2 = "Altamir";

        System.out.println("A idade é: " +idade + " 10 anos");
        System.out.println(falso);
        System.out.println(caractere);
    }
}
