package br.com.orcolab.edi.modelo;

/**
 * 
 * @author Fabio Bomfim Nunes
 * @version 0.1
 *
 * Classe para definição do canal de transmissão EDI
 * 
 */
public class CanalDeTransmissao {

	private int codigoCanal;
	private String nomeCanal;
	private Status statusCanal;
	
	/**
	 * 
	 * @param codigoCanal
	 * @param nomeCanal
	 * @throws ExcecaoCanalDeTransmissao
	 */
	public CanalDeTransmissao(int codigoCanal, String nomeCanal) throws ExcecaoCanalDeTransmissao {
		this.codigoCanal = codigoCanal;
		this.nomeCanal = nomeCanal;
		this.statusCanal = Status.LIGADO;
	}
	
	/**
	 * 
	 * @param codigoCanal
	 * @param nomeCanal
	 * @throws ExcecaoCanalDeTransmissao
	 */
	public void altera(int codigoCanal, String nomeCanal) throws ExcecaoCanalDeTransmissao {
		this.nomeCanal = nomeCanal;
	}
	
	/**
	 * 
	 * @param codigoCanal
	 * @throws ExcecaoCanalDeTransmissao
	 */
	public void desativa(int codigoCanal)  throws ExcecaoCanalDeTransmissao{
		this.statusCanal = Status.DESLIGADO;	
	}
	
	public int getCodigoCanal() {
		return this.codigoCanal;
	}

	public String getNomeCanal() {
		return this.nomeCanal;
	}

	public Status getStatusCanal() {
		return this.statusCanal;
	}


	
	
}
