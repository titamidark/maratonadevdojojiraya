package br.com.altsystem.maratonajavajiraya.introducao;

public class Aula23EstruturasCondicionaisExercicio {
    public static void main(String[] args) {
        Double salario = 43.500D;
        Double txminima = salario * 9.7;
        Double txmedia = salario * 37.35;
        Double txalta = salario * 49.5;

        if (salario <= 34.712) {
            System.out.println("Taxa Cobrada (9,7%): " + txminima);
        } else if (salario >34.713 && salario <= 68.507) {
            System.out.println(("Taxa Cobras (37,35%: ") + txmedia);
        } else {
            System.out.println("Taxa Cobrada (49.6%) " + txalta);
        }


    }
}
