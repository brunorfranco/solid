package acoplamento;

public class NotaFiscalDao  implements AcaoAposGerarNota{

	@Override
	public void executa(NotaFiscal nf) {
		System.out.println("Persistido no banco de dados");
	}
}