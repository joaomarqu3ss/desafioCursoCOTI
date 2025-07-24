package br.com.cotiinformatica.domain.interfaces;

import java.util.List;

import br.com.cotiinformatica.domain.dtos.ProdutoRequest;
import br.com.cotiinformatica.domain.dtos.ProdutoResponse;

public interface ProdutoService {
	
	ProdutoResponse cadastrar(ProdutoRequest request);
	
	List<ProdutoResponse> listarProdutos();
}
