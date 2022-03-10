
public class TestaMetodo {

	
	public static void main(String[] args) {
		
		DocumentoEdi documento = null;
		
		try {
			documento = new DocumentoEdi("xxx", "mercantil", "outbound");
			System.out.println("=====  Documento EDI  ====");
			System.out.println("Documento: " + documento.getNomeDocumentoEdi());
			System.out.println("Tipo: " + documento.getTipoDocumentoEdi());
			System.out.println("Fluxo: " + documento.getFluxoDocumentoEdi());
			System.out.println();
			
		} catch(ArithmeticException | NullPointerException ex) {
			String mensagem = ex.getMessage();
			System.out.println("Tratamento de Exception: " + mensagem);
			ex.printStackTrace();
			System.out.println();
		} catch(ExcecaoDocumentoEdi ex) {
			String mensagem = ex.getMessage();
			System.out.println("Tratamento de Exception: " + mensagem);
			ex.printStackTrace();
			System.out.println();
		}
		

//		try (CanalDeTransmissao canal = new CanalDeTransmissao(1, "Opentext")){
//			
//		}

		CanalDeTransmissao canal = null;
		try {
			canal = new CanalDeTransmissao(1, "Opentext");
			System.out.println("=====  Canal de Transmissão  ====");
			System.out.println("Canal: " + canal.getNomeCanal());
			System.out.println("Status: " + canal.getStatusCanal());
			System.out.println();
		}catch(Exception ex) {
			String mensagem = ex.getMessage();
			System.out.println("Tratamento de Exception: " + mensagem);
			ex.printStackTrace();
			System.out.println();
			
		}
		
		Empresa fornecedor = new Matriz(13, "Canuto Nunes Serv Med Ltda", "17394201000101", "1111111111111");
		System.out.println("=====  Fornecedor Principal  ====");
		System.out.println("Código: " + fornecedor.getCodigoEmpresa());
		System.out.println("Fornecedor: " + fornecedor.getNomeEmpresa());
		System.out.println("CNPJ: " + fornecedor.getCodigoCnpj());
		System.out.println("GLN: " + fornecedor.getCodigoGln());
		System.out.println("Situação: " + fornecedor.getSituacaoEmpresa());
		System.out.println();
		
		Filial filial = new Filial(13, "Canuto Nunes Serv Med Ltda", "17394201000202", "2222222222222", fornecedor);
		System.out.println("=====  Filial Fornecedor  ====");
		System.out.println("Código: " + filial.getCodigoEmpresa());
		System.out.println("Fornecedor: " + filial.getNomeEmpresa());
		System.out.println("CNPJ Matriz: " + filial.getEmpresaMatriz().getCodigoCnpj());
		System.out.println("GLN Matriz: " + filial.getEmpresaMatriz().getCodigoGln());
		System.out.println("CNPJ Filial: " + filial.getCodigoCnpj());
		System.out.println("GLN Filial: " + filial.getCodigoGln());
		System.out.println("Situação: " + filial.getSituacaoEmpresa());

		System.out.println();

		
		ParceriaEdi parceria = null;
		try {
			
			parceria = new ParceriaEdi(fornecedor, documento, canal);
			System.out.println("=====  Parceria EDI  ====");
			System.out.println("Fornecedor: " + parceria.getParceiro().getNomeEmpresa());
			System.out.println("Documento: " + parceria.getDocumento().getNomeDocumentoEdi());
			System.out.println("Canal: " + parceria.getCanal().getNomeCanal());
			System.out.println(parceria.getStatusParceria());
			System.out.println();
		} catch (Exception ex) {
			String mensagem = ex.getMessage();
			System.out.println("Tratamento de Exception: " + mensagem);
			ex.printStackTrace();
			
		}
		
		RegraIntercambio regra = new RegraIntercambio(parceria, "cbdx23", "22", "SSH", "orders.NNNNNNNNN.dat", "/home/prod/edi/pdanet/envia/", "/home/prod/edi/pdanet/remessa/", "/home/prod/edi/pdanet/backup/");
		System.out.println("=====  Regra EDI  ====");
		System.out.println("Documento: " + regra.getParceriaEdi().getDocumento().getNomeDocumentoEdi());
		System.out.println("Canal: " + regra.getParceriaEdi().getCanal().getNomeCanal());
		System.out.println("Servidor: " + regra.getServidor());
		System.out.println("Porta: " + regra.getPorta());
		System.out.println("Nomenclatura Arquivo: " + regra.getNomenclaturaArquivo());
		System.out.println("Protocolo: " + regra.getProtocolo());
		System.out.println("In: " + regra.getEnderecoInbound());
		System.out.println("Out: " + regra.getEnderecoOutbound());
		System.out.println("Backup: " + regra.getEnderecoBackup());
		
		try{
			canal.desativa(1);
		} catch (ExcecaoCanalDeTransmissao ex) {
			String mensagem = ex.getMessage();
			System.out.println("Tratamento de Exception: " + mensagem);
			ex.printStackTrace();
			
		}
		

	}

}
