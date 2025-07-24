package br.com.cotiinformatica.repositories;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.cotiinformatica.domain.entities.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, UUID> {

	List<Produto> findAll();
	
}
