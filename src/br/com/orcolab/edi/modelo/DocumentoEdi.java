package br.com.orcolab.edi.modelo;

/**
 * 
 * @author nfbom
 *
 */
public class DocumentoEdi {

	private String nomeDocumentoEdi;
	private String tipoDocumentoEdi;
	private Situacao situacaoDocumentoEdi;
	private String fluxoDocumentoEdi;
	
	/**
	 * 
	 * @param nomeDocumento
	 * @param tipoDocumento
	 * @param fluxoDocumento
	 */
	public DocumentoEdi(String nomeDocumento, String tipoDocumento, String fluxoDocumento) {
		setNomeDocumentoEdi(nomeDocumento);
		setTipoDocumentoEdi(tipoDocumento);
		setFluxoDocumentoEdi(fluxoDocumento);
		this.situacaoDocumentoEdi = Situacao.ATIVO;
	}
	
	/**
	 * 
	 * @param nomeDocumento
	 * @param tipoDocumento
	 * @param fluxoDocumento
	 */
	public void altera(String nomeDocumento, String tipoDocumento, String fluxoDocumento) {
		setTipoDocumentoEdi(tipoDocumento);
		setFluxoDocumentoEdi(fluxoDocumento);
	}
	
	/**
	 * 
	 * @param nomeDocumento
	 */
	public void desativa(String nomeDocumento) {
			this.situacaoDocumentoEdi = Situacao.INATIVO;
	}
	
	public String getNomeDocumentoEdi() {
		return this.nomeDocumentoEdi;
	}

	/**
	 * 
	 * @param nomeDocumento
	 */
	private void setNomeDocumentoEdi(String nomeDocumento) {
		if(nomeDocumento != "orders" && nomeDocumento != "invoic"
				&& nomeDocumento != "ordrsp") {
			throw new ExcecaoDocumentoEdi("Documento " + nomeDocumento + " invalido!");
		}
		this.nomeDocumentoEdi = nomeDocumento;
	}

	public String getTipoDocumentoEdi() {
		return this.tipoDocumentoEdi;
	}

	/**
	 * 
	 * @param tipoDocumentoEdi
	 */
	private void setTipoDocumentoEdi(String tipoDocumentoEdi) {
		if(tipoDocumentoEdi != "mercantil" && tipoDocumentoEdi != "financeiro"
				&& tipoDocumentoEdi != "logistico") {
			throw new ExcecaoDocumentoEdi("Tipo de documento " + tipoDocumentoEdi + " invalido!");
		}
		this.tipoDocumentoEdi = tipoDocumentoEdi;
	}

	public Situacao getSituacaoDocumentoEdi() {
		return this.situacaoDocumentoEdi;
	}

	public String getFluxoDocumentoEdi() {
		return this.fluxoDocumentoEdi;
	}

	/**
	 * 
	 * @param fluxoDocumentoEdi
	 */
	protected void setFluxoDocumentoEdi(String fluxoDocumentoEdi) {
		if(fluxoDocumentoEdi != "inboud" && fluxoDocumentoEdi != "outbound") {
			System.out.println("Fluxo do documento EDI invalido!");
			return;
		}
		this.fluxoDocumentoEdi = fluxoDocumentoEdi;
	}
	
}
