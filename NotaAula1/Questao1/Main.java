package AulasP2.NotaAula1.Questao1;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Pessoa p = new Pessoa();

        System.out.print("digite seu nome: ");
        p.nome = sc.next();

        System.out.println("Digite sua primeira nota: ");
        p.nota1 = sc.nextDouble();

        System.out.println("Digite sua segunda nota: ");
        p.nota2 = sc.nextDouble();

        System.out.println("Digite sua terceira nota: ");
        p.nota3 = sc.nextDouble();

        p.media();


    }
}
