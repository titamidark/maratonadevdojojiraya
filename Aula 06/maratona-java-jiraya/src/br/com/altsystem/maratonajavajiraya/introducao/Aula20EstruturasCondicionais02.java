package br.com.altsystem.maratonajavajiraya.introducao;

public class Aula20EstruturasCondicionais02 {
    public static void main(String[] args) {
        //Regras
        //idade < 15 Categoria Infantil
        //idade >= 15 && idade <18 Categoria Juvenil
        //idade >= 18 Categoria Adualto

        int idade = 34;
        String categoria;

        if (idade < 15) {
            categoria = "Categoria Infantil";
        } else if (idade >= 15 && idade <18) {
            categoria = "Categoria Juvenil";
        } else {
            categoria = "Categoria Adulto";
        }

        System.out.println(categoria);

    }
}
