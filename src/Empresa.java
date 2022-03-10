// Declaração da classe Empresa

public abstract class Empresa {

	private int codigoEmpresa;
	private String nomeEmpresa;
	private String codigoCnpj;
	private String codigoGln;
	private Situacao situacaoEmpresa;
	
//  Declaração do construtor não padrão
	
	public Empresa(int codigoEmpresa, String nomeEmpresa, String codigoCnpj, String codigoGln) {
		setCodigoEmpresa(codigoEmpresa);
		setNomeEmpresa(nomeEmpresa);
		setCodigoCnpj(codigoCnpj);
		setCodigoGln(codigoGln);
		setSituacaoEmpresa();
	}
	
//  Declaração do metodo altera. método declarado com void não retorna nada. executa e sai
	public void altera(int codigoEmpresa, String nomeEmpresa, String codigoCnpj, String codigoGln) {
		this.nomeEmpresa = nomeEmpresa;
		this.codigoCnpj = codigoCnpj;
		this.codigoGln = codigoGln;
		
	}

//  Declaração do metodo altera. método declarado com void não retorna nada. executa e sai
	public void desativa(int codigoEmpresa) {
		this.situacaoEmpresa = Situacao.INATIVO;		
	}

//  Declaração dos métodos getters e setters
	public int getCodigoEmpresa() {
//      return retorna valor e o this faz referência ao corrente objeto, metodo ou atributo da classe
		return this.codigoEmpresa;
	}

	public String getNomeEmpresa() {
		return this.nomeEmpresa;
	}
	
	public String getCodigoCnpj() {
		return this.codigoCnpj;
	}

	public String getCodigoGln() {
		return this.codigoGln;
	}
	
	public Situacao getSituacaoEmpresa() {
		return this.situacaoEmpresa;
	}

	private void setCodigoEmpresa(int codigoEmpresa) {
		this.codigoEmpresa = codigoEmpresa;
	}

	private void setNomeEmpresa(String nomeEmpresa) {
		this.nomeEmpresa = nomeEmpresa;
	}

	private void setCodigoCnpj(String codigoCnpj) {
		this.codigoCnpj = codigoCnpj;
	}

	private void setCodigoGln(String codigoGln) {
		this.codigoGln = codigoGln;
	}

	private void setSituacaoEmpresa() {
		this.situacaoEmpresa = Situacao.ATIVO;
	}

	
	protected Filial filialEmpresa;

	public String filiaisDaEmpresa() {
		return filialEmpresa.getCodigoGln();
		
	}

}

