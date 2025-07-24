package br.com.cotiinformatica.domain.services;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.cotiinformatica.domain.dtos.ProdutoRequest;
import br.com.cotiinformatica.domain.dtos.ProdutoResponse;
import br.com.cotiinformatica.domain.entities.Produto;
import br.com.cotiinformatica.domain.interfaces.ProdutoService;
import br.com.cotiinformatica.repositories.ProdutoRepository;

@Service
public class ProdutoServiceImpl implements ProdutoService {

	@Autowired ProdutoRepository repository;
	
	
	@Override
	public ProdutoResponse cadastrar(ProdutoRequest request) {
		
		var produto = new Produto();
		produto.setNome(request.nome());
		produto.setPreco(request.preco());
		produto.setQuantidade(request.quantidade());
		produto.setDataHoraCriacao(LocalDateTime.now());
		
		repository.save(produto);
		
		return copyToResponse(produto);
	}

	@Override
	public List<ProdutoResponse> listarProdutos() {
		var produtos = repository.findAll();
		
		return produtos.stream()
				.map(this::copyToResponse)
				.toList();
	}
	
	private ProdutoResponse copyToResponse(Produto prod) {
		return new ProdutoResponse(
				prod.getId(),
				prod.getNome(),
				prod.getPreco(),
				prod.getQuantidade(),
				prod.getDataHoraCriacao()
				);
	}
	
}
