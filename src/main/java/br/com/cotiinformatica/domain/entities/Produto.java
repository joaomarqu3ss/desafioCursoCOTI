package br.com.cotiinformatica.domain.entities;

import java.time.LocalDateTime;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "produto")
@Data
public class Produto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private UUID id;
	
	@Column(nullable = false)
	private String nome;
	
	@Column(nullable = false)
	private Double preco;
	
	@Column(nullable = false)
	private Integer quantidade;
	
	@Column(nullable = false)
	private LocalDateTime dataHoraCriacao;
}
