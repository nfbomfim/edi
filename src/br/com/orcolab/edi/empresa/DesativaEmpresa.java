package br.com.orcolab.edi.empresa;

/**
 * 
 * @author nfbom
 *
 */
public class DesativaEmpresa {

	public void desativa(Empresa empresa){
		
		empresa.desativa(empresa.getCodigoEmpresa());
	}
}
