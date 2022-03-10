
public class Filial extends Empresa{

	//private String codigoCnpjMatriz;
	private Empresa empresaMatriz;
	
	public Filial(int codigoEmpresa, String nomeEmpresa, String codigoCnpj, String codigoGln, Empresa empresaMatriz) {
		super(codigoEmpresa, nomeEmpresa, codigoCnpj, codigoGln);
		setEmpresaMatriz(empresaMatriz);
	}

	public Empresa getEmpresaMatriz() {
		return this.empresaMatriz;
	}

	private void setEmpresaMatriz(Empresa empresaMatriz) {
		this.empresaMatriz = empresaMatriz;
	}
	
	public void desativa() {
		super.desativa(getCodigoEmpresa());
		
	}

	
}

