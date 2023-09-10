package com.pdv.domain.contoller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pdv.domain.model.Produto;
import com.pdv.domain.repository.ProdutoRepository;
import com.pdv.domain.service.ProdutoService;

@RestController
@RequestMapping("/produto")
public class ProdutoContoller {

	
	
	
@Autowired
private ProdutoService produtoservice;

//private ProdutoRepository rodutorepo;
@GetMapping
public List<Produto> listar(){
	
          	return produtoservice.listar   ();
}

	
}
