package ocp;

public class CalculadoraDePrecos {

    public double calcula(Compra produto) {
        
    	TabelaDePrecos tabela = new TabelaDePrecoPadrao();
        ServicoDeEntrega correios = new Frete();

        double desconto = tabela.descontoPara(produto.getValor());
        double frete = correios.para(produto.getCidade());

        return produto.getValor() * (1-desconto) + frete;
    }
}
