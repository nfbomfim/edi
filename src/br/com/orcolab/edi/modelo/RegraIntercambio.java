package br.com.orcolab.edi.modelo;

/**
 * 
 * @author nfbom
 *
 */
public class RegraIntercambio {

	private ParceriaEdi parceriaEdi;
	private String servidor;
	private String porta;
	private String protocolo;
	private String nomenclaturaArquivo;
	private String enderecoInbound;
	private String enderecoOutbound;
	private String enderecoBackup;
	
	/**
	 * 
	 * @param parceriaEdi
	 * @param servidor
	 * @param porta
	 * @param protocolo
	 * @param nomenclaturaArquivo
	 * @param enderecoIn
	 * @param enderecoOut
	 * @param enderecoBackup
	 */
	public RegraIntercambio(ParceriaEdi parceriaEdi, String servidor, String porta, String protocolo, String nomenclaturaArquivo, 
			String enderecoIn, String enderecoOut, String enderecoBackup) {
	
		setParceriaEdi(parceriaEdi);
		setServidor(servidor);
		setPorta(porta);
		setProtocolo(protocolo);
		setNomenclaturaArquivo(nomenclaturaArquivo);
		setEnderecoInbound(enderecoIn);
		setEnderecoOutbound(enderecoOut);
		setEnderecoBackup(enderecoBackup);
	}
	
	public ParceriaEdi getParceriaEdi() {
		return parceriaEdi;
	}
	public void setParceriaEdi(ParceriaEdi parceriaEdi) {
		this.parceriaEdi = parceriaEdi;
	}
	public String getServidor() {
		return servidor;
	}
	public void setServidor(String servidor) {
		this.servidor = servidor;
	}
	public String getPorta() {
		return porta;
	}
	public void setPorta(String porta) {
		this.porta = porta;
	}
	public String getProtocolo() {
		return protocolo;
	}
	private void setProtocolo(String protocolo) {
		this.protocolo = protocolo;
	}
	public String getEnderecoInbound() {
		return enderecoInbound;
	}
	private void setEnderecoInbound(String enderecoInbound) {
		this.enderecoInbound = enderecoInbound;
	}
	public String getEnderecoOutbound() {
		return enderecoOutbound;
	}
	private void setEnderecoOutbound(String enderecoOutbound) {
		this.enderecoOutbound = enderecoOutbound;
	}
	public String getEnderecoBackup() {
		return enderecoBackup;
	}
	private void setEnderecoBackup(String enderecoBackup) {
		this.enderecoBackup = enderecoBackup;
	}

	public String getNomenclaturaArquivo() {
		return nomenclaturaArquivo;
	}

	private void setNomenclaturaArquivo(String nomenclaturaArquivo) {
		this.nomenclaturaArquivo = nomenclaturaArquivo;
	}
	
	
}
