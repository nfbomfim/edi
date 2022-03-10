
public class Matriz extends Empresa{


	public Matriz(int codigoEmpresa, String nomeEmpresa, String codigoCnpj, String codigoGln) {
		super(codigoEmpresa, nomeEmpresa, codigoCnpj, codigoGln);
	}

	public void desativa() {
		super.desativa(getCodigoEmpresa());
		
	}

	
}

