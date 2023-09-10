package com.pdv.domain.repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pdv.domain.model.Produto;

@Repository
public interface  ProdutoRepository  extends JpaRepository<Produto, Long>{

	
}
