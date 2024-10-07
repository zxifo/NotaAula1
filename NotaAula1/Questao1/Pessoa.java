package AulasP2.NotaAula1.Questao1;

public class Pessoa {

    int matricula;
    String nome;
    double nota1, nota2, nota3, media;

    public void media () {
        media = (nota1 + nota2 + nota3)/3;
        System.out.printf("%.2f", media);
        if (media >= 7) {
            System.out.println("\nAprovado");
        }
        else if (media >=4) {
            System.out.println("\nFinal");
        }
        else {
            System.out.println("\nReprovado");
        }

    }
}