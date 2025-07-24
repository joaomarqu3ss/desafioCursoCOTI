package br.com.cotiinformatica.domain.exceptions;

@SuppressWarnings("serial")
public class ProdutoNaoEncontradoException extends RuntimeException {

	@Override
	public String getMessage() {
		
		return "Produto não encontrado. Por favor verifique o ID informado.";
	}
}
