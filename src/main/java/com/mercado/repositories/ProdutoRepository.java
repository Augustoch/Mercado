package com.mercado.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.mercado.models.Produto;

@RepositoryRestResource
public interface ProdutoRepository extends MongoRepository<Produto, String> {

	
	
}
