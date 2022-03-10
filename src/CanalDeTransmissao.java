
public class CanalDeTransmissao {

	private int codigoCanal;
	private String nomeCanal;
	private Status statusCanal;
	
	public CanalDeTransmissao(int codigoCanal, String nomeCanal) throws ExcecaoCanalDeTransmissao {
		this.codigoCanal = codigoCanal;
		this.nomeCanal = nomeCanal;
		this.statusCanal = Status.LIGADO;
	}
	
	public void altera(int codigoCanal, String nomeCanal) throws ExcecaoCanalDeTransmissao {
		this.nomeCanal = nomeCanal;
	}
	
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
