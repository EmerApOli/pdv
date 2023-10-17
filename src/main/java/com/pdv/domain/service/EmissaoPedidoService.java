package com.pdv.domain.service;

import com.pdv.domain.exception.PedidoNaoEncontradoException;
import com.pdv.domain.model.Pedido;
import com.pdv.domain.model.Produto;
import com.pdv.domain.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EmissaoPedidoService {

	@Autowired
	private PedidoRepository pedidoRepository;





	@Autowired
	private CadastroProdutoService cadastroProduto;



	@Transactional
	public Pedido emitir(Pedido pedido) {
		validarPedido(pedido);
		validarItens(pedido);
        pedido.calcularDesconto();
		pedido.setTaxaFrete(pedido.getTaxaFrete());
		pedido.calcularValorTotal();

		return pedidoRepository.save(pedido);
	}

	private void validarPedido(Pedido pedido) {




	}

	private void validarItens(Pedido pedido) {
		pedido.getItens().forEach(item -> {
			Produto produto = cadastroProduto.buscarOuFalhar(
					item.getProduto().getId());
			
			item.setPedido(pedido);
			item.setProduto(produto);
			item.setPrecoUnitario(produto.getPreco());
		});
	}
	
	public Pedido buscarOuFalhar(Long pedidoId) {
		return pedidoRepository.findById(pedidoId)
			.orElseThrow(() -> new PedidoNaoEncontradoException(pedidoId));
	}

}
