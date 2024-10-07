package AulasP2.NotaAula1.Questao2;

public class Pessoa {

    private String nome, cor;
    private double peso, valor, dinheiro, valorP, valorR;
    private int codigo, qtd, qtdc;
    public String acao, metodo;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getQtd() {
        return qtd;
    }
    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public int getQtdc() {
        return qtdc;
    }
    public void setQtdc(int qtdc) {
        this.qtdc = qtdc;
    }

    public double getDinheiro() {
        return dinheiro;
    }
    public void setDinheiro(double dinheiro) {
        this.dinheiro = dinheiro;
    }

    public double getValorP() {
        return valorP;
    }
    public void setValorP(double valorP) {
        this.valorP = valorP;
    }

    public double getValorR() {
        return valorR;
    }
    public void setValorR(double valorR) {
        this.valorR = valorR;
    }

    public void negocio() {
        if (metodo == "pix" || metodo == "especie" || metodo == "transferencia" || metodo == "debito") {
            System.out.println("Desconto de 5%");
            valor = valorP * 0.95;
            System.out.println(valor);
        } else if (metodo == "credito") {
            valor = valorP / 3;
            System.out.println("3 parcelas sem juros de " + valor);
        }
        qtd = qtd - qtdc;
    }

}
