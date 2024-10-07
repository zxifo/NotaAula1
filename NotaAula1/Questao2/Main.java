package AulasP2.NotaAula1.Questao2;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Pessoa p = new Pessoa();

        System.out.println("Você deseja realizar cadastro(cadastro), venda(venda) ou controle de estoque(controle)? ");
        p.acao = sc.next();

        switch (p.acao) {
            case "cadastro":
                System.out.print("digite o codigo do produto: ");
                p.setCodigo(sc.nextInt());

                System.out.println("Digite o nome do produto: ");
                p.setNome(sc.next());

                System.out.println("Digite o peso do produto: ");
                p.setPeso(sc.nextDouble());

                System.out.println("Digite a cor do produto: ");
                p.setCor(sc.next());

                System.out.println("Digite o preço do produto: ");
                p.setValorP(sc.nextDouble());

                System.out.println("Digite a quantidade em estoque do produto: ");
                p.setQtd(sc.nextInt());
                break;

            case "venda":
                System.out.print("digite o codigo do produto para a venda: ");
                p.setCodigo(sc.nextInt());

                System.out.println("\nNome do produto" + p.getNome());
                System.out.println("Estoque: " + p.getQtd());
                System.out.println("Valor: " + p.getValor());


                System.out.println("\nDigite a quantidade que será comprada: ");
                p.setQtdc(sc.nextInt());

                System.out.println("Digite o valor que vai ser pago: ");
                p.setValorP(sc.nextDouble());

                System.out.println("Digite qual será o metodo de pagemento: ");
                p.metodo = sc.next();

                System.out.println("Valor final: " + p.getValor());

            case "controle":
                System.out.println("Quantidade em estoque: " + p.getQtd());

        }
    }
}