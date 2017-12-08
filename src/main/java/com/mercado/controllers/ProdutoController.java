package com.mercado.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.mercado.models.Produto;
import com.mercado.repositories.ProdutoRepository;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {
	
	@Autowired
	private ProdutoRepository produtoRepository;
	
	@GetMapping
	public List<Produto> produtos(){
		return produtoRepository.findAll();
	}
	
	@PostMapping
	public String cadastrar (@RequestBody Produto produto) {
		
		produtoRepository.save(produto);

		
		return "Produto cadastrado";
	}
	
	@PutMapping
	public String atualizar(@RequestBody Produto produto) {
		produtoRepository.save(produto);
		
		return "Produto atualizado";
	}

	@DeleteMapping("/{id}")
	public String deletar(@PathVariable("id") String id){
		this.produtoRepository.delete(id);
		return "";

	}
	
}
