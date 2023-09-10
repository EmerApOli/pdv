package com.pdv.domain.service;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.pdv.domain.model.Produto;
import com.pdv.domain.repository.ProdutoRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;


@Service
public class ProdutoService {
	
@Autowired
private ProdutoRepository produtorepository;


public List<Produto> listar(){
	
	return produtorepository.findAll();
}

}
