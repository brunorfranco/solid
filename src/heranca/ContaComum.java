package heranca;

public class ContaComum {

	private ManipuladorDeSaldo manipulador;
	
    public ContaComum() {
    	manipulador = new ManipuladorDeSaldo();
    }

    public void rende(){
        this.manipulador.rende(0.01);
    }
    
    public void saca(double valor){
        this.manipulador.saca(valor);
    }
    
    public void deposita(double valor){
    	this.manipulador.deposita(valor);
    }
    
    public double getSaldo(){
    	return this.manipulador.getSaldo();
    }

}
