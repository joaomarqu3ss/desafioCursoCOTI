package br.com.cotiinformatica.domain.dtos;

public record ProdutoRequest(
		String nome,
		Double preco,
		Integer quantidade
		) {

}
