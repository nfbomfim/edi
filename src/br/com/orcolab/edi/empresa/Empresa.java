package br.com.orcolab.edi.empresa;
// Declara��o da classe Empresa

import br.com.orcolab.edi.modelo.Situacao;

/**
 * 
 * @author nfbom
 *
 */
public abstract class Empresa {

	private int codigoEmpresa;
	private String nomeEmpresa;
	private String codigoCnpj;
	private String codigoGln;
	private Situacao situacaoEmpresa;
	
//  Declara��o do construtor n�o padr�o
	
	/**
	 * 
	 * @param codigoEmpresa
	 * @param nomeEmpresa
	 * @param codigoCnpj
	 * @param codigoGln
	 */
	public Empresa(int codigoEmpresa, String nomeEmpresa, String codigoCnpj, String codigoGln) {
		setCodigoEmpresa(codigoEmpresa);
		setNomeEmpresa(nomeEmpresa);
		setCodigoCnpj(codigoCnpj);
		setCodigoGln(codigoGln);
		setSituacaoEmpresa();
	}
	
//  Declara��o do metodo altera. m�todo declarado com void n�o retorna nada. executa e sai
	/**
	 * 
	 * @param codigoEmpresa
	 * @param nomeEmpresa
	 * @param codigoCnpj
	 * @param codigoGln
	 */
	public void altera(int codigoEmpresa, String nomeEmpresa, String codigoCnpj, String codigoGln) {
		this.nomeEmpresa = nomeEmpresa;
		this.codigoCnpj = codigoCnpj;
		this.codigoGln = codigoGln;
		
	}

//  Declara��o do metodo altera. m�todo declarado com void n�o retorna nada. executa e sai
	public void desativa(int codigoEmpresa) {
		this.situacaoEmpresa = Situacao.INATIVO;		
	}

//  Declara��o dos m�todos getters e setters
	public int getCodigoEmpresa() {
//      return retorna valor e o this faz refer�ncia ao corrente objeto, metodo ou atributo da classe
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

