package br.com.cotiinformatica.controllers;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.cotiinformatica.domain.dtos.ProdutoRequest;
import br.com.cotiinformatica.domain.dtos.ProdutoResponse;
import br.com.cotiinformatica.domain.interfaces.ProdutoService;
import jakarta.validation.Valid;



@RestController
@RequestMapping("/api/v1/produtos")
public class ProdutoController {
	
	@Autowired ProdutoService service;
	
	@CrossOrigin
	@PostMapping()
	public ResponseEntity<ProdutoResponse> post(@RequestBody @Valid ProdutoRequest request) {
		
		var response = service.cadastrar(request);
		
		return ResponseEntity.ok(response);
		
	}
	
	@GetMapping
	public ResponseEntity<List<ProdutoResponse>> get() {
		
		var response = service.listarProdutos();
		
		return ResponseEntity.ok(response);
	}
	
}
