package br.com.cotiinformatica.domain.dtos;

import java.time.LocalDateTime;
import java.util.UUID;

public record ProdutoResponse(
		UUID id,
		String nome,
		Double preco,
		Integer quantidade,
		LocalDateTime dataHoraCriacao
		) {

}
