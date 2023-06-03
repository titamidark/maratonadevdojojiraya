package br.com.altsystem.maratonajavajiraya.introducao;

public class Aula15Operadores {
    public static void main(String[] args) {
        // + - / *
        int numero01 = 12;
        int numero02 = 15;
        int resultado = numero01 + numero02;
        System.out.println("Soma = " + resultado);

        // % resto
        int resto = 23 % 3;
        System.out.println(resto);

        // Operadores Lógicos: < > <= >= == !=
        boolean isDezMaiorQueVinte = 10 > 20;
        System.out.println(isDezMaiorQueVinte);
        boolean isDezMenorQueVinte = 10 < 20;
        System.out.println(isDezMenorQueVinte);
        boolean isDezIgualVinte = 10 == 20;
        System.out.println(isDezIgualVinte);
        boolean isDezIgualDez = 10 == 10;
        System.out.println(isDezIgualDez);
        boolean isDezDiferenteDez = 10 != 10;
        System.out.println(isDezDiferenteDez);

        // 3 Tipos Operadores Lógicos: && (AND) ||(OR) !
        int idade = 29;
        float salario = 3000F;
        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTringa = idade < 30 && salario >= 3381;

        System.out.println(isDentroDaLeiMaiorQueTrinta);
        System.out.println(isDentroDaLeiMenorQueTringa);

        double valorTotalContaCorrente = 200D;
        double valorTotalContaPoupanca = 10000D;
        float valorPlayStation = 5000F;


        boolean isPlayStation5Compravel = valorTotalContaCorrente > valorPlayStation || valorTotalContaPoupanca > valorPlayStation;
        System.out.println(isPlayStation5Compravel);


        // Valores de Atribuição --> = += -= *= /= %=
        double bonus = 1800;
        bonus += 1000;
        System.out.println(bonus);
        bonus -= 800;
        System.out.println(bonus);
        bonus *= 2;
        System.out.println(bonus);
        bonus /= 3;
        System.out.println(bonus);
        bonus %= 2;
        System.out.println(bonus);

        // ++
        int contador = 0;
        contador += 1; //contador = contador + 1
        System.out.println(contador);
        contador++;
        System.out.println(contador);
        contador--;
        System.out.println(contador);








    }






}
