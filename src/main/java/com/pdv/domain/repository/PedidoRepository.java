package com.pdv.domain.repository;

import com.pdv.domain.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Long> {

//	@Query("from Pedido p join fetch p.cliente join fetch p.restaurante r join fetch r.cozinha")
//	List<Pedido> findAll();
	
}
