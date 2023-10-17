package com.pdv.domain.service;

import com.pdv.domain.exception.ProdutoNaoEncontradoException;
import com.pdv.domain.model.Produto;
import com.pdv.domain.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CadastroProdutoService {

	@Autowired
	private ProdutoRepository produtoRepository;
	
	@Transactional
	public Produto salvar(Produto produto) {
		return produtoRepository.save(produto);
	}
	
	public Produto buscarOuFalhar(Long produtoId) {
		return produtoRepository.findById(produtoId)
			.orElseThrow(() -> new ProdutoNaoEncontradoException(produtoId));
	}
	
}
