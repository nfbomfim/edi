package br.com.orcolab.edi.modelo;

import br.com.orcolab.edi.empresa.Empresa;

/**
 * 
 * @author nfbom
 *
 */
public class ParceriaEdi {

	private Empresa parceiro;
	private DocumentoEdi documento;
	private CanalDeTransmissao canal;
	private Status statusParceria;
	
	/**
	 * 
	 * @param parceiro
	 * @param documento
	 * @param canal
	 */
	public ParceriaEdi(Empresa parceiro, DocumentoEdi documento, CanalDeTransmissao canal) {
		setParceiro(parceiro);
		setDocumento(documento);
		setCanal(canal);
		setStatusParceria();
		
	}
	
	public void mimigraCanalParceria(Empresa parceiro, DocumentoEdi documento, CanalDeTransmissao canal, CanalDeTransmissao canalDestino) {
		setCanal(canalDestino);
		
	}
	
	public void desativaParceria(Empresa parceiro, DocumentoEdi documento, CanalDeTransmissao canal) {
		this.statusParceria = Status.DESLIGADO;
		
	}

	public Empresa getParceiro() {
		return this.parceiro;
	}

	public DocumentoEdi getDocumento() {
		return this.documento;
	}

	public CanalDeTransmissao getCanal() {
		return this.canal;
	}

	public Status getStatusParceria() {
		return this.statusParceria;
	}

	private void setParceiro(Empresa parceiro) {
		this.parceiro = parceiro;
	}

	private void setDocumento(DocumentoEdi documento) {
		this.documento = documento;
	}

	private void setCanal(CanalDeTransmissao canal) {
		this.canal = canal;
	}

	private void setStatusParceria() {
		this.statusParceria = Status.LIGADO;
	}

	
}
