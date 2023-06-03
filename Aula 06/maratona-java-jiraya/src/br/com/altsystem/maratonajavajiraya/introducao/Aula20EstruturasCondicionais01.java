package br.com.altsystem.maratonajavajiraya.introducao;

public class Aula20EstruturasCondicionais01 {
    public static void main(String[] args) {
        int idade = 21;
        boolean isAutorizadoComprarBebida = idade >= 18;

        if (isAutorizadoComprarBebida) {
            System.out.println("Pode Comprar - Maior que 18");
        } else {
            System.out.println(("Não pode Comprar!!!!!!!"));
        }

        if (!isAutorizadoComprarBebida) {
            System.out.println("Não pode comprar - Idade menor que 18");
        }

    }

}
